package com.kkennib.facerecog.util

import android.graphics.*
import android.media.Image

import android.util.Base64
import android.util.Base64.NO_WRAP
import android.util.Log
import com.google.gson.Gson
import com.kkennib.facerecog.ui.main.MainActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import okhttp3.*
import java.nio.ByteBuffer;
import java.io.ByteArrayOutputStream
import kotlin.concurrent.thread

data class PostData(
    val uuid: String,
    val image: String,
    val message: String = ""
)

class Network {

    companion object {

        fun sendBoundingBoxPosition(image: Image, boundingBox: Rect) {

            Log.d("Network","BoundingBox: ${boundingBox.top}, ${boundingBox.bottom}, ${boundingBox.left}, " +
                    "${boundingBox.right}, ${boundingBox.width()}, ${boundingBox.height()}")




//            var file = File("$galleryPath/$ts.jpg")
//            try {
//
//                file.createNewFile()
//                val ostream = FileOutputStream(file)
//                bitmap?.compress(Bitmap.CompressFormat.JPEG, 100, ostream)
//                Log.d("Network","Image Size: ${image.width} ${image.height}")
//                ostream.close()
//            } catch (e: Exception) {
//                e.printStackTrace()
//            }
            /** Server Transfer **/
            var serialized = ""
            val job = GlobalScope.launch() {
                var bitmap = mediaImageToBitmap(image)
                if (bitmap != null) {
                    val matrix = Matrix()
                    matrix.postRotate(-90f)
                    bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.width, bitmap.height, matrix, true)
                    print("${bitmap.width}, ${bitmap.height}")

                    bitmap = Bitmap.createBitmap(bitmap, boundingBox.left, boundingBox.top, boundingBox.width(), boundingBox.height())
                }

                val ostream = ByteArrayOutputStream()
                bitmap?.compress(Bitmap.CompressFormat.JPEG, 100, ostream)
                val byteArray = ostream.toByteArray()
                serialized = Base64.encodeToString(byteArray, Base64.NO_WRAP)
                Log.d("Network","Image Size: ${image.width} ${image.height}")
                ostream.close()
            }

            runBlocking {
                job.join()
                thread(start = true) {
                    try {
                        val data = PostData(MainActivity.uuid, serialized)
                        val client = OkHttpClient()
                        val url = "http://192.168.219.101:5000/test"
//                        val url = "http://15.165.101.124:5000/test"
                        val gson = Gson()
                        val json = gson.toJson(data)

                        val request = Request.Builder()
                            .url(url)
                            .post(
                                RequestBody.create(
                                    MediaType.parse("application/json; charset=utf-8"),
                                    json
                                )
                            )
                            .build()

                        val response = client.newCall(request).execute()
                        if (response.isSuccessful) {
                            val body = response.body()
                            if (body != null) {
                                Log.d("Network", "Response : " + body.string());
                            }
                        } else {
                            Log.d("Network", "request : $request");
                            Log.d("Network", "Response : $response");
                        }
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }

            }
            /** Server Transfer **/

//            thread(start = true) {

//                val galleryPath = MainActivity.galleryPath
//                val tsLong = System.currentTimeMillis() / 1000
//                val ts = tsLong.toString()

//            val uuid = MainActivity.uuid
//
//            Log.d("Network","UUID: $uuid")
//            Log.d("Network","File: $galleryPath/$ts.jpg")
//            Log.d("Network","Gallery Path: $galleryPath")
//            Log.d("Network","BoundingBox: ${boundingBox.top}, ${boundingBox.bottom}, ${boundingBox.left}, " +
//                    "${boundingBox.right}, ${boundingBox.width()}, ${boundingBox.height()}")
        }

        //https://stackoverflow.com/questions/41773621/camera2-output-to-bitmap
        //private Bitmap convertYUV420888ToNV21_bitmap(Image imgYUV420) {
        fun mediaImageToBitmap(mediaImage: Image): Bitmap? {
            val byteArray = mediaImageToByteArray(mediaImage)
            var bitmap: Bitmap? = null
            if (mediaImage.format == ImageFormat.JPEG) {
                bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray!!.size)
            } else if (mediaImage.format == ImageFormat.YUV_420_888) {
                val yuvImage =
                    YuvImage(byteArray, ImageFormat.NV21, mediaImage.width, mediaImage.height, null)
                val out = ByteArrayOutputStream()
                yuvImage.compressToJpeg(Rect(0, 0, yuvImage.width, yuvImage.height), 100, out)
                val imageBytes: ByteArray = out.toByteArray()
                bitmap = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.size)
            }
            return bitmap
        }

        fun mediaImageToByteArray(mediaImage: Image): ByteArray? {
// Converting YUV_420_888 data to YUV_420_SP (NV21).
            //https://developer.android.com/reference/android/media/Image.html#getFormat()
            //https://developer.android.com/reference/android/graphics/ImageFormat#JPEG
            //https://developer.android.com/reference/android/graphics/ImageFormat#YUV_420_888
            var byteArray: ByteArray? = null
            if (mediaImage.format == ImageFormat.JPEG) {
                val buffer0: ByteBuffer = mediaImage.planes[0].buffer
                buffer0.rewind()
                val buffer0_size: Int = buffer0.remaining()
                byteArray = ByteArray(buffer0_size)
                buffer0.get(byteArray, 0, buffer0_size)
            } else if (mediaImage.format == ImageFormat.YUV_420_888) {
                val buffer0: ByteBuffer = mediaImage.planes[0].buffer
                val buffer2: ByteBuffer = mediaImage.planes[2].buffer
                val buffer0_size: Int = buffer0.remaining()
                val buffer2_size: Int = buffer2.remaining()
                byteArray = ByteArray(buffer0_size + buffer2_size)
                buffer0.get(byteArray, 0, buffer0_size)
                buffer2.get(byteArray, buffer0_size, buffer2_size)
            }
            return byteArray
        }

        fun bitmapToByteArray(bitmap: Bitmap): ByteArray? {
            val byteArray = ByteArray(bitmap.width * bitmap.height * 3)
            var byteArrayIndex = 0
            for (y in 0 until bitmap.height) {
                for (x in 0 until bitmap.width) {
                    val pixel = bitmap.getPixel(x, y)
                    val r = pixel shr 16 and 0xFF
                    val g = pixel shr 8 and 0xFF
                    val b = pixel and 0xFF
                    //int r = Color.red(pixel);
                    //int g = Color.green(pixel);
                    //int b = Color.blue(pixel);
                    byteArray[byteArrayIndex++] = r.toByte()
                    byteArray[byteArrayIndex++] = g.toByte()
                    byteArray[byteArrayIndex++] = b.toByte()
                }
            }
            return byteArray
        }


    }

}