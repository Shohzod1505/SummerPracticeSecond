package com.example.summerpracticethird

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.summerpracticethird.databinding.CountryItemBinding

class CountryAdapter(private val countryList: List<Country>,
                     private val onItemClick: (Country) -> Unit
): RecyclerView.Adapter<CountryHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryHolder = CountryHolder(
            CountryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false), onItemClick)

    override fun onBindViewHolder(holder: CountryHolder, position: Int) {
        holder.bind(countryList[position])
    }

    override fun getItemCount(): Int = countryList.size
}


