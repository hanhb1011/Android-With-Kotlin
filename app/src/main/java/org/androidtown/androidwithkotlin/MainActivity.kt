package org.androidtown.androidwithkotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

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

    }
}
