package com.kkennib.facerecog.ui.main

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.*
import android.media.Image
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
import com.kkennib.facerecog.databinding.ActivityRecogBinding
import com.kkennib.facerecog.util.*
import com.kkennib.facerecog.vision.face_detection.FaceContourGraphic
import java.io.ByteArrayOutputStream


class RecogActivity : BaseActivity() {

    private val binding by binding<ActivityRecogBinding>(R.layout.activity_recog)
    private val viewModel: RecogViewModel by viewModels()
    private lateinit var cameraManager: CameraManager

    override fun onCreate(savedInstanceState: Bundle?) {
        prefs = PreferenceUtil(applicationContext)
        super.onCreate(savedInstanceState)

        createCameraManager()
        binding.apply {
            lifecycleOwner = this@RecogActivity
            viewModel = this@RecogActivity.viewModel
            initViewModel()
        }
        if (allPermissionsGranted()) {
            cameraManager.startCamera()
        } else {
            ActivityCompat.requestPermissions(
                this,
                REQUIRED_PERMISSIONS,
                REQUEST_CODE_PERMISSIONS
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int, permissions: Array<String>, grantResults:
        IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_CODE_PERMISSIONS) {
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
//            onItemSelectedEvent.observe(::getLifecycle) {
//                cameraManager.changeAnalyzer(it)
//            }
            onFabButtonEvent.observe(::getLifecycle) {
                it?.let {
                    binding.fabFinder.transform()
                    cameraManager.changeCameraSelector()
                }
            }
            onShutterButtonEvent.observe(::getLifecycle) {
                it?.let { takePicture() }
            }
        }
    }

    private fun createCameraManager() {

        val action = { image: Image, imageRect:Rect, boundingBox: Rect ->
//            runOnUiThread {
//                Toast.makeText(this@RecogActivity, "Test OK!!", Toast.LENGTH_LONG).show()
//            }
        }

        cameraManager = CameraManager(
            this,
            binding.previewViewFinder,
            this,
            binding.graphicOverlayFinder,
            action
        )
    }

    private fun takePicture() {
        // shutter effect
        Toast.makeText(this, "take a picture!", Toast.LENGTH_SHORT).show()
        setOrientationEvent()

        val action =  { profileImg: Image, imageRect:Rect, boundingBox: Rect ->
            runOnUiThread {
                Toast.makeText(this, "얼굴이 검출되었습니다.", Toast.LENGTH_SHORT).show()

                val orgProfileBitmapWidth = profileImg.height
                val orgProfileBitmapHeight = profileImg.width
                val profileBitmap = Utils.getProfileBitmap(profileImg, imageRect, true)
                val profileCompressedBitmapByteArr = Utils.getCompressedBitmapByteArray(profileBitmap)
                val profileCompressedBitmap = Utils.getBitmapFromByteArray(profileCompressedBitmapByteArr)
                val faceBitmap = profileCompressedBitmap?.let {
                    Utils.getFaceBitmap(it, orgProfileBitmapWidth, orgProfileBitmapHeight,
                        boundingBox, imageRect)
                }
                val faceCompressedBitmapByteArr = Utils.getCompressedBitmapByteArray(faceBitmap)
                val faceCompressedBitmap = Utils.getBitmapFromByteArray(faceCompressedBitmapByteArr)

                if (profileCompressedBitmap != null) {
                    RecogActivity.profileBitmap = profileCompressedBitmap
                }
                if (faceCompressedBitmap != null) {
                    RecogActivity.faceBitmap = faceCompressedBitmap
                }
                RecogActivity.boundingBox = boundingBox

                val nextIntent = Intent(this, EnrolluserActivity::class.java)
                startActivity(nextIntent)

            }
        }

        val error = {
            runOnUiThread {
                Toast.makeText(this, "얼굴을 검출할 수 없습니다.", Toast.LENGTH_SHORT).show()
            }
        }

        cameraManager.imageCapture.takePicture(
            cameraManager.cameraExecutor,
            object : ImageCapture.OnImageCapturedCallback() {
                @SuppressLint("UnsafeExperimentalUsageError", "RestrictedApi",
                    "UnsafeOptInUsageError"
                )
                override fun onCaptureSuccess(image: ImageProxy) {
                    val graphics = binding.graphicOverlayFinder.graphics
                    if (graphics.count() == 0) {
                        error()
                    } else {
                        for (graphic: GraphicOverlay.Graphic in graphics) {
                            val faceGraphic = graphic as FaceContourGraphic
                            val imageRect = faceGraphic.imageRect
                            val boundingBox = faceGraphic.face.boundingBox
                            action(image.image!!, imageRect, boundingBox)
                            image.image?.let {
                                imageToBitmapSaveGallery(image.image!!)
                            }
                        }
                    }
                    super.onCaptureSuccess(image)
                }
            })
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
                binding.graphicOverlayFinder.processBitmap.saveToGallery(this@RecogActivity)
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
        //        lateinit var profileByteArr: ByteArray
//        lateinit var faceByteArr: ByteArray
        lateinit var profileBitmap: Bitmap
        lateinit var faceBitmap: Bitmap
        lateinit var boundingBox: Rect
    }
}