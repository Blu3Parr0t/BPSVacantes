package com.bps.bpsvacademo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.bps.bpsvacademo.data.model.HenchmanEntity
import com.bps.bpsvacademo.data.repoimpl.HenchmanDB
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
//    val henchmanDB: HenchmanDB by lazy {
//        Room.databaseBuilder(
//            applicationContext,
//            HenchmanDB::class.java, "myHenchMenDB"
//        ).build()
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Zelda", "Activity onCreate Ran")
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
        Log.d("Zelda", "Activity onResume Ran")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Zelda", "Activity onPause Ran")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Zelda", "Activity onStop Ran")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Zelda", "Activity onDestroy Ran")
    }

    abstract class temp {
        //This uses inheritance by extending
    }

    interface temp1 {
        //This uses polymorphism by implementing
    }
}
