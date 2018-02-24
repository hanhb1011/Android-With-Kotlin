package org.androidtown.androidwithkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val list :List<Item> = List(100,{Item(it.toString())})

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = MyAdapter(this, list)

    }
}
