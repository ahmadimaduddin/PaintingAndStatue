package com.olele76.paintingandstatue.api

import com.olele76.artgallery.model.Art
import com.olele76.paintingandstatue.model.Statue

interface PaintingAndStatueAPI{
    fun getAllArt():ArrayList<Art>
    fun getRandomArt(): Art
    fun getAllStatue():ArrayList<Statue>
}

