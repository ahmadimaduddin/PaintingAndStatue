package com.olele76.paintingandstatue.model

import com.olele76.paintingandstatue.model.Statue

class Sculpture(
    id: String, title: String, desc: String, imageUrl: String, category: String, artist: String,
    override val medium: String
) : Statue(id, title, desc, imageUrl, category, artist)