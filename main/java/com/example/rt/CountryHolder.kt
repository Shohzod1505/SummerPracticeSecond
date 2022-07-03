package com.example.rt

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rt.databinding.CountryItemBinding


class CountryHolder(
    private val binding: CountryItemBinding,
    private val onItemClick: (Country) -> Unit,
): RecyclerView.ViewHolder(binding.root) {

        fun bind(country: Country) = with(binding){
            Glide.with(root)
                .load(country.url)
                .into(flag)
            name.text = country.name
            root.setOnClickListener{
                onItemClick(country)
            }


        }


}