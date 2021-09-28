package com.kkennib.facerecog.ui.main

import android.view.MenuItem
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kkennib.facerecog.R
import com.kkennib.facerecog.vision.VisionType

class RecogViewModel : ViewModel() {

    val onItemSelectedEvent: MutableLiveData<VisionType> = MutableLiveData()
    val onFabButtonEvent: MutableLiveData<Unit?> = MutableLiveData()
    val onShutterButtonEvent: MutableLiveData<Unit?> = MutableLiveData()

    fun onBottomMenuClicked(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_barcode_scan -> postVisionType(VisionType.Barcode)
            R.id.action_face_detect -> postVisionType(VisionType.Face)
            R.id.action_object_detect -> postVisionType(VisionType.Object)
            R.id.action_ocr -> postVisionType(VisionType.OCR)
        }
        item.isChecked = true
        return false
    }

    fun onClickFabButton(view: View) {
        onFabButtonEvent.postValue(Unit)
    }

    fun onClickShutter(view: View) {
        onShutterButtonEvent.postValue(Unit)
    }

    private fun postVisionType(type: VisionType) {
        onItemSelectedEvent.postValue(type)
    }

}