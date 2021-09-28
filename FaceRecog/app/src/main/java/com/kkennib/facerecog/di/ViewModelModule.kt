package com.kkennib.facerecog.di

import com.kkennib.facerecog.ui.main.MainViewModel
import com.kkennib.facerecog.ui.main.RecogViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        RecogViewModel()
        MainViewModel()
    }
}