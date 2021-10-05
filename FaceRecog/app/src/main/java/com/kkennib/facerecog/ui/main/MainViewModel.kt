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
    val onClickButtonFaceRemoveEvent: MutableLiveData<Unit?> = MutableLiveData()
    val onClickButtonSocketTestConnectEvent: MutableLiveData<Unit?> = MutableLiveData()
    val onClickButtonSocketTestSendEvent: MutableLiveData<Unit?> = MutableLiveData()
    val onClickButtonSocketTestDisconnectEvent: MutableLiveData<Unit?> = MutableLiveData()

    fun onClickButtonFaceRecog(view: View) {
        onClickButtonFaceRecogEvent.postValue(Unit)
    }

    fun onClickButtonFaceEnroll(view:View) {
        onClickButtonFaceEnrollEvent.postValue(Unit)
    }

    fun onClickButtonFaceRemove(view:View) {
        onClickButtonFaceRemoveEvent.postValue(Unit)
    }

    fun onClickButtonSocketTestConnect(view:View) {
        onClickButtonSocketTestConnectEvent.postValue(Unit)
    }

    fun onClickButtonSocketTestSend(view:View) {
        onClickButtonSocketTestSendEvent.postValue(Unit)
    }

    fun onClickButtonSocketTestDisconnect(view:View) {
        onClickButtonSocketTestDisconnectEvent.postValue(Unit)
    }

}