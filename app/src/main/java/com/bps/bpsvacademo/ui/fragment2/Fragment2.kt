package com.bps.bpsvacademo.ui.fragment2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.viewModelFactory
import com.bps.bpsvacademo.R


class Fragment2 : Fragment() {//This typically was our presenter or controller

    //lazy loading or lateinit
//    val viewModel: Fragment2ViewModel by lazy {
//        ViewModelProvider(this)[Fragment2ViewModel::class.java]
//    }

    lateinit var viewModel: Fragment2ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[Fragment2ViewModel::class.java]
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        Log.d("Zelda", "fragment 2 onCreateView")
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val popBackStackBtn = view.findViewById<Button>(R.id.backButtonFragment2)
        popBackStackBtn.setOnClickListener {
            val fm = activity?.supportFragmentManager
            fm?.popBackStack()
        }
        Log.d("Zelda", "viewmodel value is ${viewModel.batman}")
        viewModel.demoteBatmanToRobin()
        Log.d("Zelda", "viewmodel post value is ${viewModel.batman}")
        Log.d("Zelda", "fragment 2 onViewCreated")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Zelda", "fragment2 onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Zelda", "fragment2 onStop")
    }
}
