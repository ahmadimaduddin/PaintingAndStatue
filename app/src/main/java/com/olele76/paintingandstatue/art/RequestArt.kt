package com.olele76.artgallery.art

import com.olele76.artgallery.model.Art

interface RequestArt {
    fun getAllArt(): List<Art>
}