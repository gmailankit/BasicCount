package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

public class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

              // get reference to button
        val btn_click_me = findViewById(R.id.button2) as Button
        val myTextView= findViewById(R.id.textView) as TextView
        var timesClicked=0
             // set on-click listener
        btn_click_me.setOnClickListener {
            timesClicked += 1
            myTextView.text=timesClicked.toString()
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }
    }
}