package com.kkennib.facerecog.ui.main

import android.widget.Toast
import com.kkennib.facerecog.R
import com.kkennib.facerecog.databinding.ActivityMainBinding

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Paint
import android.graphics.PorterDuff
import android.graphics.PorterDuffXfermode
import android.media.Image
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.view.OrientationEventListener
import androidx.activity.viewModels
import androidx.camera.core.ImageCapture
import androidx.camera.core.ImageProxy
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.kkennib.facerecog.util.*
import com.kkennib.facerecog.camerax.CameraManager
import java.net.Socket
//import io.socket.client.IO
//import io.socket.client.Socket
//import io.socket.client.Socket.EVENT_CONNECT_ERROR
//import io.socket.emitter.Emitter
//import io.socket.engineio.client.EngineIOException
//import okhttp3.OkHttpClient
//import okhttp3.Request
import java.net.URISyntaxException
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import android.telephony.TelephonyManager
import androidx.annotation.RequiresApi
import kotlinx.coroutines.delay
import java.lang.Exception
import java.lang.Thread.sleep
import java.util.*
import kotlin.concurrent.thread


class MainActivity : BaseActivity() {

    private val binding by binding<ActivityMainBinding>(R.layout.activity_main)
    private val viewModel: MainViewModel by viewModels()

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        galleryPath = this@MainActivity.getExternalFilesDir(Environment.DIRECTORY_DCIM)!!.absolutePath
        uuid = UUID.randomUUID().toString()


        binding.apply {
            lifecycleOwner = this@MainActivity
            viewModel = this@MainActivity.viewModel
            initViewModel()
        }
    }

    private fun initViewModel() {
        viewModel.apply {
            onClickButtonFaceRecogEvent.observe(::getLifecycle) {
//                Toast.makeText(this@MainActivity, "Example", Toast.LENGTH_LONG).show()
                val nextIntent = Intent(this@MainActivity, RecogActivity::class.java)
                startActivity(nextIntent)
            }
            onClickButtonFaceEnrollEvent.observe(::getLifecycle) {
                val nextIntent = Intent(this@MainActivity, RecogActivity::class.java)
                startActivity(nextIntent)
            }
        }
    }

    companion object {
        var uuid: String = ""
        var galleryPath: String = ""
    }

}