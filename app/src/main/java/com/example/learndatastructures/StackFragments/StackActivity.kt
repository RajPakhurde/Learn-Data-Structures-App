package com.example.learndatastructures.StackFragments

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learndatastructures.R
import com.example.learndatastructures.databinding.ActivityStackBinding
import com.google.android.material.tabs.TabLayoutMediator

class StackActivity : AppCompatActivity() {

    lateinit var binding: ActivityStackBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStackBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpager.adapter = StackPagerAdapter(this)
        TabLayoutMediator(binding.tablayout, binding.viewpager){ tab, index->
            tab.text = when(index){
                0 -> {"THEORY"}
                1 -> {"VISUALIZATION"}
                2 -> {"RESOURCES"}
                else -> {throw Resources.NotFoundException("Position not found...")}
            }
        }.attach()

    }
}