package org.techtown.withdesign.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.techtown.withdesign.R
import org.techtown.withdesign.data.TodayrankWebtoonData
import org.techtown.withdesign.vh.TodayrankWebtoonVH

class TodayrankWebtoonAdapter(private val context : Context) : RecyclerView.Adapter<TodayrankWebtoonVH>() {
    var datas = mutableListOf<TodayrankWebtoonData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodayrankWebtoonVH {
        val view = LayoutInflater.from(context).inflate(R.layout.item_todayrank_webtoon,parent,false)
        return TodayrankWebtoonVH(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: TodayrankWebtoonVH, position: Int) {
        holder.bind(datas[position])
    }

    fun addItem(item : TodayrankWebtoonData){
        datas.add(item)
    }
}