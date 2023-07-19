package com.example.checkalertbox

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.checkalertbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.alert1.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are you sure?")
            builder1.setMessage("Delete this file!")
            builder1.setIcon(R.drawable.baseline_delete_forever_24)
            builder1.setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder1.setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder1.show()
            binding.alert2.setOnClickListener {
                val builder2 = AlertDialog.Builder(this)
                val options = arrayOf("Mercedes", "BMW", "Ford", "Land Rover")
                builder2.setTitle("Choose your favourite brand")
                builder2.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "you chose ${options[i]}", Toast.LENGTH_SHORT).show()
                })
                builder2.setPositiveButton("Accept", DialogInterface.OnClickListener { dialogInterface, i ->

                })
                builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                    finish()
                })
                builder2.show()
            }
            binding.alert3.setOnClickListener {
                val builder3 = AlertDialog.Builder(this)
                val options = arrayOf("H2", "ZX10r", "R1", "S1000")
                builder3.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
                    Toast.makeText(this, "You clicked on ${options[i]}", Toast.LENGTH_SHORT).show()
                })
                builder3.setPositiveButton("Done", DialogInterface.OnClickListener { dialogInterface, i ->  })
                builder3.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->  })
                builder3.show()
            }
        }
    }
}