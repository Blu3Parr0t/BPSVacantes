package com.bps.bpsvacademo.ui.fragment1

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class Fragment1ViewModel(app: Application) : AndroidViewModel(app) {

    private val _batman = MutableLiveData("batman")
    val batman: LiveData<String> = _batman
    private var isBatman = true

    private val _isJokerHere = MutableLiveData(true)
    val isJokerHere: LiveData<Boolean> = _isJokerHere

    fun updateBatman() {
        if (isBatman) {
            _batman.value = "robin"
            updateJoker()
            isBatman = false
        } else {
            _batman.value = "batman"
            updateJoker()
            isBatman = true
        }
    }

    private fun updateJoker() {
        _isJokerHere.value = isBatman
    }
}
