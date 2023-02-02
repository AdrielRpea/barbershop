package com.example.jkt12_dompetku.Stylepack

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jkt12_dompetku.R

class StyleAdapter (private val context: Context, private val style: List<Style>,val listener: (Style) -> Unit)
    :  RecyclerView.Adapter<StyleAdapter.StyleViewHolder>(){


    class StyleViewHolder (view: View) : RecyclerView.ViewHolder(view){

        val imgStyle = view.findViewById<ImageView>(R.id.ST1Gambar)
        val nameStyle = view.findViewById<TextView>(R.id.ST1Name)
        val hargaStyle = view.findViewById<TextView>(R.id.ST1Harga)
        val timeStyle = view.findViewById<TextView>(R.id.ST1Timing)

        fun bindView(style: Style, listener: (Style) -> Unit){
            imgStyle.setImageResource(style.imgStyle)
            nameStyle.text = style.nameStyle
            hargaStyle.text = style.hargaStyle
            timeStyle.text = style.timeStyle
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StyleViewHolder {
        return StyleViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_style, parent, false)
        )
    }

    override fun onBindViewHolder(holder: StyleViewHolder, position: Int) {
        holder.bindView(style[position],listener)
    }
    override fun getItemCount(): Int = style.size
}