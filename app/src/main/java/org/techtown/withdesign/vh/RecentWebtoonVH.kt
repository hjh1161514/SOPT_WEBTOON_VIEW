package org.techtown.withdesign.vh

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.techtown.withdesign.R
import org.techtown.withdesign.data.RecentWebtoonData

class RecentWebtoonVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var image : ImageView = itemView.findViewById(R.id.recentwebtoon_img)
    var episode : TextView = itemView.findViewById(R.id.episode)
    var title : TextView = itemView.findViewById(R.id.recentwebtoon_title)
    var author : TextView = itemView.findViewById(R.id.recentwebtoon_author)
    var score : TextView = itemView.findViewById(R.id.recent_score)

    fun bind(myData: RecentWebtoonData){
        image.setImageResource(myData.recent_webtton_img)
        episode.text = myData.episode
        title.text = myData.recent_webtoon_title
        author.text = myData.recent_webtoon_autohr
        score.text = myData.recent_webtoon_score
    }
}