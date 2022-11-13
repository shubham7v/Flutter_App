package com.shubham.flutter_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter = 0
        var myButton  = findViewById(R.id.button) as Button
        var myText = findViewById(R.id.textView) as TextView
        myButton.setOnClickListener {
            counter++
            myText.text = counter.toString()
        }
        var myButton2 = findViewById(R.id.button2) as Button
        myButton2.setOnClickListener {
            if(counter>0) {
                counter--;
                myText.text = counter.toString()
            }
        }

    }
}