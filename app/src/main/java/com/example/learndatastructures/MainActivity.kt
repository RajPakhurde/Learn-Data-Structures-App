package com.example.learndatastructures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import com.example.learndatastructures.BasicActivitys.Abstract_Dt_Activity
import com.example.learndatastructures.BasicActivitys.IntroductionActivity
import com.example.learndatastructures.BasicActivitys.Types_Of_Ds_Activity
import com.example.learndatastructures.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fade_in_animation = AnimationUtils.loadAnimation(this,R.anim.fade_in)
        val move_animation = AnimationUtils.loadAnimation(this,R.anim.move)
        val move_animation1 = AnimationUtils.loadAnimation(this,R.anim.move_2)
        val move_animation2 = AnimationUtils.loadAnimation(this,R.anim.move_3)
        binding.tvHeading.startAnimation(fade_in_animation)
        binding.cvIntroduction.startAnimation(move_animation)
        binding.cvTypesOfDataStructures.startAnimation(move_animation1)
        binding.cvAbstractDataType.startAnimation(move_animation2)

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