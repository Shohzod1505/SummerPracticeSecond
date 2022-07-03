package com.example.summerpracticethird

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpracticethird.databinding.FragmentInfoBinding

class InfoFragment: Fragment(R.layout.fragment_info) {
    private var _binding: FragmentInfoBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentInfoBinding.bind(view)

        binding.button2.setOnClickListener{
            findNavController().navigate(R.id.action_infoFragment_to_mainFragment)
        }

    }
}