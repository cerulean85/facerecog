package com.kkennib.facerecog.ui.main

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.*
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.OrientationEventListener
import android.widget.Toast
import androidx.activity.viewModels
import androidx.camera.core.ImageCapture
import androidx.camera.core.ImageProxy
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.kkennib.facerecog.R
import com.kkennib.facerecog.camerax.CameraManager
import com.kkennib.facerecog.camerax.GraphicOverlay
import com.kkennib.facerecog.databinding.ActivityRealtimeRecogBinding
import com.kkennib.facerecog.util.*
import com.kkennib.facerecog.vision.face_detection.FaceContourGraphic
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_realtime_recog.*
import java.io.ByteArrayOutputStream
import kotlin.concurrent.thread

class RealtimeRecogActivity : BaseActivity() {

    private val binding by binding<ActivityRealtimeRecogBinding>(R.layout.activity_realtime_recog)
    private val viewModel: RealtimeRecogViewModel by viewModels()
    private lateinit var cameraManager: CameraManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        createCameraManager()
        binding.apply {
            lifecycleOwner = this@RealtimeRecogActivity
            viewModel = this@RealtimeRecogActivity.viewModel
            initViewModel()

            runOnUiThread {
                iv_enrolled_user.setImageBitmap(MainActivity.profileBitmap)
            }
        }
        if (allPermissionsGranted()) {
            cameraManager.startCamera()
        } else {
            ActivityCompat.requestPermissions(
                this,
                RealtimeRecogActivity.REQUIRED_PERMISSIONS,
                RealtimeRecogActivity.REQUEST_CODE_PERMISSIONS
            )
        }
        Network.executeRecognitionFace()
    }

    override fun onRequestPermissionsResult(
        requestCode: Int, permissions: Array<String>, grantResults:
        IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == RealtimeRecogActivity.REQUEST_CODE_PERMISSIONS) {
            if (allPermissionsGranted()) {
                cameraManager.startCamera()
            } else {
                Toast.makeText(this, "Permissions not granted by the user.", Toast.LENGTH_SHORT)
                    .show()
                finish()
            }
        }
    }

    private fun initViewModel() {
        viewModel.apply {
            onFabButtonEvent.observe(::getLifecycle) {
                it?.let {
                    binding.fabFinder.transform()
                    cameraManager.changeCameraSelector()
                }
            }
        }
    }

    private fun createCameraManager() {

        val action = { profileImg: Image, imageRect:Rect, boundingBox: Rect ->

                runOnUiThread {
//                Thread.sleep(1000)
                    val orgProfileBitmapWidth = profileImg.height
                    val orgProfileBitmapHeight = profileImg.width
                    val profileBitmap = Utils.getProfileBitmap(profileImg, imageRect, false)
//                val profileCompressedBitmapByteArr = Utils.getCompressedBitmapByteArray(profileBitmap)
//                val profileCompressedBitmap = Utils.getBitmapFromByteArray(profileCompressedBitmapByteArr)
                    val faceBitmap = profileBitmap?.let {
                        Utils.getRealtimeFaceBitmap(it, boundingBox)
                    }
                    val faceCompressedBitmapByteArr = Utils.getCompressedBitmapByteArray(faceBitmap)

                    val success = { data: ConnData ->
                        runOnUiThread {
                            tv_similarity.text = data.similarity.toString()
                        }
                    }

                    val error = { data: ConnData ->
//                    runOnUiThread {
//                        Toast.makeText(this, "얼굴을 검출할 수 없습니다.", Toast.LENGTH_SHORT).show()
//                    }
                    }

                    Network.addRecognitionObject(
                        faceCompressedBitmapByteArr,
                        ConnData(user_id = MainActivity.user_id, uuid = MainActivity.uuid),
                        success,
                        error
                    )
                }
        }

        cameraManager = CameraManager(
            this,
            binding.previewViewFinder,
            this,
            binding.graphicOverlayFinder,
            action
        )
    }

    private fun imageToBitmapSaveGallery(image: Image) {
        image.imageToBitmap()
            ?.rotateFlipImage(
                cameraManager.rotation,
                cameraManager.isFrontMode()
            )
            ?.scaleImage(
                binding.previewViewFinder,
                cameraManager.isHorizontalMode()
            )
            ?.let { bitmap ->
                binding.graphicOverlayFinder.processCanvas.drawBitmap(
                    bitmap,
                    0f,
                    bitmap.getBaseYByView(
                        binding.graphicOverlayFinder,
                        cameraManager.isHorizontalMode()
                    ),
                    Paint().apply {
                        xfermode = PorterDuffXfermode(PorterDuff.Mode.DST_OVER)
                    })
                binding.graphicOverlayFinder.processBitmap.saveToGallery(this@RealtimeRecogActivity)
            }
    }

    private fun setOrientationEvent() {
        val orientationEventListener = object : OrientationEventListener(this as Context) {
            override fun onOrientationChanged(orientation: Int) {
                val rotation: Float = when (orientation) {
                    in 45..134 -> 270f
                    in 135..224 -> 180f
                    in 225..314 -> 90f
                    else -> 0f
                }
                cameraManager.rotation = rotation
            }
        }
        orientationEventListener.enable()
    }

    private fun allPermissionsGranted() = REQUIRED_PERMISSIONS.all {
        ContextCompat.checkSelfPermission(baseContext, it) == PackageManager.PERMISSION_GRANTED
    }

    companion object {
        lateinit var prefs: PreferenceUtil
        private const val REQUEST_CODE_PERMISSIONS = 10
        private val REQUIRED_PERMISSIONS = arrayOf(
            android.Manifest.permission.CAMERA,
            android.Manifest.permission.READ_EXTERNAL_STORAGE,
            android.Manifest.permission.WRITE_EXTERNAL_STORAGE
        )
        lateinit var profileByteArr: ByteArray
        lateinit var boundingBox: Rect
        var processing = false
    }
}