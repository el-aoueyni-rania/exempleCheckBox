package com.example.exempleimg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var txt : TextView
    lateinit var ch1 : CheckBox
    lateinit var ch2 : CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt = findViewById(R.id.txt)
        ch1 = findViewById(R.id.ch1)
        ch2 = findViewById(R.id.ch2)

        ch1.setOnClickListener {
            if (ch1.isChecked){
                txt.setText("Yes I have")
                ch2.isChecked = false
            }
        }

        ch2.setOnClickListener {
            if (ch2.isChecked){
                txt.setText("No I haven't")
                ch1.isChecked = false
            }
        }


    }
}