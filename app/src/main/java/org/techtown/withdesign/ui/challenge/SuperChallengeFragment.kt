package org.techtown.withdesign.ui.challenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.fragment_super_challenge.*

import org.techtown.withdesign.R
import org.techtown.withdesign.ui.challenge.challengeList.*

class SuperChallengeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_super_challenge, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(challenge_list_viewPager) {
            adapter = ChallengeListPageAdapter(childFragmentManager)
            offscreenPageLimit = 5
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
                    challenge_nav_list.menu.getItem(position).isChecked = true
                }

            })
            challenge_nav_list.setOnNavigationItemReselectedListener {
                when (it.itemId) {
                    R.id.challenge_all -> challenge_list_viewPager.currentItem = 0
                    R.id.challenge_romance -> challenge_list_viewPager.currentItem = 1
                    R.id.challenge_thriller -> challenge_list_viewPager.currentItem = 2
                    R.id.challenge_comic -> challenge_list_viewPager.currentItem = 3
                    R.id.challenge_fantasy -> challenge_list_viewPager.currentItem = 4
                }
            }
        }
    }
}

class ChallengeListPageAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> AllFragment()
            1 -> RomanceFragment()
            2 -> ThrillerFragment()
            3 -> ComicFragment()
            else -> FantasyFragment()
        }
    }

    override fun getCount() = 5
}