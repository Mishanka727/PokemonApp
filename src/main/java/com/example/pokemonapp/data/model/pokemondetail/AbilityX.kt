package com.example.pokemonapp.data.model.pokemondetail


import com.google.gson.annotations.SerializedName

data class AbilityX(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)