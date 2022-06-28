package com.example.clontwitterv2.adaters

import android.graphics.Bitmap
import android.graphics.Matrix
import android.text.util.Linkify
import android.view.Display
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.clontwitterv2.R
import com.example.clontwitterv2.databinding.ItemTuitBinding
import com.example.clontwitterv2.modeloTwitter.Tuit
import java.util.regex.Pattern

class TuitAdapter(val listaTuit:List<Tuit>):RecyclerView.Adapter<TuitAdapter.TuitViewHolder>() {
    /**
     * ViewModel donde vamos a mostrar los datos
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TuitViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return TuitViewHolder(layoutInflater.inflate(R.layout.item_tuit, parent,false))
    }
    /**
     * Muestra los datos
     */
    override fun onBindViewHolder(holder: TuitViewHolder, position: Int) {
        val item = listaTuit[position]
        holder.render(item)
    }
    /**
     * Tamaño de los lista
     */
    override fun getItemCount(): Int {
        return listaTuit.size
    }
    /**
     * Clase ViewHolder, que es la encargada de dibujar los datos en cada celda
     */
    class TuitViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val binding = ItemTuitBinding.bind(view)

        fun render(tuitModel: Tuit) {
            binding.apply {
                nombre.text = tuitModel.nombre
                usuario.text = tuitModel.usuario
                fecha.text = tuitModel.fecha
                texto.text = tuitModel.texto
                tvNumComent.text = tuitModel.numComentarios.toString()
                tvNumLike.text = tuitModel.numLikes.toString()
                tvNumRT.text = tuitModel.numRt.toString()
                avatar.setImageResource(tuitModel.avatar)

                when (tuitModel.imagen.size) {
                    1 -> {

                        //Quitamos la dos imageview
                        ivFoto2.visibility = View.INVISIBLE
                        ivFoto2.layoutParams.width = 0
                        ivFoto3.visibility = View.INVISIBLE
                        ivFoto3.layoutParams.height = 0
                        ivFoto4.visibility = View.INVISIBLE
                        ivFoto4.layoutParams.height = 0

                        if (tuitModel.esGif){
                            ivFoto1.layoutParams.width = ViewGroup.LayoutParams.WRAP_CONTENT
                            ivFoto1.layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
                            Glide.with(ivFoto1.context).load(tuitModel.imagen[0]).into(ivFoto1)
                            ivFoto1.adjustViewBounds = true

                        } else {
                            ivFoto1.setImageResource(tuitModel.imagen[0])
                            ivFoto1.layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
                            ivFoto1.layoutParams.width = ViewGroup.LayoutParams.WRAP_CONTENT
                            ivFoto1.adjustViewBounds = true
                        }

                    }
                    2 -> {
                        ivFoto1.setImageResource(tuitModel.imagen[0])
                        ivFoto2.setImageResource(tuitModel.imagen[1])
                        ivFoto3.visibility = View.INVISIBLE
                        ivFoto3.layoutParams.height = 0
                        ivFoto4.visibility = View.INVISIBLE
                        ivFoto4.layoutParams.height = 0
                    }
                    3 -> {
                        ivFoto1.setImageResource(tuitModel.imagen[0])
                        ivFoto1.layoutParams.width = ViewGroup.LayoutParams.WRAP_CONTENT
                        ivFoto3.setImageResource(tuitModel.imagen[1])
                        ivFoto4.setImageResource(tuitModel.imagen[2])

                    }
                    4 -> {
                        ivFoto1.setImageResource(tuitModel.imagen[0])
                        ivFoto2.setImageResource(tuitModel.imagen[1])
                        ivFoto3.setImageResource(tuitModel.imagen[2])
                        ivFoto4.setImageResource(tuitModel.imagen[3])
                    }
                    else -> {
                        cvImagenes.visibility = View.INVISIBLE
                        cvImagenes.layoutParams.height = 0
                        cvImagenes.layoutParams.width = 0
                    }
                }

                //Añadir para que resalte link de menciones, hashtag o Urls
                Linkify.addLinks(texto,Linkify.WEB_URLS)
                Linkify.addLinks(texto, Pattern.compile("[#][A-Za-z0-9-_]+"),"")
                Linkify.addLinks(texto, Pattern.compile("[@][A-Za-z0-9-_]+"),"")

                // Click en el botón de editar
                ivEdit.setOnClickListener {
                    AlertDialog.Builder(ivEdit.context).setMessage("Pues ya tengo el botón de editar Tuit, " +
                                                                "preparado para cuando el señor Musk nos lo habilite")
                        .setTitle("Editar...")
                        .setPositiveButton("Ok") { _, _ -> ""}
                        .create()
                        .show()
                }

            }
        }
    }
}


