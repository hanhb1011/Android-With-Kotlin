package org.androidtown.androidwithkotlin

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

/**
 * Created by hanhb on 2018-02-24.
 */
class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {

    val myFragments: Array<MyFragment> = Array(3, { MyFragment(it) })

    override fun getItem(position: Int): Fragment {
        return myFragments[position]

    }

    override fun getCount(): Int {
        return myFragments.size

    }


}