package com.example.skillbox1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button1).setOnClickListener {
            //println("Нажата кнопка 1")
            Log.e("!@#","bottom 1 pressed")
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            //println("Нажата кнопка 2")
            Log.e("!@#","bottom 2 pressed")
        }
        findViewById<Button>(R.id.button3).setOnClickListener {
            //println("Нажата кнопка 3")
            Log.e("!@#","bottom 3 pressed")
        }

    }
}