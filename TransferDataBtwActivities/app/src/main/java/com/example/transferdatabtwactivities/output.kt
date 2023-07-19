package com.example.transferdatabtwactivities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.EditText

class output : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)

        val receivename = findViewById<EditText>(R.id.outname)
        val receivequantity = findViewById<EditText>(R.id.outquantity)

        val storename = intent.getStringExtra(MainActivity.NAME_KEY)
        val storeqty = intent.getStringExtra(MainActivity.QUANTITY_KEY)

        val editableText = Editable.Factory.getInstance().newEditable(storename)
        val editableText2 = Editable.Factory.getInstance().newEditable(storeqty)

        receivename.text = editableText
        receivequantity.text = editableText2
    }
}