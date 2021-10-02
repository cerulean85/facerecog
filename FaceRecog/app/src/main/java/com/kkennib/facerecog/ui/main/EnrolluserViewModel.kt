package com.kkennib.facerecog.ui.main

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EnrolluserViewModel : ViewModel() {
    val onClickButtonEnrollEvent: MutableLiveData<Unit?> = MutableLiveData()

    fun onClickButtonEnroll(view: View) {
        onClickButtonEnrollEvent.postValue(Unit)
    }
}