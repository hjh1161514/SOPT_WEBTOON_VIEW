package org.techtown.withdesign.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.fragment_challenge.view.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import org.techtown.withdesign.R
import org.techtown.withdesign.adapter.*
import org.techtown.withdesign.data.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        initBanner(view)
        initRecent(view)
        initLikeWebtton(view)
        initRecommendWebtton(view)
        initNewWebtton(view)
        initTodayrankWebtton(view)
        initRomanceWebtton(view)
        initComicWebtton(view)
        initFantasyWebtton(view)
        initThrillerWebtton(view)
        initActionWebtton(view)

        return view
    }

    private fun initBanner(v : View){
        var bannerAdapter = HomeBannerAdapter(v.context)
        bannerAdapter.apply {
            addItem(HomeBannerData(R.drawable.home_banner_img))
            addItem(HomeBannerData(R.drawable.home_banner_img))
            addItem(HomeBannerData(R.drawable.home_banner_img))
        }

        v.home_banner.adapter = bannerAdapter
        v.home_banner.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        v.scroll_view.isFillViewport = true
        //bannerAdapter.notifyDataSetChanged()
    }

    private fun initRecent(v : View){
        var recentAdapter = RecentWebtoonAdapter(v.context)
        recentAdapter.apply {
            addItem(RecentWebtoonData(R.drawable.recent_01,"3화","우리사이느은","이연지","9.9"))
            addItem(RecentWebtoonData(R.drawable.recent_02,"43화","여자친구","청건","9.9"))
            addItem(RecentWebtoonData(R.drawable.recent_03,"11화","아가씨와 우렁총각","제이드","9.9"))
        }

        v.recent_webtoon_view.adapter = recentAdapter
        v.recent_webtoon_view.addItemDecoration(WebtoonItemDecoration(25))
        recentAdapter.notifyDataSetChanged()
    }

    private fun initLikeWebtton(v : View){
        var likeweboonAdapter = WebtoonAdapter(v.context)
        likeweboonAdapter.apply {
            addItem(WebtoonData(R.drawable.like_webtoon01,"685일","새얀","9.9"))
            addItem(WebtoonData(R.drawable.like_webtoon02,"기절소녀 하나미","호이","9.9"))
            addItem(WebtoonData(R.drawable.like_webtoon03,"영원의 주인","별","9.9"))
            addItem(WebtoonData(R.drawable.like_webtoon01,"685일","새얀","9.9"))
            addItem(WebtoonData(R.drawable.like_webtoon02,"기절소녀 하나미","호이","9.9"))
            addItem(WebtoonData(R.drawable.like_webtoon03,"영원의 주인","별","9.9"))
        }

        v.like_webtoon_view.adapter = likeweboonAdapter
        v.like_webtoon_view.addItemDecoration(WebtoonItemDecoration(25))
        likeweboonAdapter.notifyDataSetChanged()
    }

    private fun initRecommendWebtton(v : View) {
        var recommendweboonAdapter = WebtoonAdapter(v.context)
        recommendweboonAdapter.apply {
            addItem(WebtoonData(R.drawable.recommend_webtoon01, "연필의 각도", "홍자", "9.9"))
            addItem(WebtoonData(R.drawable.recommend_webtoon02, "한여름 이겨울", "군반", "9.9"))
            addItem(WebtoonData(R.drawable.recommend_webtoon03, "도리도심", "아지피", "9.9"))
            addItem(WebtoonData(R.drawable.recommend_webtoon01, "연필의 각도", "홍자", "9.9"))
            addItem(WebtoonData(R.drawable.recommend_webtoon02, "한여름 이겨울", "군반", "9.9"))
            addItem(WebtoonData(R.drawable.recommend_webtoon03, "도리도심", "아지피", "9.9"))
        }

        v.recommend_webtoon_view.adapter = recommendweboonAdapter
        v.recommend_webtoon_view.addItemDecoration(WebtoonItemDecoration(25))
        recommendweboonAdapter.notifyDataSetChanged()
    }

    private fun initNewWebtton(v: View){
        var newwebtoonAdapter = NewWebtoonAdapter(v.context)
        newwebtoonAdapter.apply{
            addItem(NewWebtoonData(R.drawable.new_webtoon01))
            addItem(NewWebtoonData(R.drawable.new_webtoon02))
            addItem(NewWebtoonData(R.drawable.new_webtoon03))
            addItem(NewWebtoonData(R.drawable.new_webtoon04))
            addItem(NewWebtoonData(R.drawable.new_webtoon05))

        }

        v.new_webtoon_view.adapter = newwebtoonAdapter
        v.new_webtoon_view.addItemDecoration(WebtoonItemDecoration(25))
        newwebtoonAdapter.notifyDataSetChanged()

    }

    private fun initTodayrankWebtton(v: View){
        var todayrankwebtoonAdapter = TodayrankWebtoonAdapter(v.context)
        todayrankwebtoonAdapter.apply{
            addItem(TodayrankWebtoonData(R.drawable.today_rank01,"1","레바툰","레바"))
            addItem(TodayrankWebtoonData(R.drawable.today_rank02,"2","불멸의 날들","허긴개"))
            addItem(TodayrankWebtoonData(R.drawable.today_rank03,"3","1더하기1은","소루"))
        }

        v.todayrank_webtoon_view.adapter = todayrankwebtoonAdapter
        v.todayrank_webtoon_view.addItemDecoration(WebtoonItemDecoration(25))
        todayrankwebtoonAdapter.notifyDataSetChanged()
    }

    private fun initRomanceWebtton(v : View){
        var romanceweboonAdapter = WebtoonAdapter(v.context)
        romanceweboonAdapter.apply {
            addItem(WebtoonData(R.drawable.romance_webtoon01,"너의 돈이 보여","S리아/민국23","9.9"))
            addItem(WebtoonData(R.drawable.romance_webtoon02,"소비러와 존잘님","도트리","9.9"))
            addItem(WebtoonData(R.drawable.romance_webtoon03,"아람이랑 삽니다","콕","9.9"))
            addItem(WebtoonData(R.drawable.romance_webtoon04,"메리 고 라운드","나솔","9.9"))
        }

        v.romance_webtoon_view.adapter = romanceweboonAdapter
        v.romance_webtoon_view.addItemDecoration(WebtoonItemDecoration(25))
        romanceweboonAdapter.notifyDataSetChanged()
    }

    private fun initComicWebtton(v : View){
        var comicweboonAdapter = WebtoonAdapter(v.context)
        comicweboonAdapter.apply {
            addItem(WebtoonData(R.drawable.comic_webtoon01,"레바툰","레바","9.9"))
            addItem(WebtoonData(R.drawable.comic_webtoon02,"바나나툰","와나나","9.9"))
            addItem(WebtoonData(R.drawable.comic_webtoon03,"도리도심","박바퀴","9.9"))
            addItem(WebtoonData(R.drawable.comic_webtoon04,"내 멋대로 고민상담","김보통","9.9"))
        }

        v.comic_webtoon_view.adapter = comicweboonAdapter
        v.comic_webtoon_view.addItemDecoration(WebtoonItemDecoration(25))
        comicweboonAdapter.notifyDataSetChanged()
    }

    private fun initFantasyWebtton(v : View){
        var fantasyweboonAdapter = WebtoonAdapter(v.context)
        fantasyweboonAdapter.apply {
            addItem(WebtoonData(R.drawable.fantasy_webtoon01,"여보이야기","박상선","9.9"))
            addItem(WebtoonData(R.drawable.fantasy_webtoon02,"신기록","리율","9.9"))
            addItem(WebtoonData(R.drawable.fantasy_webtoon03,"삼작미인가","므앵갱","9.9"))
            addItem(WebtoonData(R.drawable.fantasy_webtoon04,"바람","반메","9.9"))
        }

        v.fantasy_webtoon_view.adapter = fantasyweboonAdapter
        v.fantasy_webtoon_view.addItemDecoration(WebtoonItemDecoration(25))
        fantasyweboonAdapter.notifyDataSetChanged()
    }

    private fun initThrillerWebtton(v : View){
        var thrillerweboonAdapter = WebtoonAdapter(v.context)
        thrillerweboonAdapter.apply {
            addItem(WebtoonData(R.drawable.thriller_webtoon01,"도박사의 유산","이연지","9.9"))
            addItem(WebtoonData(R.drawable.thriller_webtoon02,"보고 싶은 얼굴","진성민","9.9"))
            addItem(WebtoonData(R.drawable.thriller_webtoon03,"그다이","최용성","9.9"))
            addItem(WebtoonData(R.drawable.thriller_webtoon04,"작은 성","마윤","9.9"))
        }

        v.thriller_webtoon_view.adapter = thrillerweboonAdapter
        v.thriller_webtoon_view.addItemDecoration(WebtoonItemDecoration(25))
        thrillerweboonAdapter.notifyDataSetChanged()
    }

    private fun initActionWebtton(v : View){
        var actionweboonAdapter = WebtoonAdapter(v.context)
        actionweboonAdapter.apply {
            addItem(WebtoonData(R.drawable.action_webtoon01,"구원하소서","1230","9.9"))
            addItem(WebtoonData(R.drawable.action_webtoon02,"전설의 읍내최강","배드이리","9.9"))
            addItem(WebtoonData(R.drawable.action_webtoon03,"최강왕따","노도환","9.9"))
            addItem(WebtoonData(R.drawable.action_webtoon04,"죽거나 펀치","노도환","9.9"))
        }

        v.action_webtoon_view.adapter = actionweboonAdapter
        v.action_webtoon_view.addItemDecoration(WebtoonItemDecoration(25))
        actionweboonAdapter.notifyDataSetChanged()
    }

}
