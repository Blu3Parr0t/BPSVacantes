package com.bps.bpsvacademo.ui.fragment1

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.room.Room
import com.bps.bpsvacademo.data.repoimpl.HenchmanDB
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Fragment1ViewModel(app: Application) : AndroidViewModel(app) {

    private val _batman = MutableLiveData("batman")
    val batman: LiveData<String> = _batman
    private var isBatman = true

    private val _isJokerHere = MutableLiveData(true)
    val isJokerHere: LiveData<Boolean> = _isJokerHere

    private val _recruitName = MutableLiveData<String>() //Null
    val recruitName: LiveData<String> = _recruitName

    private val _recruitWeapon = MutableLiveData<String>()
    val recruitWeapon: LiveData<String> = _recruitWeapon

    private val _usedDataBase = MutableLiveData<Boolean>()
    val usedDatabase: LiveData<Boolean> = _usedDataBase

    private val henchmanDB: HenchmanDB by lazy {
        Room.databaseBuilder(
            app,
            HenchmanDB::class.java, "myHenchMenDB"
        ).build()
    }

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

    fun getNewestRecruit() {
        viewModelScope.launch(Dispatchers.IO) {
            val temp = henchmanDB.henchmanDao().getAllHenchmen().last()
            _recruitName.postValue(temp.name)
            _recruitWeapon.postValue(temp.weapon)
            _usedDataBase.postValue(true)
            Log.d("Zelda", "last recruit is: $temp")
        }
    }
}
