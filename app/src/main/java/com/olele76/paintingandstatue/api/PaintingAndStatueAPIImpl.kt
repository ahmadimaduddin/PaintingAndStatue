package com.olele76.paintingandstatue.api

import com.olele76.artgallery.WorkerAPI
import com.olele76.artgallery.model.Art
import com.olele76.paintingandstatue.model.Statue

class PaintingAndStatueImplementation(override val url: String) : WorkerAPI(), PaintingAndStatueAPI {
    // Extends biasanya dipakai ketika sudah disiapkan cetakan/blueprint dan kita tinggal mencetak/men-copynya
    // Di sini WorkerAPI sudah disiapkan tinggal diset url-nya saja
    override fun getAllArt(): ArrayList<Art> {
        return httpGetAllArt()
    }

    override fun getRandomArt(): Art {
        return httpGetSingleRandomPainting()
    }

    override fun getAllStatue(): ArrayList<Statue> {
        return httpGetAllStatue()
    }
}

val myAPI:PaintingAndStatueAPI = PaintingAndStatueImplementation("https://painting_and_statue_company")