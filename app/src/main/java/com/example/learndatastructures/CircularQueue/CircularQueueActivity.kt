package com.example.learndatastructures.CircularQueue

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learndatastructures.R
import com.example.learndatastructures.databinding.ActivityCircularQueueBinding
import com.example.learndatastructures.databinding.ActivityQueueBinding
import com.google.android.material.tabs.TabLayoutMediator

class CircularQueueActivity : AppCompatActivity() {

    lateinit var binding: ActivityCircularQueueBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCircularQueueBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.circularqueueviewpager.adapter = CircularQueuePagerAdapter(this)
        TabLayoutMediator(binding.circularqueuetablayout, binding.circularqueueviewpager){ tab, index->
            tab.text = when(index){
                0 -> {"THEORY"}
                1 -> {"VISUALIZATION"}
                2 -> {"RESOURCES"}
                else -> {throw Resources.NotFoundException("Position not found...")}
            }
        }.attach()
    }
}