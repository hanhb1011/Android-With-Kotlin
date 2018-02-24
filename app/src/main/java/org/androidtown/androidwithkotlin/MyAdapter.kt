package org.androidtown.androidwithkotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.cell.view.*

/**
 * Created by hanhb on 2018-02-22.
 */
class MyAdapter(val context :Context, val list: List<Item>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        val view :View = LayoutInflater.from(context).inflate(R.layout.cell, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {
        holder?.bind(list[position])

    }

    override fun getItemCount(): Int {
        return list.size

    }


    class MyViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {

        var textView :TextView? = null

        init {
            textView = itemView.tv_in_cell
        }

        fun bind(item: Item){
            textView?.text = item.text
        }
    }

}


