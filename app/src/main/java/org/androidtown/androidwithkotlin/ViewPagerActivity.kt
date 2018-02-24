package org.androidtown.androidwithkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_view_pager.*

class ViewPagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        view_pager.adapter = ViewPagerAdapter(supportFragmentManager)

        btn_vp_1.setOnClickListener {
            view_pager.currentItem = 0
        }

        btn_vp_2.setOnClickListener {
            view_pager.currentItem = 1
        }

        btn_vp_3.setOnClickListener {
            view_pager.currentItem = 2
        }

    }
}
