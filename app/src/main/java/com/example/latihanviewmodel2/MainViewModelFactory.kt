package com.example.latihanviewmodel2

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModel

class MainViewModelFactory(private var name: String): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(name) as T
        }
        throw IllegalArgumentException("ViewModel class not found")
    }
}