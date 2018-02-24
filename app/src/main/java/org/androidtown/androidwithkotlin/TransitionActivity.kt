package org.androidtown.androidwithkotlin

import android.os.Bundle
import android.support.constraint.ConstraintSet
import android.support.v7.app.AppCompatActivity
import android.transition.TransitionManager
import kotlinx.android.synthetic.main.activity_first.*

/*
    TransitionActivity
    ConstraintSet으로 Transition

 */


class TransitionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        supportActionBar?.title = "Transition by ConstraintSet"

        val constraintSets = listOf(ConstraintSet(), ConstraintSet(), ConstraintSet())
        constraintSets[0].clone(firstLayout)
        constraintSets[1].clone(this, R.layout.activity_first_2)
        constraintSets[2].clone(this, R.layout.activity_first_3)
        var state = 0

        firstLayout.setOnClickListener {

            TransitionManager.beginDelayedTransition(firstLayout)
            state=(state+1)%constraintSets.size
            constraintSets[state].applyTo(firstLayout)

        }


    }




}
