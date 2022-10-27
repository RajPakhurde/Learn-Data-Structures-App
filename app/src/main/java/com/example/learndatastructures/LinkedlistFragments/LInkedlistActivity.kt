package com.example.learndatastructures.LinkedlistFragments

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learndatastructures.databinding.ActivityLinkedlistBinding
import com.google.android.material.tabs.TabLayoutMediator

class LInkedlistActivity : AppCompatActivity() {

    lateinit var binding: ActivityLinkedlistBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLinkedlistBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Linkedlistviewpager.adapter = LinkedListPageAdapter(this)
        TabLayoutMediator(binding.Linkedlisttablayout , binding.Linkedlistviewpager){ tab, index ->
            tab.text  = when(index){
                0 -> {"THEORY"}
                1 -> {"VISUALIZATION"}
                2 -> {"RESOURCES"}
                else -> {throw Resources.NotFoundException("Position not found...")}
            }
        }.attach()
    }
}