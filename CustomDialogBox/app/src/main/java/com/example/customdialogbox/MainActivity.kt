package com.example.customdialogbox

import android.annotation.SuppressLint
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var dialog : Dialog
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialog = Dialog(this)
        dialog.setContentView(R.layout.customized_layout)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.dialog_box))

        var feedback = dialog.findViewById<Button>(R.id.feedbackbtn)
        var nice = dialog.findViewById<Button>(R.id.nicebtn)

        var clickbtn = findViewById<Button>(R.id.button)

        clickbtn.setOnClickListener {
            dialog.show()
        }
        feedback.setOnClickListener {
            Toast.makeText(this, "Thanks for giving feedback", Toast.LENGTH_SHORT).show()
        }
        nice.setOnClickListener {
            dialog.dismiss()
        }
    }
}