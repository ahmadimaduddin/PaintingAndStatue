package com.olele76.paintingandstatue.art


import com.olele76.paintingandstatue.model.Statue

interface RequestStatue {
    fun getAllStatue(): List<Statue>
}