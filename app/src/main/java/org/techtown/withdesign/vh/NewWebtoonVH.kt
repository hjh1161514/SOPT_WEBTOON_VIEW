package org.techtown.withdesign.vh

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import org.techtown.withdesign.R
import org.techtown.withdesign.data.NewWebtoonData

class NewWebtoonVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var image : ImageView = itemView.findViewById(R.id.new_webtoon_img)
    fun bind(myData: NewWebtoonData) {
        image.setImageResource(myData.new_webtton_img)
    }
}