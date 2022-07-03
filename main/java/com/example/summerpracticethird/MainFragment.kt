package com.example.summerpracticethird

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpracticethird.databinding.FragmentMainBinding

class MainFragment: Fragment(R.layout.fragment_main) {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)

        binding.button3.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_infoFragment)
        }
    }
}


//import androidx.recyclerview.widget.GridLayoutManager
//    private var adapter: CountryAdapter? = null
//        adapter = CountryAdapter(CountryData.countries) {
//            findNavController().navigate(R.id.info_fragment)
//        }
//        binding.rcView.layoutManager = GridLayoutManager(context,2)
//        binding.rcView.adapter = adapter