package com.kkennib.facerecog.ui.main

//import io.socket.client.IO
//import io.socket.client.Socket
//import io.socket.client.Socket.EVENT_CONNECT_ERROR
//import io.socket.emitter.Emitter
//import io.socket.engineio.client.EngineIOException
//import okhttp3.OkHttpClient
//import okhttp3.Request
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Matrix
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.widget.Toast
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import com.kkennib.facerecog.R
import com.kkennib.facerecog.databinding.ActivityMainBinding
import com.kkennib.facerecog.util.ConnData
import com.kkennib.facerecog.util.Network
import kotlinx.android.synthetic.main.activity_main.*
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

        val data = ConnData(uuid = uuid)
        val action = { data: ConnData ->
            runOnUiThread {
                tv_user_name.text = data.name
                tv_user_uuid.text = uuid
                var profileBitmap = data.profile_bitmap
                if (profileBitmap != null) {
                    val matrix = Matrix()
//                    matrix.postRotate(-90f)
                    profileBitmap =
                        Bitmap.createBitmap(
                            profileBitmap, 0, 0,
                            profileBitmap.width, profileBitmap.height, matrix, true
                        )

                    MainActivity.user_id = data.user_id
                    MainActivity.profileBitmap = profileBitmap
                    user_profile_img.setImageBitmap(MainActivity.profileBitmap)
                }

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
            onClickButtonFaceEnrollEvent.observe(::getLifecycle) {
                val nextIntent = Intent(this@MainActivity, RecogActivity::class.java)
                startActivity(nextIntent)
            }
            onClickButtonFaceRecogEvent.observe(::getLifecycle) {
                val nextIntent = Intent(this@MainActivity, RealtimeRecogActivity::class.java)
                startActivity(nextIntent)
            }
            onClickButtonFaceRemoveEvent.observe(::getLifecycle) {
                Network.deleteUserInfo(
                    ConnData(user_id=MainActivity.user_id),
                    {
                            data:ConnData ->
                        runOnUiThread {
                            Toast.makeText(this@MainActivity, "사용자 정보를 삭제하였습니다.", Toast.LENGTH_SHORT).show()

                            finish() //인텐트 종료
                            overridePendingTransition(0, 0) //인텐트 효과 없애기
                            val intent = intent //인텐트
                            startActivity(intent) //액티비티 열기
                            overridePendingTransition(0, 0) //인텐트 효과 없애기

                        }
                    },
                    {
                            data:ConnData ->
                        runOnUiThread {
                            Toast.makeText(this@MainActivity, "일치하는 사용자 정보가 존재하지 않습니다.", Toast.LENGTH_SHORT).show()
                        }
                    }
                )
            }

            onClickButtonSocketTestConnectEvent.observe(::getLifecycle) {
                thread(start=true) {

                }

                runOnUiThread {
                    Toast.makeText(this@MainActivity, "Socket Connected", Toast.LENGTH_SHORT).show()
                }
            }

            onClickButtonSocketTestSendEvent.observe(::getLifecycle) {
                runOnUiThread {
                    Toast.makeText(this@MainActivity, "To test Socket!!", Toast.LENGTH_SHORT).show()
                }


            }

            onClickButtonSocketTestDisconnectEvent.observe(::getLifecycle) {
                thread(start=true) {
//                    outStream.close()
//                    inStream.close()
//                    socket.close()
                }

                runOnUiThread {
                    Toast.makeText(this@MainActivity, "Socket Disconnected", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    companion object {
        var user_id: Int = 0
        var uuid: String = ""
        var galleryPath: String = ""
        var name: String = ""

        //        lateinit var socket: Socket
//        lateinit var outStream: OutputStream
//        lateinit var inStream: InputStream
        lateinit var profileBitmap: Bitmap

    }

}