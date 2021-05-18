package com.example.td4_exo4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LessonAdapter(val context: Context, var data:List<Lesson>):
    RecyclerView.Adapter<LessonAdapter.MyViewHolder>()
{
    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val lessonDescript = view.findViewById<TextView>(R.id.itemTitle) as TextView
        val lessonDate= view.findViewById<TextView>(R.id.itemDate) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.lessonDescript.text=  data[position].module.intutile
        holder.lessonDate.text=data[position].dateL.toString()
        holder.itemView.setOnClickListener {
            
        }
    }

    override fun getItemCount(): Int =data.size
}