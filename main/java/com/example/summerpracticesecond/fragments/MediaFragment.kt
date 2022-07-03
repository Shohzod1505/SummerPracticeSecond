package com.example.summerpracticesecond.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpracticesecond.R
import com.example.summerpracticesecond.databinding.FragmentMediaBinding
import com.google.android.material.snackbar.Snackbar

class MediaFragment: Fragment(R.layout.fragment_media) {
    private var _binding: FragmentMediaBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMediaBinding.bind(view)
        val bMenu = activity!!.findViewById<View>(R.id.bNav)

        val bundle = Bundle()
        binding.btMediaSetting.setOnClickListener {
            bundle.putString("Key", "MediaFragment")
            findNavController().navigate(R.id.action_mediaFragment_to_settingFragment, bundle)
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