package com.example.clontwitterv2.fragment

import android.os.Bundle
import android.text.util.Linkify
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.clontwitterv2.R
import com.example.clontwitterv2.adaters.TuitAdapter
import com.example.clontwitterv2.databinding.FragmentHomeBinding
import com.example.clontwitterv2.modeloTwitter.TuitProvider


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflamos el viewbinding
        binding = FragmentHomeBinding.inflate(layoutInflater)

        initRecyclerView() //Inicia recyclerView

        return binding.root //devolvemos el context del fragment
    }

    private fun initRecyclerView() {
        binding.rvTwitter.layoutManager = LinearLayoutManager(context)
        binding.rvTwitter.adapter = TuitAdapter(TuitProvider.listaTuit)

    }

}