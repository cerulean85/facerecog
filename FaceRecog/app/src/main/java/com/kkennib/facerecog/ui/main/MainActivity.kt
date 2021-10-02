package com.kkennib.facerecog.ui.main

import com.kkennib.facerecog.R
import com.kkennib.facerecog.databinding.ActivityMainBinding

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Matrix
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.widget.Toast
import androidx.activity.viewModels
import com.kkennib.facerecog.util.*
//import io.socket.client.IO
//import io.socket.client.Socket
//import io.socket.client.Socket.EVENT_CONNECT_ERROR
//import io.socket.emitter.Emitter
//import io.socket.engineio.client.EngineIOException
//import okhttp3.OkHttpClient
//import okhttp3.Request
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : BaseActivity() {

    private val binding by binding<ActivityMainBinding>(R.layout.activity_main)
    private val viewModel: MainViewModel by viewModels()

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        galleryPath = this@MainActivity.getExternalFilesDir(Environment.DIRECTORY_DCIM)!!.absolutePath
        uuid = UUID.randomUUID().toString()

        val data = ConnData(uuid = uuid)
        val action = { data: ConnData ->
            runOnUiThread {
                tv_user_name.text = data.name
                tv_user_uuid.text = uuid
                var profileBitmap = data.profile_bitmap
                if (profileBitmap != null) {
                    val matrix = Matrix()
                    matrix.postRotate(90f)
                    profileBitmap =
                        Bitmap.createBitmap(
                            profileBitmap, 0, 0,
                            profileBitmap.width, profileBitmap.height, matrix, true
                        )
                }

                user_profile_img.setImageBitmap(profileBitmap)
                Toast.makeText(this@MainActivity, "SUCCESS!!", Toast.LENGTH_SHORT).show()
            }
        }
        val error = { data: ConnData ->
            runOnUiThread {
                Toast.makeText(this@MainActivity, data.error_message, Toast.LENGTH_SHORT).show()
            }
        }

        Network.selectUserInfo(data, action, error)

        binding.apply {
            lifecycleOwner = this@MainActivity
            viewModel = this@MainActivity.viewModel
            initViewModel()
        }
    }

    private fun initViewModel() {
        viewModel.apply {
            onClickButtonFaceRecogEvent.observe(::getLifecycle) {
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
        var user_id: Int = 0
        var uuid: String = ""
        var galleryPath: String = ""
        var name: String = ""

    }

}