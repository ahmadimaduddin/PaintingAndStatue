package com.olele76.paintingandstatue.feature.painting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.olele76.artgallery.model.Art
import com.olele76.paintingandstatue.api.myAPI
import com.olele76.paintingandstatue.art.RandomPaintingRepo
import com.olele76.paintingandstatue.art.RequestRandomPainting
import com.olele76.paintingandstatue.databinding.FragmentPaintingBinding

class PaintingFragment : Fragment() {

    private var _binding: FragmentPaintingBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    // Initiate Repo
    lateinit var requestRandomPainting: RequestRandomPainting

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPaintingBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.btnGacha.setOnClickListener {
            val itemPulled: Art = requestRandomPainting.getRandomPainting()
            Glide.with(requireActivity())
                .load(itemPulled.imageUrl)
                .into(binding.imageRandom)
            binding.tvRandomTitle.text = itemPulled.title
        }

        injection()

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun injection(){
        requestRandomPainting = RandomPaintingRepo(myAPI)
    }

}