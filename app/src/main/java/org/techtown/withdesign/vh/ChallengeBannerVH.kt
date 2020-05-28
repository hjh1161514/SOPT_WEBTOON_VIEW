package org.techtown.withdesign.vh

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.challenge_view_item.view.*
import org.techtown.withdesign.R
import org.techtown.withdesign.data.ChallengeBannerData

class ChallengeBannerVH (itemView : View) : RecyclerView.ViewHolder(itemView){
    var title : TextView = itemView.findViewById(R.id.challenge_banner_txt_title)
    var author : TextView = itemView.findViewById(R.id.challenge_txt_banner_author)
    // var imgBanner

    fun onBind(data : ChallengeBannerData){
        title.text = data.title
        author.text = data.author
    }
}