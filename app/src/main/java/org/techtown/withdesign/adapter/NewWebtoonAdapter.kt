package org.techtown.withdesign.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.techtown.withdesign.R
import org.techtown.withdesign.data.NewWebtoonData
import org.techtown.withdesign.vh.NewWebtoonVH
import org.techtown.withdesign.vh.RecentWebtoonVH

class NewWebtoonAdapter(private val context : Context) : RecyclerView.Adapter<NewWebtoonVH>() {
    var datas = mutableListOf<NewWebtoonData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewWebtoonVH {
        val view = LayoutInflater.from(context).inflate(R.layout.item_newwebtoon,parent,false)
        return NewWebtoonVH(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: NewWebtoonVH, position: Int) {
        holder.bind(datas[position])
    }

    fun addItem(item : NewWebtoonData){
        datas.add(item)
    }
}