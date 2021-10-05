package com.kkennib.facerecog.util

import android.util.Base64
import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec

class AES256Cryption private constructor(){
    private val SECRET_KEY = "HEXSTRING1"
    private val IV = "HEXSTRING2"

    companion object {
        fun encrypt(plain: String) : String {
            val o = AES256Cryption()

            val toBytes = plain.toByteArray()
            val cipher = o.getCipher(Cipher.ENCRYPT_MODE)

//            return Utils.getBase64Encoded(cipher.doFinal(toBytes))
            return Base64.encodeToString(cipher.doFinal(toBytes), Base64.DEFAULT)
        }

        fun decrypt(encrypted: String) : String{
            val o = AES256Cryption()

            val toByte = Base64.decode(encrypted, Base64.DEFAULT)
            val cipher = o.getCipher(Cipher.DECRYPT_MODE)

            return String(cipher.doFinal(toByte))
        }
    }

    private fun getCipher(mode: Int) : Cipher{
        val c = Cipher.getInstance("AES/CBC/PKCS7Padding")

        val keyDecodes = SECRET_KEY.hexSetToByteArray()
        val ivDecodes = IV.hexSetToByteArray()

        val keySpec = SecretKeySpec(keyDecodes, "AES")
        val ivSpec = IvParameterSpec(ivDecodes)

        c.init(mode, keySpec, ivSpec)

        return c
    }

    private fun String.hexSetToByteArray() = this.chunked(2).map { it.toUpperCase().toInt(16).toByte() }.toByteArray()
}