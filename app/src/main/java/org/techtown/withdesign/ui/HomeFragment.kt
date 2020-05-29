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
import org.techtown.withdesign.adapter.HomeBannerAdapter
import org.techtown.withdesign.adapter.RecentWebtoonAdapter
import org.techtown.withdesign.adapter.WebtoonAdapter
import org.techtown.withdesign.data.HomeBannerData
import org.techtown.withdesign.data.RecentWebtoonData
import org.techtown.withdesign.data.WebtoonData

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

}
