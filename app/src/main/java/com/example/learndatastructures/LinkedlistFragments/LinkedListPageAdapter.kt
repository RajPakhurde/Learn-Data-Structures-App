package com.example.learndatastructures.LinkedlistFragments

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class LinkedListPageAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> {
                LInkedList_1_Fragment()
            }
            1 -> {
                LInkedList_2_Fragment()
            }
            2 -> {
                LInkedList_3_Fragment()
            }
            else -> {
                throw Resources.NotFoundException("Position not found...")
            }
        }
    }
}