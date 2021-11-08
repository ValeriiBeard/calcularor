package com.example.lasson_4.data

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class dataCar: ViewModel() {
    val dataCartest :MutableLiveData <Float> by lazy {
        MutableLiveData <Float>()
    }
}