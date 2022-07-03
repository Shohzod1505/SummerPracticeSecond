package com.example.summerpracticesecond.fragments

import android.os.Bundle

object ArgName {
    const val ARG_FRAGMENT_NAME = "name"

    fun createBundle(text: String): Bundle {
        val bundle = Bundle()
        bundle.putString(
            ARG_FRAGMENT_NAME,
            text
        )
        return bundle
    }
}