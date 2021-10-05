package com.kkennib.facerecog.ui.main

import android.view.MenuItem
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kkennib.facerecog.R
import com.kkennib.facerecog.vision.VisionType

class RealtimeRecogViewModel : ViewModel() {

    val onFabButtonEvent: MutableLiveData<Unit?> = MutableLiveData()

    fun onClickFabButton(view: View) {
        onFabButtonEvent.postValue(Unit)
    }

}