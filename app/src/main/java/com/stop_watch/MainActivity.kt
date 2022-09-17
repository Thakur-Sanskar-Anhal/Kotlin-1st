package com.stop_watch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startbtn = findViewById<Button>(R.id.startbtn)
        val pausebtn = findViewById<Button>(R.id.pausebtn)
        val resetbtn = findViewById<Button>(R.id.resetbtn)
        val stopWatch = findViewById<Chronometer>(R.id.stopWatch)
        var stopAt:Long=0

        startbtn.setOnClickListener {
            stopWatch.base= SystemClock.elapsedRealtime()-stopAt
            stopWatch.start()
        }


        pausebtn.setOnClickListener {
            stopAt=SystemClock.elapsedRealtime()-stopWatch.base
            stopWatch.stop()
        }

        resetbtn.setOnClickListener {
            stopWatch.base=SystemClock.elapsedRealtime()
            stopWatch.stop()
            stopAt=0
        }


    }
}