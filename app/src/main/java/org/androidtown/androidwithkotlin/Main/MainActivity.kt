package org.androidtown.androidwithkotlin.Main

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.androidtown.androidwithkotlin.Feature1.TransitionActivity
import org.androidtown.androidwithkotlin.Feature2.RecyclerViewActivity
import org.androidtown.androidwithkotlin.Feature3.ViewPagerActivity
import org.androidtown.androidwithkotlin.Feature4.CollapsingToolbarActivity
import org.androidtown.androidwithkotlin.Feature5.ServerActivity
import org.androidtown.androidwithkotlin.R

/*

    Main : 각각의 기능에 해당되는 액티비티를 띄워준다.

 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.text = "Kotlin Project Practices"

        firstButton.setOnClickListener {
            startActivity(Intent(this, TransitionActivity::class.java))
        }

        secondButton.setOnClickListener {
            startActivity(Intent(this, RecyclerViewActivity::class.java))
        }

        thirdButton.setOnClickListener {
            startActivity(Intent(this, ViewPagerActivity::class.java))
        }

        fourthButton.setOnClickListener {
            startActivity(Intent(this, CollapsingToolbarActivity::class.java))
        }

        fifthButton.setOnClickListener {
            startActivity(Intent(this, ServerActivity::class.java))
        }

    }
}
