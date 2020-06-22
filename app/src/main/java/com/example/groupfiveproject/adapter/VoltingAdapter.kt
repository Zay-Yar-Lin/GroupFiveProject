package com.example.groupfiveproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.groupfiveproject.R
import com.example.groupfiveproject.model.KingItem

class VoltingAdapter (var kingList: List<KingItem>): RecyclerView.Adapter<VoltingAdapter.VoltingViewHolder>(){

    inner class VoltingViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun bind(kingItem: KingItem){

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VoltingViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.activity_main, parent , false)
        return VoltingViewHolder(view)
    }

    override fun getItemCount(): Int {
        return kingList.size
    }

    override fun onBindViewHolder(holder: VoltingViewHolder, position: Int) {
        holder.bind(kingList [position])
    }

}