package com.kkennib.facerecog

import android.Manifest
import android.app.Application
import android.telephony.TelephonyManager
import androidx.core.content.ContextCompat
import com.kkennib.facerecog.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import android.content.pm.PackageManager

import androidx.core.app.ActivityCompat




class KKennib : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@KKennib)
            modules(viewModelModule)
        }
    }

}