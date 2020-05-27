package org.techtown.withdesign.ui.challenge.challengeRecycler

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.techtown.withdesign.R

class ChallengeAdapter (private val context: Context): RecyclerView.Adapter<ChallengeViewHolder>(){

    var datas = mutableListOf<ChallengeData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChallengeViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_challenge,parent,false)
        return ChallengeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: ChallengeViewHolder, position: Int) {
        holder.bind(datas[position])
    }
}