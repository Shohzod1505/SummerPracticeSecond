package com.example.rt

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.rt.databinding.FragmentSecondBinding

class InfoFragment: Fragment(R.layout.fragment_second) {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSecondBinding.bind(view)

        text(arguments!!.getInt("Key"))

        binding.btBack.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_mainFragment)
        }
    }

    private fun text(id: Int){

        binding.tvDescription.text = CountryData.countries.find { it.id == id }?.description + "\n" +
                "ID: ${CountryData.countries.find { it.id == id }?.id}\n" +
                "Url: ${CountryData.countries.find { it.id == id }?.url}"
    }
}