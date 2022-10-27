package com.example.learndatastructures.LinkedlistFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.learndatastructures.R
import com.example.learndatastructures.databinding.FragmentLInkedList2Binding
import com.example.learndatastructures.databinding.FragmentQueue2Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LInkedList_2_Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LInkedList_2_Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    val fruitList =  ArrayList<String>()
    private lateinit var binding: FragmentLInkedList2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLInkedList2Binding.inflate(inflater,container,false)
        return  binding.getRoot()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            binding.btnAddAtBeg.setOnClickListener {
                var element = binding.etInsertElement.text.toString()
                if(element != ""){
                    fruitList.add(0,element)
                    binding.myRecyclerView.layoutManager = LinearLayoutManager(getContext())
                    binding.myRecyclerView.adapter = MyRecyclerViewAdabter(fruitList)
                }
                else{
                    Toast.makeText( getContext(),"Insert Element..", Toast.LENGTH_SHORT).show()
                }

            }

            binding.btnAddAtLoc.setOnClickListener {
                val element = binding.etInsertElement.text.toString()
                val location = binding.etInsertLocation.text.toString()
                if(location != "" && element != ""){
                    var loc = location.toInt()
                    if(loc < fruitList.size){
                        fruitList.add(loc,element)
                    }
                    else{
                        Toast.makeText(getContext(),"Please enter valid location.. or element", Toast.LENGTH_SHORT).show()
                    }
                    binding.myRecyclerView.layoutManager = LinearLayoutManager(getContext())
                    binding.myRecyclerView.adapter = MyRecyclerViewAdabter(fruitList)
                }
                else{
                    Toast.makeText(getContext(),"Insert Element..", Toast.LENGTH_SHORT).show()
                }
            }

            binding.btnAddAtEnd.setOnClickListener {
                val element = binding.etInsertElement.text.toString()
                val location = binding.etInsertLocation.text.toString()

                if(element != ""){
                    fruitList.add(element)
                    binding.myRecyclerView.layoutManager = LinearLayoutManager(getContext())
                    binding.myRecyclerView.adapter = MyRecyclerViewAdabter(fruitList)
                }
                else{
                    Toast.makeText(getContext(),"Insert Element..", Toast.LENGTH_SHORT).show()
                }
            }
            binding.btnDeleBeg.setOnClickListener {
                if(fruitList.isEmpty()){
                    Toast.makeText(getContext(),"Linked list is empty..", Toast.LENGTH_SHORT).show()
                }
                else{
                    fruitList.removeAt(0)
                    binding.myRecyclerView.layoutManager = LinearLayoutManager(getContext())
                    binding.myRecyclerView.adapter = MyRecyclerViewAdabter(fruitList)
                }
            }

            binding.btnDeleEnd.setOnClickListener {
                if(fruitList.isEmpty()){
                    Toast.makeText(getContext(),"Linked list is empty..", Toast.LENGTH_SHORT).show()
                }
                else{
                    fruitList.removeAt(fruitList.size - 1)
                    binding.myRecyclerView.layoutManager = LinearLayoutManager(getContext())
                    binding.myRecyclerView.adapter = MyRecyclerViewAdabter(fruitList)
                }
            }

            binding.btnDeleLoc.setOnClickListener {
                if(fruitList.isEmpty()){
                    Toast.makeText(getContext(),"Linked list is empty..", Toast.LENGTH_SHORT).show()
                }
                else{
                    var location = binding.etInsertLocation.text.toString()
                    if(location.isEmpty()){
                        Toast.makeText(getContext(),"Enter the location...", Toast.LENGTH_SHORT).show()
                    }
                    else{
                        fruitList.removeAt(location.toInt())
                        binding.myRecyclerView.layoutManager = LinearLayoutManager(getContext())
                        binding.myRecyclerView.adapter = MyRecyclerViewAdabter(fruitList)
                    }
                }
            }
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LInkedList_2_Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LInkedList_2_Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}