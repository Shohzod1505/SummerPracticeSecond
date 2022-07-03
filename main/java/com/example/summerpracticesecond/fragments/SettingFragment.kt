package com.example.summerpracticesecond.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpracticesecond.R
import com.example.summerpracticesecond.databinding.FragmnetSettingBinding

class SettingFragment: Fragment(R.layout.fragmnet_setting) {
    private var _binding: FragmnetSettingBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmnetSettingBinding.bind(view)
        val bMenu = activity!!.findViewById<View>(R.id.bNav)

        with(binding){
           when(arguments?.getString("Key")) {
               "HomeFragment" -> btBack.setOnClickListener {
                   findNavController().navigate(R.id.action_settingFragment_to_homeFragment)
                   bMenu.visibility = View.VISIBLE
               }
               "SearchFragment" -> btBack.setOnClickListener {
                   findNavController().navigate(R.id.action_settingFragment_to_searchFragment)
                   bMenu.visibility = View.VISIBLE
               }
               "MediaFragment" -> btBack.setOnClickListener {
                   findNavController().navigate(R.id.action_settingFragment_to_mediaFragment)
                   bMenu.visibility = View.VISIBLE
               }
               "FavoriteFragment" -> btBack.setOnClickListener {
                   findNavController().navigate(R.id.action_settingFragment_to_favoriteFragment)
                   bMenu.visibility = View.VISIBLE
               }
               "HistoryFragment" -> btBack.setOnClickListener {
                   findNavController().navigate(R.id.action_settingFragment_to_historyFragment)
                   bMenu.visibility = View.VISIBLE
               }
           }

        }


    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}
