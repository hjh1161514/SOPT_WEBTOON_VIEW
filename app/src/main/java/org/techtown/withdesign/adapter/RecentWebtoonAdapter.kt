package org.techtown.withdesign.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.techtown.withdesign.R
import org.techtown.withdesign.data.RecentWebtoonData
import org.techtown.withdesign.vh.RecentWebtoonVH

class RecentWebtoonAdapter(private val context : Context) : RecyclerView.Adapter<RecentWebtoonVH>() {
    var datas = mutableListOf<RecentWebtoonData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentWebtoonVH {
        val view = LayoutInflater.from(context).inflate(R.layout.item_recentwebtoon,parent,false)
        return RecentWebtoonVH(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: RecentWebtoonVH, position: Int) {
        holder.bind(datas[position])
    }

    fun addItem(item : RecentWebtoonData){
        datas.add(item)
    }
}