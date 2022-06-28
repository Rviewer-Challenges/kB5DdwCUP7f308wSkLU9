package com.example.clontwitterv2

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.example.clontwitterv2.databinding.ActivityMainBinding
import com.example.clontwitterv2.fragment.HomeFragment
import com.example.clontwitterv2.fragment.NotificacionesFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Carga el fragmen de Home
        cargarFragment(HomeFragment())

        // Listener de los botones dela BottomNavigationView
        binding.bnvBotones.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.inicio -> {
                    binding.logoTwitter.visibility = View.VISIBLE
                    cargarFragment(HomeFragment())
                    return@setOnItemSelectedListener true
                }
                R.id.buscar -> {
                    Toast.makeText(this,"BUSCAR",Toast.LENGTH_SHORT).show()
                    return@setOnItemSelectedListener true
                }
                R.id.notificacion -> {
                    binding.logoTwitter.visibility = View.INVISIBLE
                    Toast.makeText(this,"Notificaciones",Toast.LENGTH_SHORT).show()
                    cargarFragment(NotificacionesFragment())
                    return@setOnItemSelectedListener true
                }
                R.id.mensajes -> {
                    Toast.makeText(this,"Mensajes",Toast.LENGTH_SHORT).show()
                    return@setOnItemSelectedListener true
                }
                else -> {
                    return@setOnItemSelectedListener false
                }
            }
        }

        binding.estrellasToolBar.setOnClickListener {
            AlertDialog.Builder(this).setMessage("No se para que vale en Twitter este botón, así que imaginate aquí")
                .setTitle("Ni idea")
                .setPositiveButton("Ok") { _, _ -> ""}
                .create()
                .show()
        }
    }

    /**
     * Método para cambiar el fragment
     *
     * @param fragment El Fragment (clase Fragment) que queremos usar
     */
    private fun cargarFragment(fragment:Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frament_contenedor,fragment)
            .commit()
    }
}


