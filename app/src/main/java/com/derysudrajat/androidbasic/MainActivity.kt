package com.derysudrajat.androidbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.derysudrajat.androidbasic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnToView.setOnClickListener {
                startActivity(Intent(this@MainActivity, ViewActivity::class.java))
            }
            btnToLifecycle.setOnClickListener {
                startActivity(Intent(this@MainActivity, LifeCycleActivity::class.java))
            }
        }

    }
}