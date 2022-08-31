package com.example.recyvleviews.controllers
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyvleviews.R
import com.example.recyvleviews.model.ImageModel
import com.squareup.picasso.Picasso

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
        holder.textView.text = context.resources.getString(item.textresourceID) //crear el listener a cada holder que se le pasen los datos, donde el parametro es el string con su posición
        holder.imageView.setOnClickListener { createAndShowToast("Posición: ${position}") }
        Picasso.get().load(item.imageURL)
            .placeholder(R.drawable.ic_launcher_foreground)
            .error(R.drawable.notfound)
            .into(holder.imageView);
    }

    override fun getItemCount() = dataset.size //indicar el tamaño de la colección de elementos

    private fun createAndShowToast(text:String) {

        val toast = Toast(context).apply {
            setText(text)
            setDuration(Toast.LENGTH_SHORT)
        }

        toast.show()
    }
}