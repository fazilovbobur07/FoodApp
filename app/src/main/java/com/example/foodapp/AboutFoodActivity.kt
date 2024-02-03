package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.Adapter.Cache.MySharedPreference
import com.example.foodapp.Adapter.MyAdapter
import com.example.foodapp.databinding.ActivityAboutFoodBinding

class AboutFoodActivity : AppCompatActivity() {
    lateinit var binding: ActivityAboutFoodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutFoodBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MySharedPreference.init(this)
        val list = MySharedPreference.obektString
        val position = intent.getIntExtra("position", 0 )
        binding.txtName.text = list[position].name
        binding.txtFoodProduct.text = list[position].kerakliM
        binding.txtPreparationOrder.text = list[position].TaomTayyorlashTartibi
    }
}