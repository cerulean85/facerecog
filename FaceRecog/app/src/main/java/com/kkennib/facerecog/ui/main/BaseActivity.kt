package com.kkennib.facerecog.ui.main

//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import androidx.databinding.DataBindingUtil
//import androidx.databinding.ViewDataBinding
//
//abstract class BaseActivity<T: ViewDataBinding> : AppCompatActivity() {
//
//    abstract var layoutResourceId: Int
//    abstract fun initBinding()
//    lateinit var binding: T
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = DataBindingUtil.setContentView(this, layoutResourceId)
//        initBinding()
//    }
//}

import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

open class BaseActivity : AppCompatActivity() {

    protected fun <T : ViewDataBinding> binding(@LayoutRes resId: Int): Lazy<T> =
        lazy { DataBindingUtil.setContentView<T>(this, resId) }

}