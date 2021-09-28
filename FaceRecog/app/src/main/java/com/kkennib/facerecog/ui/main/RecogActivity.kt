package com.kkennib.facerecog.ui.main

import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.Paint
import android.graphics.PorterDuff
import android.graphics.PorterDuffXfermode
import android.media.Image
import android.os.Bundle
import android.util.Log
import android.view.OrientationEventListener
import android.widget.Toast
import androidx.activity.viewModels
import androidx.camera.core.ImageCapture
import androidx.camera.core.ImageProxy
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.kkennib.facerecog.R
import com.kkennib.facerecog.camerax.CameraManager
import com.kkennib.facerecog.databinding.ActivityRecogBinding
import com.kkennib.facerecog.util.*
import kotlinx.coroutines.delay
import java.lang.Exception
import java.net.Socket

class RecogActivity : BaseActivity() {

    private val binding by binding<ActivityRecogBinding>(R.layout.activity_recog)
    private val viewModel: RecogViewModel by viewModels()
    private lateinit var cameraManager: CameraManager

    override fun onCreate(savedInstanceState: Bundle?) {
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

//        thread(start = true) {
//
//            try {
//                val socket = Socket("192.168.0.21", 5000)
//                val outStream = socket.outputStream
//                val inStream = socket.inputStream
//
//                val data = "TTEST"
//                outStream.write(data.toByteArray())
//                sleep(500)
//
//                val available = inStream.available()
//                print("available" + available)
//                if (available > 0) {
//                    val dataArr = ByteArray(available) // 사이즈에 맞게 byte array를 만듭니다.
//                    inStream.read(dataArr) // byte array에 데이터를 씁니다.
//                    val data = String(dataArr) // byte array의 데이터를 통해 String을 만듭니다.
//                    println("data : $data")
//                }
//            } catch (e: Exception) {
//                e.message?.let { Log.e("MainActivity", it) }
//            }
//
//        }


//        socketTest()
    }

    suspend fun socketClient() {
        try {
            val socket = Socket("192.168.0.21", 5000)
            val outStream = socket.outputStream
            val inStream = socket.inputStream

            val data = "TTEST"
            outStream.write(data.toByteArray())
            delay(3000L)
            val available = inStream.available()
            print("available" + available)
            if (available > 0) {
                val dataArr = ByteArray(available) // 사이즈에 맞게 byte array를 만듭니다.
                inStream.read(dataArr) // byte array에 데이터를 씁니다.
                val data = String(dataArr) // byte array의 데이터를 통해 String을 만듭니다.
                println("data : $data")
            }
        } catch (e: Exception) {
            e.message?.let { Log.e("MainActivity", it) }
        }
    }


//    lateinit var mSocket: Socket
//    fun socketTest() {
//
//        try {
//            //IO.socket 메소드는 은 저 URL 을 토대로 클라이언트 객체를 Return 합니다.
//            mSocket = IO.socket("http://192.168.0.21:5000")
//            mSocket.connect()
//            Log.d("Connected", "OK")
//        } catch (e: URISyntaxException) {
//            Log.e("MainActivity", e.reason)
//        }
//
////        mSocket.on(Socket.EVENT_CONNECT, onConnect);
//
//        mSocket.on(io.socket.client.Socket.EVENT_CONNECT) {
//            // 소켓 서버에 연결이 성공하면 호출됩니다.
//            Log.i("Socket", "Connect")
//        }.on(io.socket.client.Socket.EVENT_DISCONNECT) { args ->
//            // 소켓 서버 연결이 끊어질 경우에 호출됩니다.
//            Log.i("Socket", "Disconnet: ${args[0]}")
//        }.on(EVENT_CONNECT_ERROR) { args ->
//            // 소켓 서버 연결 시 오류가 발생할 경우에 호출됩니다.
//            var errorMessage = ""
//            if (args[0] is EngineIOException) {
////                val err = args[0]
////                errorMessage = "code: ${err.code}  message: ${err.message}"
//                Log.e("Fila", "qwfqwf")
//            }
//            Log.i("Socket", "Connect Error: $args")
//        }
//
//        // 데이터 전송
//        // "message"는 소켓 서버에 전달할 Event 명 입니다.
//        val data = "Hello World"
//        mSocket?.emit("message", data)
//
//    }
//
//    val onConnect = Emitter.Listener {
//        mSocket.emit("message", "messagemessagemessagemessageokok")
//    }

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
            onItemSelectedEvent.observe(::getLifecycle) {
                cameraManager.changeAnalyzer(it)
            }
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
        cameraManager = CameraManager(
            this,
            binding.previewViewFinder,
            this,
            binding.graphicOverlayFinder
        )
    }

    private fun takePicture() {
        // shutter effect
        Toast.makeText(this, "take a picture!", Toast.LENGTH_SHORT).show()
        setOrientationEvent()

        cameraManager.imageCapture.takePicture(
            cameraManager.cameraExecutor,
            object : ImageCapture.OnImageCapturedCallback() {
                @SuppressLint("UnsafeExperimentalUsageError", "RestrictedApi",
                    "UnsafeOptInUsageError"
                )
                override fun onCaptureSuccess(image: ImageProxy) {
                    image.image?.let {
                        imageToBitmapSaveGallery(it)
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
        private const val REQUEST_CODE_PERMISSIONS = 10
        private val REQUIRED_PERMISSIONS = arrayOf(
            android.Manifest.permission.CAMERA,
            android.Manifest.permission.READ_EXTERNAL_STORAGE,
            android.Manifest.permission.WRITE_EXTERNAL_STORAGE
        )
    }
}