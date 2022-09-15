package com.stop_watch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startbtn = findViewById<Button>(R.id.startbtn)
        val pausebtn = findViewById<Button>(R.id.pausebtn)
        val resetbtn = findViewById<Button>(R.id.resetbtn)

        startbtn.setOnClickListener {

        }


        pausebtn.setOnClickListener {

        }


        resetbtn.setOnClickListener {

        }


    }
}