package com.example.recyvleviews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyvleviews.controllers.ImagesAdapter
import com.example.recyvleviews.data.ImagesBank

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //generar los datos
        val ImgSet = ImagesBank().LoadImages()
        //crear el recycle view con el adaptador
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = GridLayoutManager(this,2)
        recyclerView.adapter = ImagesAdapter(this, ImgSet)
        recyclerView.setHasFixedSize(true)
    }
}