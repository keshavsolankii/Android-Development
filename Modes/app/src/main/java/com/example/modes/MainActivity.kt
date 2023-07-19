package com.example.modes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lbtn = findViewById<Button>(R.id.light)
        val dbtn = findViewById<Button>(R.id.dark)
        val mytheme = findViewById<LinearLayout>(R.id.themeid)

        lbtn.setOnClickListener{
            Toast.makeText(applicationContext, "Light theme", Toast.LENGTH_SHORT).show()
            mytheme.setBackgroundResource(R.color.white)
        }
        dbtn.setOnClickListener{
            Toast.makeText(applicationContext, "Dark theme", Toast.LENGTH_SHORT).show()
            mytheme.setBackgroundResource(R.color.black)
        }
        // Explicit intent
        val btnIntent = findViewById<Button>(R.id.intentbtn)

        btnIntent.setOnClickListener{
            val intent = Intent(applicationContext, MainActivity2 :: class.java)
            startActivity(intent)
        }

        //Implicit intent
        val implicitbtn = findViewById<CardView>(R.id.cardweb)

        implicitbtn.setOnClickListener {
            val myintent = Intent(Intent.ACTION_VIEW)
            myintent.data = Uri.parse("https://www.google.com/")
            startActivity(myintent)
        }
    }
}