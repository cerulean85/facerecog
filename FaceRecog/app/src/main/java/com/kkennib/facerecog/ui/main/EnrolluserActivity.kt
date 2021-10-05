package com.kkennib.facerecog.ui.main

import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.kkennib.facerecog.R
import com.kkennib.facerecog.databinding.ActivityEnrolluserBinding
import com.kkennib.facerecog.util.ConnData
import com.kkennib.facerecog.util.Network
import kotlinx.android.synthetic.main.activity_enrolluser.*

class EnrolluserActivity : BaseActivity() {

    private val binding by binding<ActivityEnrolluserBinding>(R.layout.activity_enrolluser)
    private val viewModel: EnrolluserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.apply {

            lifecycleOwner = this@EnrolluserActivity
            viewModel = this@EnrolluserActivity.viewModel
            initViewModel()

            val uuid = MainActivity.uuid
            val boundingBox = RecogActivity.boundingBox
//            var profileByteArr = RecogActivity.profileByteArr
//        if (profileImgBitmap != null) {
//            val matrix = Matrix()
//            matrix.postRotate(-90f)
//            profileImgBitmap =
//                Bitmap.createBitmap(
//                    profileImgBitmap, 0, 0,
//                    profileImgBitmap.width, profileImgBitmap.height, matrix, true
//                )
//        }
//        val bmpBytes = profileImg
//            val profileImg = BitmapFactory.decodeByteArray(profileByteArr, 0, profileByteArr.size)
//            val bmp = intent.getByteArrayExtra("profile_img")?.let {
//                BitmapFactory.decodeByteArray(intent.getByteArrayExtra("profile_img"), 0,
//                    it.size)
//            }

            enroll_user_profile_img.setImageBitmap(RecogActivity.profileBitmap)
            enroll_tv_user_uuid.text = uuid
        }
    }

    private fun initViewModel() {
        viewModel.apply {
            onClickButtonEnrollEvent.observe(::getLifecycle) {

                val data = ConnData(uuid =MainActivity.uuid, name =enroll_ed_user_name_lb.text.toString())
                val boundingBox = RecogActivity.boundingBox
                var profileBitmap = RecogActivity.profileBitmap
                var faceBitmap = RecogActivity.faceBitmap
                val action = { data: ConnData ->
                    runOnUiThread {
                        Toast.makeText(this@EnrolluserActivity, "SUCCESS!!", Toast.LENGTH_SHORT).show()
                        val nextIntent = Intent(this@EnrolluserActivity, MainActivity::class.java)
                        startActivity(nextIntent)
                    }
                }
                val error = { data: ConnData ->
                    runOnUiThread {
                        Toast.makeText(this@EnrolluserActivity, data.error_message, Toast.LENGTH_SHORT).show()
                    }
                }

                Network.insertUserInfo(profileBitmap, faceBitmap, boundingBox, data, action, error)
            }
        }
    }
}