package com.example.transferdatabtwactivities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    companion object{
       const val NAME_KEY = "com.example.transferdatabtwactivities.MainActivity.NAME_KEY"
       const val QUANTITY_KEY = "com.example.transferdatabtwactivities.MainActivity.QUANTITY_KEY"
    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submit = findViewById<Button>(R.id.btn)
        val name = findViewById<EditText>(R.id.nameinput)
        val quantity = findViewById<EditText>(R.id.quantity)

        submit.setOnClickListener {
            val msg = name.text.toString()
            val qty = quantity.text.toString()
            val intent = Intent(this, output :: class.java)
            intent.putExtra(NAME_KEY, msg)
            intent.putExtra(QUANTITY_KEY, qty)
            startActivity(intent)
        }
    }
}