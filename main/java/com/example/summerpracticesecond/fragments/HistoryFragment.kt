package com.example.summerpracticesecond.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.summerpracticesecond.R
import com.example.summerpracticesecond.databinding.FragmentHomeBinding
import com.google.android.material.snackbar.Snackbar

class HistoryFragment: Fragment(R.layout.fragment_history) {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHomeBinding.bind(view)
    }

    override fun onStop() {
        super.onStop()
        Snackbar.make(view!!,javaClass.toString(), Snackbar.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}