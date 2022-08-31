package com.example.recyvleviews.controllers
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyvleviews.R
import com.example.recyvleviews.model.ImageModel

class ImagesAdapter (private val context: Context, private val dataset: List<ImageModel>) : RecyclerView.Adapter<ImagesAdapter.ImagesViewHolder>() { //adaptador de imagenes
    class ImagesViewHolder (private val view: View) : RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }  //representante de la vista de las imagenes con sus textos

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagesViewHolder { //grupo de vistas a adjuntar el contenido, y tipo de visibilidad
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ImagesViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ImagesViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.textresourceID)
        holder.imageView.setImageResource(item.imageresourceID)
    }

    override fun getItemCount() = dataset.size //indicar el tamaño de la colección de elementos
}