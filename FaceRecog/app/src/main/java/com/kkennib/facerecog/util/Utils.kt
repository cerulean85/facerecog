package com.kkennib.facerecog.util

import android.graphics.*
import android.media.Image
import java.io.ByteArrayOutputStream
import java.nio.ByteBuffer

class Utils {
    companion object {

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