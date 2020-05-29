package org.techtown.withdesign.vh

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import org.techtown.withdesign.R
import org.techtown.withdesign.data.HomeBannerData

class HomeBannerVH (itemView : View) : RecyclerView.ViewHolder(itemView){
    var home : ImageView = itemView.findViewById(R.id.img_homeBanner)

    fun onBind(data : HomeBannerData){
        home.setImageResource(data.img)
    }
}