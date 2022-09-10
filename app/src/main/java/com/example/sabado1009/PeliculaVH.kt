package com.example.sabado1009

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PeliculasVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val titulo: TextView = itemView.findViewById(R.id.titulo)
    val fecha: TextView = itemView.findViewById(R.id.fecha)
    val imagen: ImageView = itemView.findViewById(R.id.imagen)
}

class PeliculasAdapter(private val context: Context) : RecyclerView.Adapter<PeliculasVH>() {
    private var peliculas: Array<Pelicula> = emptyArray()

    fun establecerPeliculas(nuevasPeliculas: Array<Pelicula>) {
        this.peliculas = nuevasPeliculas
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculasVH {
        val inflater = LayoutInflater.from(context)
        val vista = inflater.inflate(R.layout.pelicula, parent, false)
        return PeliculasVH(vista)
    }

    override fun onBindViewHolder(holder: PeliculasVH, position: Int) {
        val pelicula = this.peliculas[position]
        holder.titulo.text = pelicula.titulo
        holder.fecha.text = pelicula.fecha
        holder.imagen.setImageResource(pelicula.imagen)
    }

    override fun getItemCount(): Int {
        return this.peliculas.size
    }


}