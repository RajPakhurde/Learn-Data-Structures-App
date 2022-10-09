package com.example.learndatastructures.QueueFragments

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class QueuePagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int  = 3

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> {
                Queue_1_Fragment()
            }
            1 -> {
                Queue_2_Fragment()
            }
            2 -> {
                Queue_3_Fragment()
            }
            else -> {
                throw Resources.NotFoundException("Position not found..")
            }
        }
    }

}