package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.foodapp.Adapter.Cache.MySharedPreference
import com.example.foodapp.databinding.ActivityAddBinding
import com.example.foodapp.models.MyFood

class AddActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Taom qo'shish"

        MySharedPreference.init(this)

        binding.btnSave.setOnClickListener {
            val name = binding.edtFoodName.text.toString().trim()
            val products = binding.edtMaxsulotlar.text.toString().trim()
            val preparetionOrder =binding.edtTaomTayyorlashTartibi.text.toString().trim()

            if (name!="" && products!="" && preparetionOrder!=""){
                val list = MySharedPreference.obektString
                list.add(MyFood(name,products, preparetionOrder))
                MySharedPreference.obektString = list
                Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show()
                finish()
            }else{
                Toast.makeText(this, "Ma'lumot yetarli emas", Toast.LENGTH_SHORT).show()
            }
        }


    }
}