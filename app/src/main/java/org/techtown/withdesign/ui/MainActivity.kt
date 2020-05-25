package org.techtown.withdesign.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_tab_button.view.*
import org.techtown.withdesign.R
import org.techtown.withdesign.adapter.PageAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViewPager()
        initTabLayout()


    }

    private fun initViewPager(){
        val viewPagerAdapter = PageAdapter(supportFragmentManager)
        viewPagerAdapter.apply {
            HomeFragment().addItems()
            SeriesFragment().addItems()
            FreeFragment().addItems()
            ChallengeFragment().addItems()
            MyPageFragment().addItems()
        }

        main_viewpager.adapter = viewPagerAdapter
        main_tablayout.setupWithViewPager(main_viewpager)
    }

    private fun initTabLayout(){
        for (i in 0..4){
            main_tablayout.getTabAt(i)?.customView = initCustomView(i)
        }
    }

    @SuppressLint("InflateParams")
    private fun initCustomView(position : Int) : View {
        val tabView = LayoutInflater.from(this).inflate(R.layout.custom_tab_button, null)

        when(position){
            0 -> tabView.tab_ic.setImageResource(R.drawable.icon_home)
            1 -> tabView.tab_ic.setImageResource(R.drawable.icon_series)
            2 -> tabView.tab_ic.setImageResource(R.drawable.icon_free)
            3 -> tabView.tab_ic.setImageResource(R.drawable.icon_challenge)
            4 -> tabView.tab_ic.setImageResource(R.drawable.icon_mypage)
        }
        return tabView
    }
}
