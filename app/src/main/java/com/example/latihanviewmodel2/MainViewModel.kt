package com.example.latihanviewmodel2

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel(name: String): ViewModel() {
    var myName: String = name

    init {
        Log.d("ViewModel",  "Ini latihan $myName")
    }
}