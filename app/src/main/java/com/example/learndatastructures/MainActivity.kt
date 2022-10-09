package com.example.learndatastructures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.learndatastructures.BasicActivitys.Abstract_Dt_Activity
import com.example.learndatastructures.BasicActivitys.IntroductionActivity
import com.example.learndatastructures.BasicActivitys.Types_Of_Ds_Activity
import com.example.learndatastructures.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnExploreDataStructures.setOnClickListener {
            val intent = Intent(this,DSActivity::class.java)
            startActivity(intent)
        }

        binding.cvIntroduction.setOnClickListener {
            val intent = Intent(this,IntroductionActivity::class.java)
            startActivity(intent)
        }

        binding.cvTypesOfDataStructures.setOnClickListener {
            val intent = Intent(this,Types_Of_Ds_Activity::class.java)
            startActivity(intent)
        }

        binding.cvAbstractDataType.setOnClickListener {
            val intent = Intent(this,Abstract_Dt_Activity::class.java)
            startActivity(intent)
        }
    }
}