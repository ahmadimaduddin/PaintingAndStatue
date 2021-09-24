package com.olele76.artgallery.layout

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.olele76.artgallery.model.Art
import com.olele76.paintingandstatue.databinding.StatueItemLayoutBinding
import com.olele76.paintingandstatue.model.Statue

class ListStatueAdapter(var items: ArrayList<Statue>) :
    RecyclerView.Adapter<ListStatueAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val binding =
            StatueItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val item = items[position]
        Glide.with(holder.itemView.context)
            .load(item.imageUrl)
            .apply(RequestOptions().override(100, 100))
            .into(holder.binding.imageDisplay)
        holder.binding.tvTitle.text = item.title
        holder.binding.tvDesc.text = item.desc
        holder.binding.tvMedium.text = item.medium
    }

    override fun getItemCount(): Int {
        return items.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateData(items: ArrayList<Statue>) {
        this.items = items
        notifyDataSetChanged()
    }

    inner class ListViewHolder(var binding: StatueItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

}