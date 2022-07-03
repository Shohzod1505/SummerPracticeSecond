package com.example.summerpracticethird

import androidx.recyclerview.widget.RecyclerView
import com.example.summerpracticethird.databinding.CountryItemBinding

class CountryHolder (private val binding: CountryItemBinding,
                     private val onItemClick: (Country) -> Unit
): RecyclerView.ViewHolder(binding.root) {

        fun bind(country: Country) = with(binding){
            flag.setImageResource(country.flag)
            name.text = country.name
            root.setOnClickListener{
                onItemClick(country)
            }
        }
}