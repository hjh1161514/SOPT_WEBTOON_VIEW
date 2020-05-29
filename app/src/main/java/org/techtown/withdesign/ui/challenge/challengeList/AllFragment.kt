package org.techtown.withdesign.ui.challenge.challengeList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_all.*

import org.techtown.withdesign.R
import org.techtown.withdesign.ui.challenge.challengeRecycler.ChallengeAdapter
import org.techtown.withdesign.ui.challenge.challengeRecycler.ChallengeData

class AllFragment : Fragment() {
    lateinit var challengeAdapter: ChallengeAdapter
    val datas = mutableListOf<ChallengeData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_all, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        challengeAdapter = ChallengeAdapter(view.context)
        rv_challenge_list.run {
            adapter = challengeAdapter
            layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)
        }
        datas.apply {
            clear()
            add(
                ChallengeData(
                    title = "안녕, 폐급요정",
                    author = "금요정",
                    date = "2020.5.19",
                    rate = "9.68",
                    image = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.lezhin.com%2Fko%2Fchallenge%2Fcomics%2F1268&psig=AOvVaw2F5vEYmPI3067b9Z8Vs3La&ust=1590649219834000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJiDraC80-kCFQAAAAAdAAAAABAD"
                )
            )
            add(
                ChallengeData(
                    title = "설이와 나",
                    author = "우기",
                    date = "2020.5.19",
                    rate = "8.5",
                    image = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.lezhin.com%2Fko%2Fchallenge%2Fcomics%2F1268&psig=AOvVaw2F5vEYmPI3067b9Z8Vs3La&ust=1590649219834000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJiDraC80-kCFQAAAAAdAAAAABAD"
                )
            )
            add(
                ChallengeData(
                    title = "설이와 나",
                    author = "우기",
                    date = "2020.5.19",
                    rate = "8.5",
                    image = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.lezhin.com%2Fko%2Fchallenge%2Fcomics%2F1268&psig=AOvVaw2F5vEYmPI3067b9Z8Vs3La&ust=1590649219834000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJiDraC80-kCFQAAAAAdAAAAABAD"
                )
            )
            add(
                ChallengeData(
                    title = "설이와 나",
                    author = "우기",
                    date = "2020.5.19",
                    rate = "8.5",
                    image = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.lezhin.com%2Fko%2Fchallenge%2Fcomics%2F1268&psig=AOvVaw2F5vEYmPI3067b9Z8Vs3La&ust=1590649219834000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJiDraC80-kCFQAAAAAdAAAAABAD"
                )
            )
        }
        challengeAdapter.datas = datas
        challengeAdapter.notifyDataSetChanged()
    }
}
