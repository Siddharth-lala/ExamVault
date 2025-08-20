package com.example.view_1

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)

        val moduleOne = findViewById<Button>(R.id.btnMod1)  // Button 1 click event
        moduleOne.setOnClickListener{
            startActivity(Intent(this, Module1_3::class.java))        // Intent(1st argument = text of the existing activity;    2nd argument = class of the Module1 activity)
        }

        val moduleTwo = findViewById<Button>(R.id.btnMod2)  // Button 2 click event
        moduleTwo.setOnClickListener{
            startActivity(Intent(this, Module2_3::class.java))
        }

        val moduleThree = findViewById<Button>(R.id.btnMod3)  // Button 3 click event
        moduleThree.setOnClickListener{
            startActivity(Intent(this, Module3_3::class.java))
        }

        val moduleFour = findViewById<Button>(R.id.btnMod4)  // Button 4 click event
        moduleFour.setOnClickListener{
            startActivity(Intent(this, Module4_3::class.java))
        }

        val moduleFive = findViewById<Button>(R.id.btnMod5)  // Button 5 click event
        moduleFive.setOnClickListener{
            startActivity(Intent(this, Module5_3::class.java))
        }

        val moduleSix = findViewById<Button>(R.id.btnMod6)  // Button 6 click event
        moduleSix.setOnClickListener{
            startActivity(Intent(this, Module6_3::class.java))
        }

    }
}