package com.olele76.paintingandstatue.feature.statue

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.olele76.artgallery.layout.ListStatueAdapter
import com.olele76.artgallery.model.Art
import com.olele76.paintingandstatue.api.myAPI
import com.olele76.paintingandstatue.art.RequestStatue
import com.olele76.paintingandstatue.art.StatueRepo
import com.olele76.paintingandstatue.databinding.FragmentStatueBinding
import com.olele76.paintingandstatue.model.Statue

class StatueFragment : Fragment() {

    private var _binding: FragmentStatueBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var rvStatue: RecyclerView
    private lateinit var listStatueAdapter: ListStatueAdapter

    // Initiate Repo
    lateinit var requestStatue: RequestStatue

    private var items: ArrayList<Statue> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStatueBinding.inflate(inflater, container, false)
        val root: View = binding.root

        rvStatue = binding.recyclerStatue
        rvStatue.setHasFixedSize(true)

        injection()

        initRecyclerView()
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initRecyclerView() {
        generateStatue()

        rvStatue.layoutManager = LinearLayoutManager(context)
        listStatueAdapter = ListStatueAdapter(items)
        rvStatue.adapter = listStatueAdapter
    }

    private fun generateStatue() {
        items.addAll(requestStatue.getAllStatue())
    }

    fun injection(){
        requestStatue = StatueRepo(myAPI)
    }
}