package org.techtown.withdesign.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter


@Suppress("DEPRECATION")
class PageAdapter (fm : FragmentManager) : FragmentStatePagerAdapter(fm){
    private var fragments : ArrayList<Fragment> = ArrayList()

    override fun getItem(position: Int): Fragment = fragments[position]

    override fun getCount(): Int = fragments.size

    fun Fragment.addItems() {
        fragments.add(this)
    }


}