package org.techtown.withdesign.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.fragment_challenge.*
import kotlinx.android.synthetic.main.fragment_challenge.view.*
import org.techtown.withdesign.R
import org.techtown.withdesign.adapter.ChallengeBannerAdapter
import org.techtown.withdesign.data.ChallengeBannerData

/**
 * A simple [Fragment] subclass.
 */
class ChallengeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_challenge, container, false)

        initBanner(view)

        return view
    }

    private fun initBanner(v : View){
       var bannerAdapter = ChallengeBannerAdapter(v.context)
        bannerAdapter.apply {
            addItem(ChallengeBannerData("Red Zone","mynameis392"))
            addItem(ChallengeBannerData("Blue Zone", "yournameis392"))
            addItem(ChallengeBannerData("Green Zone", "ournameis392"))
        }

        v.challenge_banner.adapter = bannerAdapter
        v.challenge_banner.orientation = ViewPager2.ORIENTATION_HORIZONTAL
//        bannerAdapter.notifyDataSetChanged()
    }

}
