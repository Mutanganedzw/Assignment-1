package com.example.imadassignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Declaring the views
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnCancel = findViewById<Button>(R.id.btnCancel)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 20..35 -> "Kurt Cobain"
                    in 35..40 -> "Chris Kyle"
                    in 40..50 -> "John Lennon"
                    in 50..60 -> "Bob Ross"
                    in 60..78 -> "Paul Richard Alexander"
                    in 78..82 -> "Pele"
                    in 82..90 -> "Maya Angelou"
                    in 90..92 -> "Ellen Holly"
                    in 92..99 -> "Elizabeth Hamilton"
                    else -> "out of rang"
                }
                txtResult.text = "Age: $age\n${
                    when (result) {
                        "Kurt Cobain" -> "Kurt Cobain died at the age of 27."
                        "Chris Kyle" -> "Chris Kyle died at the age of 38."
                        "John Lennon" -> "John Lennon died at the age of 40."
                        "Bob Ross" -> "Bob Ross died at the age of 52"
                        "Paul Richard Alexander" -> "Paul Richard Alexander died at the age of 78."
                        "Pele" -> "Pele died at the age of 82."
                        "Maya Angelou" -> "Maya Angelou died at the age of 86."
                        "Ellen Holly" -> "Ellen Holly died at the age of 92."
                        "Elizabeth Hamilton" -> "Elizabeth Hamilton died at the age of 96."
                        else -> "You age is out of rang."
                    }
                }"
            } else {
                txtResult.text = "Please enter a valid age."
            }
        }

        btnCancel.setOnClickListener {
            ageNumber.text.clear()
            txtResult.text = ""
        }
    }
}