package com.kotlin.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myText = findViewById<TextView>(R.id.textview)


        val myButton = findViewById<Button>(R.id.button)
        myButton.setOnClickListener { myText.text = "Shahin" }
    }
}
