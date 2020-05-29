package org.techtown.withdesign.vh

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.techtown.withdesign.R
import org.techtown.withdesign.data.WebtoonData

class WebtoonVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var image : ImageView = itemView.findViewById(R.id.webtoon_img)
    var title : TextView = itemView.findViewById(R.id.webtoon_title)
    var author : TextView = itemView.findViewById(R.id.webtoon_author)
    var score : TextView = itemView.findViewById(R.id.webtoon_score)

    fun bind(myData: WebtoonData){
        image.setImageResource(myData.webtoon_img)
        title.text = myData.webtoon_title
        author.text = myData.webtoon_autohr
        score.text = myData.webtoon_score
    }
}