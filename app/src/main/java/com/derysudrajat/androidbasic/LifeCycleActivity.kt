package com.derysudrajat.androidbasic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.derysudrajat.androidbasic.databinding.LifecycleActivityBinding

class LifeCycleActivity : AppCompatActivity() {

    private lateinit var binding: LifecycleActivityBinding
    private var status = "Status: \n"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LifecycleActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setStatus("onCreate")
    }

    override fun onStart() {
        super.onStart()
        setStatus("onStart")
    }

    override fun onResume() {
        super.onResume()
        setStatus("onResume")
    }

    override fun onPause() {
        super.onPause()
        setStatus("onPause")
    }

    override fun onStop() {
        super.onStop()
        setStatus("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        setStatus("onDestroy")
    }

    private fun setStatus(mStatus: String){
        status+="Status: $mStatus \n"
        binding.tvStatus.text = status
    }
}