package com.example.learndatastructures.QueueFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.learndatastructures.R
import com.example.learndatastructures.databinding.FragmentQueue2Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Queue_2_Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Queue_2_Fragment : Fragment() {
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

    private lateinit var binding: FragmentQueue2Binding
    var front = 0
    var rear = 0
    var once = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding = FragmentQueue2Binding.inflate(inflater,container,false)
        return  binding.getRoot()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnEnqueue.setOnClickListener {
            insertElement()
        }

        binding.btnDequeue.setOnClickListener {
            deleteElement()
        }
    }

    private fun insertElement() {

        val element = binding.etQueueElements.text.toString()
        if (element.isNotBlank()) {

            if (binding.tv1.text == "" && binding.tv2.text == "" && binding.tv3.text == "" && binding.tv4.text == "" && binding.tv5.text == "" && binding.tv6.text == "" && binding.tv7.text == "") {
                front = 0
                rear = 0
                once = 1
            }

            if (rear == 7) {
                Toast.makeText(getContext(), "Queue is full can't insert", Toast.LENGTH_SHORT).show()
                binding.etQueueElements.setText("")


            }
            if (rear == 0) {
                if (binding.tv1.text == "") {
                    val element = binding.etQueueElements.text.toString()
                    binding.tv1.text = element
                    binding.front1.visibility = View.VISIBLE
                    binding.front7.visibility = View.INVISIBLE
                    binding.etQueueElements.setText("")
                    rear++

                    if (once == 1) {
                        binding.rear1.visibility = View.VISIBLE
                        once++
                    }
                } else {
                    Toast.makeText(getContext(), "Queue is full can't insert", Toast.LENGTH_SHORT).show()
                }

            } else if (rear == 1) {
                if (binding.tv2.text == "") {
                    val element = binding.etQueueElements.text.toString()
                    binding.tv2.text = element
                    binding.front2.visibility = View.VISIBLE
                    binding.front1.visibility = View.INVISIBLE
                    binding.etQueueElements.setText("")
                    rear++
                } else {
                    Toast.makeText(getContext(), "Queue is full can't insert", Toast.LENGTH_SHORT).show()
                }

            } else if (rear == 2) {
                if (binding.tv3.text == "") {
                    val element = binding.etQueueElements.text.toString()
                    binding.tv3.text = element
                    binding.front3.visibility = View.VISIBLE
                    binding.front2.visibility = View.INVISIBLE
                    binding.etQueueElements.setText("")
                    rear++
                } else {
                    Toast.makeText(getContext(), "Queue is full can't insert", Toast.LENGTH_SHORT).show()
                }

            } else if (rear == 3) {
                if (binding.tv4.text == "") {
                    val element = binding.etQueueElements.text.toString()
                    binding.tv4.text = element
                    binding.front4.visibility = View.VISIBLE
                    binding.front3.visibility = View.INVISIBLE
                    binding.etQueueElements.setText("")
                    rear++
                } else {
                    Toast.makeText(getContext(), "Queue is full can't insert", Toast.LENGTH_SHORT).show()
                }

            } else if (rear == 4) {
                if (binding.tv5.text == "") {
                    val element = binding.etQueueElements.text.toString()
                    binding.tv5.text = element
                    binding.front5.visibility = View.VISIBLE
                    binding.front4.visibility = View.INVISIBLE
                    binding.etQueueElements.setText("")
                    rear++
                } else {
                    Toast.makeText(getContext(), "Queue is full can't insert", Toast.LENGTH_SHORT).show()
                }

            } else if (rear == 5) {
                if (binding.tv6.text == "") {
                    val element = binding.etQueueElements.text.toString()
                    binding.tv6.text = element
                    binding.front6.visibility = View.VISIBLE
                    binding.front5.visibility = View.INVISIBLE
                    binding.etQueueElements.setText("")
                    rear++
                } else {
                    Toast.makeText(getContext(), "Queue is full can't insert", Toast.LENGTH_SHORT).show()
                }

            } else if (rear == 6) {
                if (binding.tv7.text == "") {
                    val element = binding.etQueueElements.text.toString()
                    binding.tv7.text = element
                    binding.front7.visibility = View.VISIBLE
                    binding.front6.visibility = View.INVISIBLE
                    binding.etQueueElements.setText("")
                    rear++
                } else {
                    Toast.makeText(getContext(), "Queue is full can't insert", Toast.LENGTH_SHORT).show()
                }

            }
        } else {
            Toast.makeText(getContext(), "Please Enter a Number..", Toast.LENGTH_SHORT).show()
        }

    }

    private fun deleteElement() {
        if (front == 0) {
            if (binding.tv1.text != "") {
                binding.rear2.visibility = View.VISIBLE
                binding.rear1.visibility = View.INVISIBLE
                binding.tv1.setText("")
                front++

                if(binding.tv1.text == "" && binding.tv2.text == "" && binding.tv3.text == "" && binding.tv4.text == "" && binding.tv5.text == "" && binding.tv6.text == "" && binding.tv7.text == ""){
                    binding.front1.visibility = View.INVISIBLE
                    binding.front2.visibility = View.INVISIBLE
                    binding.front3.visibility = View.INVISIBLE
                    binding.front4.visibility = View.INVISIBLE
                    binding.front5.visibility = View.INVISIBLE
                    binding.front6.visibility = View.INVISIBLE
                    binding.front7.visibility = View.INVISIBLE

                    binding.rear1.visibility = View.INVISIBLE
                    binding.rear2.visibility = View.INVISIBLE
                    binding.rear3.visibility = View.INVISIBLE
                    binding.rear4.visibility = View.INVISIBLE
                    binding.rear5.visibility = View.INVISIBLE
                    binding.rear6.visibility = View.INVISIBLE
                    binding.rear7.visibility = View.INVISIBLE

                }
            } else {
                Toast.makeText(getContext(), "Queue is Empty can't delete", Toast.LENGTH_SHORT).show()
            }

        } else if (front == 1) {
            if (binding.tv2.text != "") {
                binding.rear3.visibility = View.VISIBLE
                binding.rear2.visibility = View.INVISIBLE
                binding.tv2.setText("")
                front++

                if(binding.tv1.text == "" && binding.tv2.text == "" && binding.tv3.text == "" && binding.tv4.text == "" && binding.tv5.text == "" && binding.tv6.text == "" && binding.tv7.text == ""){
                    binding.front2.visibility = View.INVISIBLE
                    binding.front1.visibility = View.INVISIBLE
                    binding.front3.visibility = View.INVISIBLE
                    binding.front4.visibility = View.INVISIBLE
                    binding.front5.visibility = View.INVISIBLE
                    binding.front6.visibility = View.INVISIBLE
                    binding.front7.visibility = View.INVISIBLE

                    binding.rear1.visibility = View.INVISIBLE
                    binding.rear2.visibility = View.INVISIBLE
                    binding.rear3.visibility = View.INVISIBLE
                    binding.rear4.visibility = View.INVISIBLE
                    binding.rear5.visibility = View.INVISIBLE
                    binding.rear6.visibility = View.INVISIBLE
                    binding.rear7.visibility = View.INVISIBLE
                }
            } else {
                Toast.makeText(getContext(), "Queue is Empty can't delete", Toast.LENGTH_SHORT).show()
            }
        } else if (front == 2) {
            if (binding.tv3.text != "") {
                binding.rear4.visibility = View.VISIBLE
                binding.rear3.visibility = View.INVISIBLE
                binding.tv3.setText("")
                front++

                if(binding.tv1.text == "" && binding.tv2.text == "" && binding.tv3.text == "" && binding.tv4.text == "" && binding.tv5.text == "" && binding.tv6.text == "" && binding.tv7.text == ""){
                    binding.front1.visibility = View.INVISIBLE
                    binding.front2.visibility = View.INVISIBLE
                    binding.front3.visibility = View.INVISIBLE
                    binding.front4.visibility = View.INVISIBLE
                    binding.front5.visibility = View.INVISIBLE
                    binding.front6.visibility = View.INVISIBLE
                    binding.front7.visibility = View.INVISIBLE

                    binding.rear1.visibility = View.INVISIBLE
                    binding.rear2.visibility = View.INVISIBLE
                    binding.rear3.visibility = View.INVISIBLE
                    binding.rear4.visibility = View.INVISIBLE
                    binding.rear5.visibility = View.INVISIBLE
                    binding.rear6.visibility = View.INVISIBLE
                    binding.rear7.visibility = View.INVISIBLE
                }
            } else {
                Toast.makeText(getContext(), "Queue is Empty can't delete", Toast.LENGTH_SHORT).show()
            }
        } else if (front == 3) {
            if (binding.tv4.text != "") {
                binding.rear5.visibility = View.VISIBLE
                binding.rear4.visibility = View.INVISIBLE
                binding.tv4.setText("")
                front++

                if(binding.tv1.text == "" && binding.tv2.text == "" && binding.tv3.text == "" && binding.tv4.text == "" && binding.tv5.text == "" && binding.tv6.text == "" && binding.tv7.text == ""){
                    binding.front1.visibility = View.INVISIBLE
                    binding.front2.visibility = View.INVISIBLE
                    binding.front3.visibility = View.INVISIBLE
                    binding.front4.visibility = View.INVISIBLE
                    binding.front5.visibility = View.INVISIBLE
                    binding.front6.visibility = View.INVISIBLE
                    binding.front7.visibility = View.INVISIBLE

                    binding.rear1.visibility = View.INVISIBLE
                    binding.rear2.visibility = View.INVISIBLE
                    binding.rear3.visibility = View.INVISIBLE
                    binding.rear4.visibility = View.INVISIBLE
                    binding.rear5.visibility = View.INVISIBLE
                    binding.rear6.visibility = View.INVISIBLE
                    binding.rear7.visibility = View.INVISIBLE
                }
            } else {
                Toast.makeText(getContext(), "Queue is Empty can't delete", Toast.LENGTH_SHORT).show()
            }
        } else if (front == 4) {
            if (binding.tv5.text != "") {
                binding. rear6.visibility = View.VISIBLE
                binding.rear5.visibility = View.INVISIBLE
                binding.tv5.setText("")
                front++

                if(binding.tv1.text == "" && binding.tv2.text == "" && binding.tv3.text == "" && binding.tv4.text == "" && binding.tv5.text == "" && binding.tv6.text == "" && binding.tv7.text == ""){
                    binding.front1.visibility = View.INVISIBLE
                    binding.front2.visibility = View.INVISIBLE
                    binding.front3.visibility = View.INVISIBLE
                    binding.front4.visibility = View.INVISIBLE
                    binding.front5.visibility = View.INVISIBLE
                    binding.front6.visibility = View.INVISIBLE
                    binding.front7.visibility = View.INVISIBLE

                    binding.rear1.visibility = View.INVISIBLE
                    binding.rear2.visibility = View.INVISIBLE
                    binding.rear3.visibility = View.INVISIBLE
                    binding.rear4.visibility = View.INVISIBLE
                    binding.rear5.visibility = View.INVISIBLE
                    binding.rear6.visibility = View.INVISIBLE
                    binding.rear7.visibility = View.INVISIBLE
                }
            } else {
                Toast.makeText(getContext(), "Queue is Empty can't delete", Toast.LENGTH_SHORT).show()
            }
        } else if (front == 5) {
            if (binding.tv6.text != "") {
                binding.rear7.visibility = View.VISIBLE
                binding.rear6.visibility = View.INVISIBLE
                binding.tv6.setText("")
                front++

                if(binding.tv1.text == "" && binding.tv2.text == "" && binding.tv3.text == "" && binding.tv4.text == "" && binding.tv5.text == "" && binding.tv6.text == "" && binding.tv7.text == ""){
                    binding.front1.visibility = View.INVISIBLE
                    binding.front2.visibility = View.INVISIBLE
                    binding.front3.visibility = View.INVISIBLE
                    binding.front4.visibility = View.INVISIBLE
                    binding.front5.visibility = View.INVISIBLE
                    binding.front6.visibility = View.INVISIBLE
                    binding.front7.visibility = View.INVISIBLE

                    binding.rear1.visibility = View.INVISIBLE
                    binding.rear2.visibility = View.INVISIBLE
                    binding.rear3.visibility = View.INVISIBLE
                    binding.rear4.visibility = View.INVISIBLE
                    binding.rear5.visibility = View.INVISIBLE
                    binding.rear6.visibility = View.INVISIBLE
                    binding.rear7.visibility = View.INVISIBLE
                }
            } else {
                Toast.makeText(getContext(), "Queue is Empty can't delete", Toast.LENGTH_SHORT).show()
            }
        } else if (front == 6) {
            if (binding.tv7.text != "") {
                binding.rear1.visibility = View.VISIBLE
                binding.rear7.visibility = View.INVISIBLE
                binding.tv7.setText("")
                front++

                if(binding.tv1.text == "" && binding.tv2.text == "" && binding.tv3.text == "" && binding.tv4.text == "" && binding.tv5.text == "" && binding.tv6.text == "" && binding.tv7.text == ""){
                    binding.front1.visibility = View.INVISIBLE
                    binding.front2.visibility = View.INVISIBLE
                    binding.front3.visibility = View.INVISIBLE
                    binding.front4.visibility = View.INVISIBLE
                    binding.front5.visibility = View.INVISIBLE
                    binding.front6.visibility = View.INVISIBLE
                    binding.front7.visibility = View.INVISIBLE

                    binding.rear1.visibility = View.INVISIBLE
                    binding.rear2.visibility = View.INVISIBLE
                    binding.rear3.visibility = View.INVISIBLE
                    binding.rear4.visibility = View.INVISIBLE
                    binding.rear5.visibility = View.INVISIBLE
                    binding.rear6.visibility = View.INVISIBLE
                    binding.rear7.visibility = View.INVISIBLE
                }
            } else {
                Toast.makeText(getContext(), "Queue is Empty can't delete", Toast.LENGTH_SHORT).show()
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
         * @return A new instance of fragment Queue_2_Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Queue_2_Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}