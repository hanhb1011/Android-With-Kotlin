package org.androidtown.androidwithkotlin.Feature3

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

/**
 * Created by hanhb on 2018-02-24.
 */
class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {

    private val myFragments: Array<MyFragment> = Array(3, {
        val fragment = MyFragment()
        fragment.number = it
        return@Array fragment
    })

    override fun getItem(position: Int): Fragment {
        return myFragments[position]

    }

    override fun getCount(): Int {
        return myFragments.size

    }


}