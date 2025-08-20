package com.example.view_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val yearOne : Button = findViewById<Button>(R.id.btnYer1)
        yearOne.setOnClickListener{
            startActivity(Intent(this, Page1::class.java))
        }
        val yearTwo : Button = findViewById<Button>(R.id.btnYer2)
        yearTwo.setOnClickListener{
            startActivity(Intent(this, Page2::class.java))
        }
        val yearThree : Button = findViewById<Button>(R.id.btnYer3)
        yearThree.setOnClickListener{
            startActivity(Intent(this, Page3::class.java))
        }
    }

}