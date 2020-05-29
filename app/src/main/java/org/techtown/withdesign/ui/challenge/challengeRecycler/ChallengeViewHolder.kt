package org.techtown.withdesign.ui.challenge.challengeRecycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.techtown.withdesign.R

class ChallengeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val challenge_title = itemView.findViewById<TextView>(R.id.challenge_title)
    val challenge_image = itemView.findViewById<ImageView>(R.id.challenge_image)
    val challenge_author = itemView.findViewById<TextView>(R.id.challenge_author)
    val challenge_date = itemView.findViewById<TextView>(R.id.challenge_date)
    val challenge_rate = itemView.findViewById<TextView>(R.id.challenge_rate)

    fun bind(challengeData: ChallengeData) {
        challenge_title.text = challengeData.title
        challenge_author.text = challengeData.author
        challenge_date.text = challengeData.date
        challenge_rate.text = challengeData.rate
        Glide.with(itemView).load(challengeData.image).into(challenge_image)
    }
}