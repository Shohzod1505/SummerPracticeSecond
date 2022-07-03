package com.example.summerpracticesecond.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpracticesecond.R
import com.example.summerpracticesecond.databinding.FragmentFavoriteBinding
import com.google.android.material.snackbar.Snackbar

class FavoriteFragment: Fragment(R.layout.fragment_favorite) {
    private var _binding: FragmentFavoriteBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentFavoriteBinding.bind(view)
        val bMenu = activity!!.findViewById<View>(R.id.bNav)

        val bundle = Bundle()
        binding.btFavoriteSetting.setOnClickListener {
            bundle.putString("Key", "FavoriteFragment")
            findNavController().navigate(R.id.action_favoriteFragment_to_settingFragment, bundle)
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