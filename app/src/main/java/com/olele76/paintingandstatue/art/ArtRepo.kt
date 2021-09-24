package com.olele76.artgallery.art

import com.olele76.artgallery.WorkerAPI
import com.olele76.artgallery.model.Art
import com.olele76.paintingandstatue.api.PaintingAndStatueAPI

class ArtRepo(val api: PaintingAndStatueAPI) : RequestArt {
    override fun getAllArt(): List<Art> {
        return api.getAllArt()
    }
}