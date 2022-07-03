package com.example.rt

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.rt.databinding.FragmentMainBinding

class MainFragment: Fragment(R.layout.fragment_main) {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private var adapter: CountryAdapter? = null
    val bundle = Bundle()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)


        adapter = CountryAdapter(CountryData.countries) {
            bundle.putInt("Key", it.id)
            findNavController().navigate(R.id.action_mainFragment_to_secondFragment, bundle)
        }
        binding.rcView.layoutManager = GridLayoutManager(context,2)
        binding.rcView.adapter = adapter

    }
}


