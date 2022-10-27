package com.example.learndatastructures.LinkedlistFragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.learndatastructures.R

class MyRecyclerViewAdabter(val fruitList:ArrayList<String>): RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        var layoutInflater = LayoutInflater.from(parent.context)
        var itemList = layoutInflater.inflate(R.layout.item_list,parent,false)
        return MyViewHolder(itemList)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var fruits = fruitList[position]
        holder.listTextView.text = fruits
    }

    override fun getItemCount(): Int {
        return fruitList.size
    }
}

class MyViewHolder(val view: View): RecyclerView.ViewHolder(view){
    var listTextView = view.findViewById<TextView>(R.id.listTextView)
}
