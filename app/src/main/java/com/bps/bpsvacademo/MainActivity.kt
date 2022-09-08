package com.bps.bpsvacademo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    var batman = "batman!"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Zelda","Activity onCreate Ran")
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d("Zelda"," Activity onStart Ran")
//        Log.d("Zelda","batman value is $batman")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Zelda","Activity onResume Ran")
//        Log.d("Zelda","batman value is $batman")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Zelda","Activity onPause Ran")
//        Log.d("Zelda","batman value is $batman")
        batman = "robin"
    }

    override fun onStop() {
        super.onStop()
        Log.d("Zelda","Activity onStop Ran")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Zelda","Activity onDestroy Ran")
    }

    abstract class temp {
        //This uses inheritance by extending
    }

    interface temp1 {
        //This uses polymorphism by implementing
    }
}
