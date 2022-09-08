package com.bps.bpsvacademo.ui.fragment2

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel

class Fragment2ViewModel(app: Application) : AndroidViewModel(app) {
    var batman = "batman"

    fun demoteBatmanToRobin() {
        batman = "robin"
        Log.d("Zelda", "updated batman from viewmodel to robin")
    }

}
