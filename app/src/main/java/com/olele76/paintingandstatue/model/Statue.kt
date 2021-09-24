package com.olele76.paintingandstatue.model

import com.olele76.artgallery.model.Art

abstract class Statue(
    id: String, title: String, desc: String, imageUrl: String, category: String, artist: String
) : Art(id, title, desc, imageUrl, category, artist) {
    abstract val medium:String
}