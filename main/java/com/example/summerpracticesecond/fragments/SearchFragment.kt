package com.example.summerpracticesecond.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpracticesecond.R
import com.example.summerpracticesecond.databinding.FragmentSearchBinding
import com.google.android.material.snackbar.Snackbar

class SearchFragment:Fragment(R.layout.fragment_search) {
    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSearchBinding.bind(view)
        val bMenu = activity!!.findViewById<View>(R.id.bNav)

        val bundle = Bundle()
        binding.btSearchSetting.setOnClickListener {
            bundle.putString("Key", "SearchFragment")
            findNavController().navigate(R.id.action_searchFragment_to_settingFragment, bundle)
            bMenu.visibility = View.GONE
        }
    }

    override fun onStop() {
        super.onStop()
        Snackbar.make(view!!,javaClass.toString(), Snackbar.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}