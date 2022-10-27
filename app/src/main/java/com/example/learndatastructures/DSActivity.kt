package com.example.learndatastructures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learndatastructures.CircularQueue.CircularQueueActivity
import com.example.learndatastructures.LinkedlistFragments.LInkedlistActivity
import com.example.learndatastructures.QueueFragments.QueueActivity
import com.example.learndatastructures.StackFragments.StackActivity
import com.example.learndatastructures.databinding.ActivityDsactivityBinding

class DSActivity : AppCompatActivity() {

    lateinit var binding: ActivityDsactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDsactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cvStack.setOnClickListener {
            val intent = Intent(this, StackActivity::class.java)
            startActivity(intent)
        }

        binding.cvQueue.setOnClickListener {
            val intent = Intent(this, QueueActivity::class.java)
            startActivity(intent)
        }

        binding.cvCircularQueue.setOnClickListener {
            val secondintent = Intent(this,CircularQueueActivity::class.java)
            startActivity(secondintent)
        }

        binding.cvLinkedlist.setOnClickListener {
            val intent = Intent(this,LInkedlistActivity::class.java)
            startActivity(intent)
        }

    }
}