package org.techtown.withdesign.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Outline
import android.graphics.drawable.Drawable
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewOutlineProvider
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.homebanner_view_item.view.*
import org.techtown.withdesign.R
import org.techtown.withdesign.data.HomeBannerData
import org.techtown.withdesign.vh.HomeBannerVH

class HomeBannerAdapter (private val context : Context) : RecyclerView.Adapter<HomeBannerVH>(){
    var data : ArrayList<HomeBannerData> = arrayListOf()

    @SuppressLint("ResourceType")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeBannerVH {
        val view = LayoutInflater.from(context).inflate(R.layout.homebanner_view_item,parent, false)
        view.layoutParams = ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)

        view.img_homeBanner.outlineProvider = object : ViewOutlineProvider() {

            @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
            override fun getOutline(view: View?, outline: Outline?) {
                outline?.setRoundRect(0, -50, view!!.width, (view.height).toInt(), 50f)
            }
        }

        view.img_homeBanner.clipToOutline = true

        return HomeBannerVH(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: HomeBannerVH, position: Int) {
        holder.onBind(data[position])
    }

    fun addItem(item : HomeBannerData){
        data.add(item)
    }
}