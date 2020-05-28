package org.techtown.withdesign.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import org.techtown.withdesign.R
import org.techtown.withdesign.data.ChallengeBannerData
import org.techtown.withdesign.vh.ChallengeBannerVH

class ChallengeBannerAdapter (private val context : Context) : RecyclerView.Adapter<ChallengeBannerVH>(){
    var data : ArrayList<ChallengeBannerData> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChallengeBannerVH {
        val view = LayoutInflater.from(context).inflate(R.layout.challenge_view_item,parent, false)
        view.layoutParams = ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        return ChallengeBannerVH(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ChallengeBannerVH, position: Int) {
        holder.onBind(data[position])
    }

    fun addItem(item : ChallengeBannerData){
        data.add(item)
    }
}