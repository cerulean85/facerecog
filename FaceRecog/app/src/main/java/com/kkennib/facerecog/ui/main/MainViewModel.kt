package com.kkennib.facerecog.ui.main

import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kkennib.facerecog.R
import com.kkennib.facerecog.vision.VisionType

class MainViewModel : ViewModel() {

    val onClickButtonFaceRecogEvent: MutableLiveData<Unit?> = MutableLiveData()
    val onClickButtonFaceEnrollEvent: MutableLiveData<Unit?> = MutableLiveData()

    fun onClickButtonFaceRecog(view: View) {
        onClickButtonFaceRecogEvent.postValue(Unit)
    }

    fun onClickButtonFaceEnroll(view:View) {
        onClickButtonFaceEnrollEvent.postValue(Unit)
    }

}