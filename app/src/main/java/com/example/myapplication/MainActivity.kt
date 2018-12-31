package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            if (editText.text.toString() == "") {
                editText.error = "Input some value!!"
            } else {
                val intent = Intent(this, NextActivity::class.java)
                intent.putExtra("INPUT_DATA", editText.text.toString())
                startActivity(intent)
            }
        }
    }
}