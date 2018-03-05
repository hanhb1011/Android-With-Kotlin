package org.androidtown.androidwithkotlin.Feature1

import android.os.Bundle
import android.support.constraint.ConstraintSet
import android.support.v7.app.AppCompatActivity
import android.transition.TransitionManager
import kotlinx.android.synthetic.main.activity_first.*
import org.androidtown.androidwithkotlin.R

/*
    Feature 1
    ConstraintSet으로 Transition을 구현
    3가지 단계로 구성 (배경 -> subdetail -> detail)
    1. Constraint에 세 가지 단계에 해당되는 레이아웃을 clone
    2. 클릭 리스너에서 Transition 수행
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
