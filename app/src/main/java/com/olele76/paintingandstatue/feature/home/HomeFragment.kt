package com.olele76.paintingandstatue.feature.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.olele76.artgallery.DummyAPI
import com.olele76.artgallery.WorkerAPI
import com.olele76.artgallery.art.ArtRepo
import com.olele76.artgallery.art.RequestArt
import com.olele76.artgallery.layout.ListArtAdapter
import com.olele76.artgallery.model.Art
import com.olele76.artgallery.model.Painting
import com.olele76.paintingandstatue.api.myAPI
import com.olele76.paintingandstatue.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var rvHome: RecyclerView
    private lateinit var listArtAdapter: ListArtAdapter

    // Initiate Repo
    lateinit var requestArt:RequestArt

    private var items: ArrayList<Art> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        rvHome = binding.recyclerStatue
        rvHome.setHasFixedSize(true)

        injection()

        initRecyclerView()

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initRecyclerView() {
        generatePainting()

        rvHome.layoutManager = LinearLayoutManager(context)
        listArtAdapter = ListArtAdapter(items)
        rvHome.adapter = listArtAdapter
    }

    private fun generatePainting() {
        items.addAll(requestArt.getAllArt())
    }

    fun injection(){
        requestArt = ArtRepo(myAPI)
    }
}