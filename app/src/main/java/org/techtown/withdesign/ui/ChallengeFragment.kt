package org.techtown.withdesign.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.fragment_challenge.*
import org.techtown.withdesign.R
import org.techtown.withdesign.ui.challenge.BasicChallengeFragment
import org.techtown.withdesign.ui.challenge.SuperChallengeFragment
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.fragment_challenge.*
import kotlinx.android.synthetic.main.fragment_challenge.view.*
import org.techtown.withdesign.adapter.ChallengeBannerAdapter
import org.techtown.withdesign.data.ChallengeBannerData

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(challenge_viewPager) {
            adapter = ChallengePageAdapter(childFragmentManager)
            offscreenPageLimit = 2
            addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
                override fun onPageScrollStateChanged(state: Int) {
                }

                override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int
                ) {
                }

                override fun onPageSelected(position: Int) {
                    challenge_nav.menu.getItem(position).isChecked = true
                }

            })
            challenge_nav.setOnNavigationItemReselectedListener {
                when (it.itemId) {
                    R.id.super_challenge -> challenge_viewPager.currentItem = 0
                    R.id.basic_challenge -> challenge_viewPager.currentItem = 1
                }
            }
        }
    }
}

class ChallengePageAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> SuperChallengeFragment()
            else -> BasicChallengeFragment()
        }
    }

    override fun getCount() = 2
}
