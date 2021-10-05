package com.kkennib.facerecog.util

import android.graphics.*
import android.util.Base64
import com.google.android.gms.common.util.Base64Utils
import com.google.gson.Gson
import com.kkennib.facerecog.ui.main.RealtimeRecogActivity
import com.kkennib.facerecog.vision.face_detection.FaceContourDetectionProcessor
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import okhttp3.*
import okio.buffer
import okio.sink
import okio.source
import java.io.ByteArrayOutputStream
import java.net.Socket
import java.security.DigestException
import java.security.MessageDigest
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread

data class ConnData(
    val is_success: Boolean = false,
    val error_message: String = "",
    val user_id: Int = 0,
    val uuid: String = "",
    val name: String = "",
    var profile_img: String = "",
    var face_img: String = "",
    val tolerance: Float = 0.0f,
    val similarity: Float = 0.0f,
    val image: String = "",
    val message: String = "",
    var profile_bitmap: Bitmap? = null
)

class Network {

    companion object {

        //        "http://15.165.101.124:5000/test"
        val serverIP = "http://192.168.219.101:5000/"
        val mediaType = "application/json; charset=utf-8"
        var recognitionObjQueue: Queue<()->Unit> = LinkedList()

        fun request(
            requestType: String,
            data: ConnData,
            action: (ConnData) -> Unit,
            error: (ConnData) -> Unit
        ) {
            thread(start = true) {
                try {
                    val client = OkHttpClient()
                    val gson = Gson()
                    val json = gson.toJson(data)

                    val request = Request.Builder()
                        .url(serverIP + requestType)
                        .post(RequestBody.create(MediaType.parse(mediaType), json))
                        .build()

                    val response = client.newCall(request).execute()
                    val bodyStr = response.body()?.string()
                    val result = gson.fromJson(bodyStr, ConnData::class.java)
                    val profileByteArr = Base64.decode(result.profile_img, Base64.NO_WRAP)
                    result.profile_bitmap = BitmapFactory.decodeByteArray(profileByteArr, 0, profileByteArr.size)
                    if (result.is_success) action(result)
                    else error(result)

                } catch (e: Exception) {
                    error(ConnData(error_message = e.toString()))
                }
            }
        }

        fun non_thread_request(
            requestType: String,
            data: ConnData,
            action: (ConnData) -> Unit,
            error: (ConnData) -> Unit
        ) {
            try {
                val client = OkHttpClient()
                val gson = Gson()
                val json = gson.toJson(data)

                val request = Request.Builder()
                    .url(serverIP + requestType)
                    .post(RequestBody.create(MediaType.parse(mediaType), json))
                    .build()

                val response = client.newCall(request).execute()
                val bodyStr = response.body()?.string()
                val result = gson.fromJson(bodyStr, ConnData::class.java)
                val profileByteArr = Base64.decode(result.profile_img, Base64.NO_WRAP)
                result.profile_bitmap = BitmapFactory.decodeByteArray(profileByteArr, 0, profileByteArr.size)
                if (result.is_success) action(result)
                else error(result)

//                RealtimeRecogActivity.processing = false

            } catch (e: Exception) {
                error(ConnData(error_message = e.toString()))
            }
        }

        fun selectUserInfo(data: ConnData, action: (ConnData) -> Unit, error: (ConnData) -> Unit) {

            val job = GlobalScope.launch() {

            }

            runBlocking {
                job.join()
                request("select_user_info", data, action, error)
//                thread(start = true) {
//
//
//
//                }
//                    try {
//                        val client = OkHttpClient()
//                        val gson = Gson()
//                        val json = gson.toJson(data)
//
//                        val request = Request.Builder()
//                            .url(serverIP + "select_user_info")
//                            .post(RequestBody.create(MediaType.parse(mediaType), json))
//                            .build()
//
//                        val response = client.newCall(request).execute()
//                        val bodyStr = response.body()?.string()
//                        val result = gson.fromJson(bodyStr, ConnData::class.java)
//                        action(result)
//                    } catch (e: Exception) {
//                        e.printStackTrace()
//                    }
            }
        }

        fun insertUserInfo(
            profileBitmap: Bitmap,
            faceBitmap: Bitmap,
            boundingBox: Rect,
            data: ConnData,
            action: (ConnData) -> Unit,
            error: (ConnData) -> Unit
        ) {

            var serializedProfile = ""
            var serializedFace = ""
            val job = GlobalScope.launch() {

                val ostreamProfile = ByteArrayOutputStream()
                profileBitmap.compress(Bitmap.CompressFormat.JPEG, 100, ostreamProfile)
                serializedProfile = Base64.encodeToString(ostreamProfile.toByteArray(), Base64.NO_WRAP)
                ostreamProfile.close()

                val ostreamFace = ByteArrayOutputStream()
                faceBitmap.compress(Bitmap.CompressFormat.JPEG, 100, ostreamFace)
                serializedFace = Base64.encodeToString(ostreamFace.toByteArray(), Base64.NO_WRAP)
                ostreamFace.close()
            }

            runBlocking {
                job.join()
                data.profile_img = serializedProfile
                data.face_img = serializedFace
                request("insert_user_info", data, action, error)
            }
        }

        fun deleteUserInfo(
            data: ConnData,
            action: (ConnData) -> Unit,
            error: (ConnData) -> Unit
        ) {
            val job = GlobalScope.launch() {

            }

            runBlocking {
                job.join()
                request("delete_user_info", data, action, error)
            }
        }

        fun encodeSHA256(input: String): String{
            val hash: ByteArray
            try{
                val md = MessageDigest.getInstance("SHA-256")
                md.update(input.toByteArray())
                hash = md.digest()
            }catch (e: CloneNotSupportedException){
                throw DigestException("couldn't make digest of patial content")
            }
            return Base64Utils.encode(hash)
        }

        fun addRecognitionObject(
            faceByteArr: ByteArray,
            data: ConnData,
            action: (ConnData) -> Unit,
            error: (ConnData) -> Unit) {

            val a = {
//                val job = GlobalScope.launch() {
//
//                }
//
//                runBlocking {
//                    job.join()
                val serializedBitmap = Base64.encodeToString(faceByteArr, Base64.DEFAULT)
                data.face_img = serializedBitmap
                non_thread_request("recognize_face", data, action, error)
//
//                val ip = "192.168.219.101"
//                val port = 5001
//                val socket = Socket(ip, port)
//                val sink = socket.sink().buffer()
//                sink.timeout().timeout(60, TimeUnit.SECONDS)
//                val source = socket.source().buffer()
//                source.timeout().timeout(60, TimeUnit.SECONDS)
////                sink.write(faceByteArr, 0, faceByteArr.size)
////                sink.writeInt(data.face_img)
////                sink.writeUtf8(data.user_id.toString() + "\n")
//
//                val cnt = data.face_img.count()
//                sink.writeUtf8(cnt.toString() + "##" + data.face_img + "\n")
//                sink.flush()
//                println(source.readUtf8Line())
//                source.close()
//                sink.close()
//                socket.close()
//                    }

//                }
            }

            if (recognitionObjQueue.size < 1) {
                recognitionObjQueue.add(a)
            }
        }

        fun executeRecognitionFace() {
            thread (start=true) {
                while(true) {
                    val action = recognitionObjQueue.poll()
                    if(action!=null) {
                        action()
                    }

                    Thread.sleep(1000)
//                    println("Executing Recognition Face...")
                }
            }
        }



//        fun recognizeFace(
//            faceByteArr: ByteArray,
//            data: ConnData,
//            action: (ConnData) -> Unit,
//            error: (ConnData) -> Unit
//        ) {
//
//            thread (start=true){
//
//                Thread.sleep(3000)
//                val job = GlobalScope.launch() {
//
//                }
//
//                runBlocking {
//                    job.join()
//                    val serializedBitmap = Base64.encodeToString(faceByteArr, Base64.NO_WRAP)
//                    data.face_img = serializedBitmap
//                    request("recognize_face", data, action, error)
//                }
//
//            }
//        }


//        fun sendBoundingBoxPosition(image: Image, boundingBox: Rect) {
//
//            Log.d(
//                "Network",
//                "BoundingBox: ${boundingBox.top}, ${boundingBox.bottom}, ${boundingBox.left}, " +
//                        "${boundingBox.right}, ${boundingBox.width()}, ${boundingBox.height()}"
//            )
//
//            /** Server Transfer **/
//            var serialized = ""
//            val job = GlobalScope.launch() {
//                var bitmap = Utils.mediaImageToBitmap(image)
//                if (bitmap != null) {
//                    val matrix = Matrix()
//                    matrix.postRotate(-90f)
//                    bitmap =
//                        Bitmap.createBitmap(bitmap, 0, 0, bitmap.width, bitmap.height, matrix, true)
//                    print("${bitmap.width}, ${bitmap.height}")
//
//                    bitmap = Bitmap.createBitmap(
//                        bitmap,
//                        boundingBox.left,
//                        boundingBox.top,
//                        boundingBox.width(),
//                        boundingBox.height()
//                    )
//                }
//
//                val ostream = ByteArrayOutputStream()
//                bitmap?.compress(Bitmap.CompressFormat.JPEG, 100, ostream)
//                val byteArray = ostream.toByteArray()
//                serialized = Base64.encodeToString(byteArray, Base64.NO_WRAP)
//                Log.d("Network", "Image Size: ${image.width} ${image.height}")
//                ostream.close()
//            }
//
//            runBlocking {
//                job.join()
//                thread(start = true) {
//                    try {
//                        val data = ConnData(uuid = MainActivity.uuid, image = serialized)
//                        val client = OkHttpClient()
//                        val url = "http://192.168.219.101:5000/test"
////                        val url = "http://15.165.101.124:5000/test"
//                        val gson = Gson()
//                        val json = gson.toJson(data)
//
//                        val request = Request.Builder()
//                            .url(url)
//                            .post(
//                                RequestBody.create(
//                                    MediaType.parse("application/json; charset=utf-8"),
//                                    json
//                                )
//                            )
//                            .build()
//
//                        val response = client.newCall(request).execute()
//                        if (response.isSuccessful) {
//                            val body = response.body()
//                            if (body != null) {
//                                Log.d("Network", "Response : " + body.string());
//                            }
//                        } else {
//                            Log.d("Network", "request : $request");
//                            Log.d("Network", "Response : $response");
//                        }
//                    } catch (e: Exception) {
//                        e.printStackTrace()
//                    }
//                }
//            }
//            /** Server Transfer **/
//
////            thread(start = true) {
//
////                val galleryPath = MainActivity.galleryPath
////                val tsLong = System.currentTimeMillis() / 1000
////                val ts = tsLong.toString()
//
////            val uuid = MainActivity.uuid
////
////            Log.d("Network","UUID: $uuid")
////            Log.d("Network","File: $galleryPath/$ts.jpg")
////            Log.d("Network","Gallery Path: $galleryPath")
////            Log.d("Network","BoundingBox: ${boundingBox.top}, ${boundingBox.bottom}, ${boundingBox.left}, " +
////                    "${boundingBox.right}, ${boundingBox.width()}, ${boundingBox.height()}")
//        }
    }
}