package com.olele76.paintingandstatue.art

import com.olele76.artgallery.model.Art

interface RequestRandomPainting {
    fun getRandomPainting(): Art
}