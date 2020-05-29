package org.techtown.withdesign.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.techtown.withdesign.R
import org.techtown.withdesign.data.WebtoonData
import org.techtown.withdesign.vh.WebtoonVH

class WebtoonAdapter(private val context : Context) : RecyclerView.Adapter<WebtoonVH>() {
    var datas = mutableListOf<WebtoonData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WebtoonVH {
        val view = LayoutInflater.from(context).inflate(R.layout.item_webtoon,parent,false)
        return WebtoonVH(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: WebtoonVH, position: Int) {
        holder.bind(datas[position])
    }

    fun addItem(item : WebtoonData){
        datas.add(item)
    }
}