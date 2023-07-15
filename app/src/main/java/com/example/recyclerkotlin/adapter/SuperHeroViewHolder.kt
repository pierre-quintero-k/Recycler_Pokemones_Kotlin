package com.example.recyclerkotlin.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerkotlin.R
import com.example.recyclerkotlin.SuperHero
import com.example.recyclerkotlin.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View):RecyclerView.ViewHolder(view){

    val binding = ItemSuperheroBinding.bind(view)

    fun render(superHeroModel: SuperHero){
        binding.textPokemon.text = superHeroModel.name
        Glide.with(binding.imagePokemon.context).load(superHeroModel.photo).into(binding.imagePokemon)
    }
}