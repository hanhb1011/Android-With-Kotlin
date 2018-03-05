package org.androidtown.androidwithkotlin.Feature4

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_collapsing_toolbar.*
import org.androidtown.androidwithkotlin.R

/*

    Feature 4
    CollapsingToolbarLayout

 */


class CollapsingToolbarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collapsing_toolbar)


        setSupportActionBar(toolbar)
        collapsing_toolbar_layout.title = "TITLE"

        

    }
}
