package com.example.android.geekhubhomework

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_toast.setOnClickListener {
            Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show()
        }
        button_count.setOnClickListener {
            val showCountTextView =  findViewById<TextView>(R.id.textView)
            val countString = showCountTextView.text.toString()
            var count: Int = Integer.parseInt(countString)
            count++
            showCountTextView.text = count.toString()
        }
    }
}
