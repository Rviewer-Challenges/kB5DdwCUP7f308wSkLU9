package com.example.clontwitterv2.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.clontwitterv2.R
import com.example.clontwitterv2.databinding.FragmentHomeBinding
import com.example.clontwitterv2.databinding.FragmentNotificacionesBinding

class NotificacionesFragment : Fragment() {

    private lateinit var binding: FragmentNotificacionesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentNotificacionesBinding.inflate(layoutInflater)

        initRecyclerView() //Inicia recyclerView

        return binding.root //devolvemos el context del fragment

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notificaciones, container, false)
    }

    private fun initRecyclerView() {

    }

}