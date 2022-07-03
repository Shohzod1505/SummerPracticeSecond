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

        when(arguments?.getInt("Key")){
            1 -> binding.tvDescription.text = CountryData.countries[0].description
            2 -> binding.tvDescription.text = CountryData.countries[1].description
            3 -> binding.tvDescription.text = CountryData.countries[2].description
            4 -> binding.tvDescription.text = CountryData.countries[3].description
            5 -> binding.tvDescription.text = CountryData.countries[4].description
            6 -> binding.tvDescription.text = CountryData.countries[5].description
            7 -> binding.tvDescription.text = CountryData.countries[6].description
            8 -> binding.tvDescription.text = CountryData.countries[7].description
        }

        binding.btBack.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_mainFragment)
        }
    }
}