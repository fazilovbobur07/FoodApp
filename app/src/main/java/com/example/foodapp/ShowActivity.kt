package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.foodapp.Adapter.Cache.MySharedPreference
import com.example.foodapp.Adapter.MyAdapter
import com.example.foodapp.databinding.ActivityShowBinding

class ShowActivity : AppCompatActivity() {
    lateinit var binding: ActivityShowBinding
    lateinit var myAdapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Barcha taomlar"

        MySharedPreference.init(this)
        val list = MySharedPreference.obektString

        myAdapter = MyAdapter(this,list)
        binding.myListView.adapter = myAdapter
        binding.myListView.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, AboutFoodActivity::class.java)
            intent.putExtra("position", position)
            startActivity(intent)
        }

    }
}
