package com.olele76.paintingandstatue.art

import com.olele76.artgallery.model.Art
import com.olele76.paintingandstatue.api.PaintingAndStatueAPI

class RandomPaintingRepo(val api:PaintingAndStatueAPI): RequestRandomPainting {
    override fun getRandomPainting(): Art {
        return api.getRandomArt()
    }
}