package org.androidtown.androidwithkotlin


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_my.view.*


/**
 * A simple [Fragment] subclass.
 */

class MyFragment(val number:Int) : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_my, container, false)

        view.tv_in_fragment.text = number.toString()

        return view
    }

}// Required empty public constructor
