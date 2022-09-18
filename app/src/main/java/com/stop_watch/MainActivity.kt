package com.stop_watch

import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.TransitionDrawable
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val constraintLayout :ConstraintLayout= findViewById<ConstraintLayout>(R.id.mainLayout)
        constraintLayout.setBackgroundResource(R.drawable.transition)
        var transition  = constraintLayout.background as TransitionDrawable
        transition.startTransition(500)

        val startbtn = findViewById<Button>(R.id.startbtn)
        val pausebtn = findViewById<Button>(R.id.pausebtn)
        val resetbtn = findViewById<Button>(R.id.resetbtn)
        val stopWatch = findViewById<Chronometer>(R.id.stopWatch)
        var stopAt:Long=0

        startbtn.setOnClickListener {
            //transition.reverseTransition(500)
            constraintLayout.setBackgroundResource(R.drawable.gradient_list)
            var animation = constraintLayout.background as AnimationDrawable
            animation.setEnterFadeDuration(2500)
            animation.setExitFadeDuration(2500)
            animation.start()



            stopWatch.base= SystemClock.elapsedRealtime()-stopAt
            stopWatch.start()
        }


        pausebtn.setOnClickListener {
            constraintLayout.setBackgroundResource(R.drawable.gradient_list)
            var animation = constraintLayout.background as AnimationDrawable
            animation.stop()



            stopAt=SystemClock.elapsedRealtime()-stopWatch.base
            stopWatch.stop()
        }

        resetbtn.setOnClickListener {
            constraintLayout.setBackgroundResource(R.drawable.transition)
            var transition  = constraintLayout.background as TransitionDrawable
            transition.reverseTransition(500)
          //  animationDrawable.stop()
            stopWatch.base=SystemClock.elapsedRealtime()
            stopWatch.stop()
            stopAt=0
        }


    }
}
