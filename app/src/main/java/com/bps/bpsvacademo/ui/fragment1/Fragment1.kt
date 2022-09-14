package com.bps.bpsvacademo.ui.fragment1

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bps.bpsvacademo.R
import com.bps.bpsvacademo.databinding.Fragment1Binding
import com.bps.bpsvacademo.ui.fragment2.Fragment2


class Fragment1 : Fragment() {

    private lateinit var viewModel: Fragment1ViewModel
    private lateinit var bind: Fragment1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Zelda", "Fragment 1 onCreate")
        viewModel = ViewModelProvider(this)[Fragment1ViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        Log.d("Zelda", "Fragment 1 onCreateView")
        bind = DataBindingUtil.inflate(inflater, R.layout.fragment_1, container, false)
        bind.viewModel = viewModel
        bind.lifecycleOwner = this
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Zelda", "Fragment 1 onViewCreated")
        doUIFunctions()
        setLiveData()
    }

    private fun setLiveData() {
        viewModel.usedDatabase.observe(viewLifecycleOwner, { usedDB ->
            if(usedDB) {
                bind.DBName.boxStrokeColor = resources.getColor(R.color.myCustomColor, null)
                bind.DBWeapon.boxStrokeColor = resources.getColor(R.color.myCustomColor, null)
            }
        })
    }

    private fun doUIFunctions() {
        bind.ButtonInFragment1.setOnClickListener {
            val newFragment = Fragment2()
            val ft = parentFragmentManager.beginTransaction()
            ft.replace(R.id.fragment_container_view, newFragment)
            ft.addToBackStack(null)
            ft.commit()
        }

    }

    override fun onResume() {
        super.onResume()
        Log.d("Zelda", "Fragment 1 onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Zelda", "Fragment 1 onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Zelda", "Fragment 1 onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Zelda", "Fragment 1 onDestroy")
    }
}
