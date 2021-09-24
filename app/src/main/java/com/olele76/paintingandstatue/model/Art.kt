package com.olele76.artgallery.model

abstract class Art(
    val id: String,
    val title: String,
    val desc: String,
    val imageUrl: String,
    val category: String,
    val artist: String
)