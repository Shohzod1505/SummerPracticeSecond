package com.example.summerpracticesecond.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpracticesecond.R
import com.example.summerpracticesecond.databinding.FragmentHomeBinding
import com.google.android.material.snackbar.Snackbar


class HomeFragment: Fragment(R.layout.fragment_home) {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHomeBinding.bind(view)
        val bMenu = activity!!.findViewById<View>(R.id.bNav)

        val bundle = Bundle()
        binding.btHomeSetting.setOnClickListener {
            bundle.putString("Key", "HomeFragment")
            findNavController().navigate(R.id.action_homeFragment_to_settingFragment, bundle)
            bMenu.visibility = View.GONE
        }
    }

    override fun onStop() {
        super.onStop()
        Snackbar.make(view!!,javaClass.toString(),Snackbar.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}

