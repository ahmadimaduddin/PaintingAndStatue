package com.olele76.artgallery.model

class Painting(
    id: String,
    title: String,
    desc: String,
    imageUrl: String,
    category: String,
    artist: String
) : Art(
    id,
    title,
    desc,
    imageUrl,
    category,
    artist
)