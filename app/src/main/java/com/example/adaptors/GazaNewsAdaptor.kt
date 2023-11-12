package com.example.adaptors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.gazastrip.R

data class data(val number:Int )
class GazaNewsAdaptor:RecyclerView.Adapter<GazaNewsAdaptor.NewsItemsViewHolder>() {
var item= listOf<data>()
    set(value)  {
        field=value
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: NewsItemsViewHolder, position: Int) {
val it=item[position]
        val res = holder.itemView.context.resources
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsItemsViewHolder {
val view =LayoutInflater.from(parent.context)
    .inflate(R.layout.news_items,parent,false)
        return NewsItemsViewHolder(view)
    }
    override fun getItemCount()= item.size
    class NewsItemsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
val image =itemView.findViewById<ImageView>(R.id.new_it_im)
    val news=itemView.findViewById<TextView>(R.id.news_name_tv)
    }
}







