package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


      binding.btnMenu.setOnClickListener {
          startActivity(Intent(this@MainActivity,ShowActivity::class.java))
      }
      binding.btnAdd.setOnClickListener {
          startActivity(Intent(this@MainActivity,AddActivity::class.java))
      }

    }
}