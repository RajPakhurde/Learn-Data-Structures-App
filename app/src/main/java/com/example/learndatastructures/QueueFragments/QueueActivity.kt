package com.example.learndatastructures.QueueFragments

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learndatastructures.R
import com.example.learndatastructures.StackFragments.StackPagerAdapter
import com.example.learndatastructures.databinding.ActivityQueueBinding
import com.google.android.material.tabs.TabLayoutMediator

class QueueActivity : AppCompatActivity() {

    lateinit var binding: ActivityQueueBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueueBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.queueviewpager.adapter = QueuePagerAdapter(this)
        TabLayoutMediator(binding.queuetablayout, binding.queueviewpager){ tab, index->
            tab.text = when(index){
                0 -> {"THEORY"}
                1 -> {"VISUALIZATION"}
                2 -> {"RESOURCES"}
                else -> {throw Resources.NotFoundException("Position not found...")}
            }
        }.attach()
    }
}