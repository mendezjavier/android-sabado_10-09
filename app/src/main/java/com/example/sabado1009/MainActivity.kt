package com.example.sabado1009

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var listaView: RecyclerView
    private lateinit var adapter: PeliculasAdapter
    private val repoPeliculas = RepositorioPeliculas()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listaView = findViewById(R.id.lista)
        adapter = PeliculasAdapter(this)
        listaView.adapter = adapter

        adapter.establecerPeliculas(repoPeliculas.obtenerPeliculas())
    }
}