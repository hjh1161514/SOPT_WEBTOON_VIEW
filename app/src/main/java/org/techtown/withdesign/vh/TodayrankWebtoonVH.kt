package org.techtown.withdesign.vh

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.techtown.withdesign.R
import org.techtown.withdesign.data.TodayrankWebtoonData

class TodayrankWebtoonVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var image : ImageView = itemView.findViewById(R.id.todayrank_img)
    var number : TextView = itemView.findViewById(R.id.todayrank_number)
    var title : TextView = itemView.findViewById(R.id.todayrank_title)
    var author : TextView = itemView.findViewById(R.id.todayrank_author)

    fun bind(myData: TodayrankWebtoonData){
        image.setImageResource(myData.todayrank_webtton_img)
        number.text = myData.todayrank_number
        title.text = myData.todayrank_title
        author.text = myData.todayrank_author
    }
}