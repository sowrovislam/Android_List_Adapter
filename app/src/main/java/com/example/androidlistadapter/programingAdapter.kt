package com.example.androidlistadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.DiffUtil.ItemCallback
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class programingAdapter:ListAdapter<programingItem,programingAdapter.programingViewHolder>(COMARATOR){




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): programingViewHolder {
     val view=LayoutInflater.from(parent.context).inflate(R.layout.item_laytout,parent,false)
        return programingViewHolder(view)


    }

    override fun onBindViewHolder(holder: programingViewHolder, position: Int) {

        val item=getItem(position)


        holder.bind(item)






    }





    class programingViewHolder(view: View):RecyclerView.ViewHolder(view){


        val title =view.findViewById<TextView>(R.id.title)
        val name =view.findViewById<TextView>(R.id.name)

        val id =view.findViewById<TextView>(R.id.id)



        fun bind(item: programingItem){


            name.text=item.name

            title.text=item.title

            id.text=item.id.toString()

        }


    }




    companion object {
        val COMARATOR = object : DiffUtil.ItemCallback<programingItem>() {
            override fun areItemsTheSame(oldItem: programingItem, newItem: programingItem): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: programingItem, newItem: programingItem): Boolean {
                return oldItem.id == newItem.id
            }
        }
}

}