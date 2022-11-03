package com.example.learndatastructures.LinkedlistFragments

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import com.example.learndatastructures.R
import com.example.learndatastructures.databinding.FragmentCircularQueue3Binding
import com.example.learndatastructures.databinding.FragmentLInkedList3Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LInkedList_3_Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LInkedList_3_Fragment : Fragment() {
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

    private lateinit var binding: FragmentLInkedList3Binding
    var i = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLInkedList3Binding.inflate(inflater, container, false)
        return binding.getRoot()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.webView1.webViewClient = WebViewClient()
        binding.webView1.loadUrl("https://www.programiz.com/dsa/linked-list")

        binding.swipeRefreshLayout1.setOnRefreshListener {

            if(i==1) {
                binding.webView1.loadUrl("https://www.javatpoint.com/singly-linked-list")
                binding.swipeRefreshLayout1.isRefreshing = false
                i++
            }
            else if(i==2) {
                binding.webView1.loadUrl("https://www.scaler.com/topics/linked-list/")
                binding.swipeRefreshLayout1.isRefreshing = false
                i++
            }
            else if(i==3){
                binding.webView1.loadUrl("https://www.tutorialspoint.com/data_structures_algorithms/linked_list_program_in_c.htm")
                binding.swipeRefreshLayout1.isRefreshing = false
                i++
            }
            else if(i==4){
                binding.webView1.loadUrl("https://www.hackerearth.com/practice/data-structures/linked-list/singly-linked-list/tutorial/")
                binding.swipeRefreshLayout1.isRefreshing = false
                i++
            }
            else if(i==5){
                binding.webView1.loadUrl("https://www.programiz.com/dsa/linked-list")
                binding.swipeRefreshLayout1.isRefreshing = false
                i = 1
            }
        }

        binding.tvNote1.ellipsize = TextUtils.TruncateAt.MARQUEE
        binding.tvNote1.isSelected = true


    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LInkedList_3_Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LInkedList_3_Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}