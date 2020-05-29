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
import org.techtown.withdesign.ui.ChallengePageAdapter
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
        challenge_list_viewPager.adapter = ChallengeListPageAdapter(childFragmentManager)
        challenge_list_tablayout.setupWithViewPager(challenge_list_viewPager)
    }
}

class ChallengeListPageAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val titleList = arrayListOf("전체", "로맨스", "스릴러", "코믹", "판타지")

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> AllFragment()
            1 -> AllFragment()
            2 -> AllFragment()
            3 -> AllFragment()
            else -> AllFragment()
        }
    }

    override fun getCount() = 5

    override fun getPageTitle(position: Int): CharSequence? {
        return titleList[position]
    }
}