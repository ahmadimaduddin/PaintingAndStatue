package com.olele76.paintingandstatue.art

import com.olele76.paintingandstatue.api.PaintingAndStatueAPI
import com.olele76.paintingandstatue.model.Statue

class StatueRepo(val api: PaintingAndStatueAPI): RequestStatue {
    override fun getAllStatue(): List<Statue> {
        return api.getAllStatue()
    }
}