package com.example.pokemonapp.data.model.pokemondetail


import com.google.gson.annotations.SerializedName

data class GenerationV(
    @SerializedName("black-white")
    val blackWhite: BlackWhite
)