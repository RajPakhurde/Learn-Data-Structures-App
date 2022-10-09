package com.example.learndatastructures.StackFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.learndatastructures.R
import com.example.learndatastructures.databinding.FragmentStack2Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Stack_2_Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Stack_2_Fragment : Fragment() {
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

    private lateinit var binding: FragmentStack2Binding
    var r: Int = 5
    var i: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStack2Binding.inflate(inflater,container,false)
        return binding.getRoot()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnAdd.setOnClickListener {
            insertElement()
        }

        binding.btnDelete.setOnClickListener {
            deleteElement()
        }
    }

    fun insertElement() {
        val element = binding.etInsertElemtent.text.toString()
        if (element.isNotBlank()) {
            if (i == 5) {
                Toast.makeText(getContext(), "Stack is full can't insert", Toast.LENGTH_SHORT).show()
                binding.etInsertElemtent.setText("")
            }
            if (i == 0) {
                val element = binding.etInsertElemtent.text.toString()
                binding.tvFirstElement.text = element
                binding.firstTop.visibility = View.VISIBLE
                binding.etInsertElemtent.setText("")
                i++
            } else if (i == 1) {
                val element = binding.etInsertElemtent.text.toString()
                binding.tvSecondElement.text = element
                binding.secondTop.visibility = View.VISIBLE
                binding.firstTop.visibility = View.INVISIBLE
                binding.etInsertElemtent.setText("")
                i++
            } else if (i == 2) {
                val element = binding.etInsertElemtent.text.toString()
                binding.tvThirdElement.text = element
                binding.thirdTop.visibility = View.VISIBLE
                binding.secondTop.visibility = View.INVISIBLE
                binding.etInsertElemtent.setText("")
                i++
            } else if (i == 3) {
                val element = binding.etInsertElemtent.text.toString()
                binding.tvFourthElement.text = element
                binding.fourthTop.visibility = View.VISIBLE
                binding.thirdTop.visibility = View.INVISIBLE
                binding.etInsertElemtent.setText("")
                i++
            } else if (i == 4) {
                val element = binding.etInsertElemtent.text.toString()
                binding.tvFifthElement.text = element
                binding.fifthTop.visibility = View.VISIBLE
                binding.fourthTop.visibility = View.INVISIBLE
                binding.etInsertElemtent.setText("")
                i++
            }
        } else {
            Toast.makeText(getContext(), "Please Enter a Number..", Toast.LENGTH_SHORT).show()
        }
    }

    fun deleteElement(){
        if (i == 0) {
            Toast.makeText( getContext(), "Stack is Empty can't delete", Toast.LENGTH_SHORT).show()
        }
        if (i == 1) {
            binding.firstTop.visibility = View.INVISIBLE
            binding.tvFirstElement.setText("")
            i--
        } else if (i == 2) {
            binding.secondTop.visibility = View.INVISIBLE
            binding.firstTop.visibility = View.VISIBLE
            binding.tvSecondElement.setText("")
            i--
        } else if (i == 3) {
            binding.thirdTop.visibility = View.INVISIBLE
            binding.secondTop.visibility = View.VISIBLE
            binding.tvThirdElement.setText("")
            i--
        } else if (i == 4) {
            binding.fourthTop.visibility = View.INVISIBLE
            binding.thirdTop.visibility = View.VISIBLE
            binding.tvFourthElement.setText("")
            i--
        } else if (i == 5) {
            binding.fifthTop.visibility = View.INVISIBLE
            binding.fourthTop.visibility = View.VISIBLE
            binding.tvFifthElement.setText("")
            i--
        }
    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Stack_2_Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Stack_2_Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}