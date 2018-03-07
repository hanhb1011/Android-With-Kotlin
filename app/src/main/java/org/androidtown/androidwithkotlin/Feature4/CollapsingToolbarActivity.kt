package org.androidtown.androidwithkotlin.Feature4

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_collapsing_toolbar.*
import org.androidtown.androidwithkotlin.R

/*

    Feature 4
    CollapsingToolbarLayout

    CoordinatorLayout
        AppbarLayout
            CollapsingToolbarLayout
                Toolbar
        NestedScrollView

    의 계층 구조를 준수해야 한다.
    또한 각각의 뷰의 속성을 적절하게 지정해야 동작 (NoActionBar 등)

 */


class CollapsingToolbarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collapsing_toolbar)


        setSupportActionBar(toolbar)
        collapsing_toolbar_layout.title = "TITLE"

        //TODO 리스너 추가




    }
}
