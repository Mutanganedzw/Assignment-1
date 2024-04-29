package com.example.project2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    private var petHealth = 100
    private var petHunger = 50
    private var petCleanliness = 50

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Set the buttons and text views
        val btnFeed = findViewById<Button>(R.id.btn_feed)
        val btnClean = findViewById<Button>(R.id.btn_clean)
        val btnPlay = findViewById<Button>(R.id.btn_play)
        val txtHunger = findViewById<EditText>(R.id.txt_Hunger)
        val txtHappy = findViewById<EditText>(R.id.txt_Health)
        val txtClean = findViewById<EditText>(R.id.txt_Cleanliness)
        val petImage = findViewById<ImageView>(R.id.pet_image)

        // Set the initial text values
        txtHunger.setText(petHunger.toString())
        txtHappy.setText(petHealth.toString())
        txtClean.setText(petCleanliness.toString())

        // Handle button Clicks
        btnFeed.setOnClickListener {
            petHunger += 10
            petHealth += 10
            petCleanliness += 5
            txtHunger.setText(petHunger.toString())
            animateImageChange(petImage, R.drawable.img_3)
        }

        btnClean.setOnClickListener {
            petCleanliness += 10
            petHealth += 10

            txtClean.setText(petCleanliness.toString())
            animateImageChange(petImage, R.drawable.img_2)
        }

        btnPlay.setOnClickListener {
            petHealth += 10
            petHunger += 5
            petCleanliness -= 5
            txtHappy.setText(petHealth.toString())
            animateImageChange(petImage, R.drawable.img_1)
        }
    }

    private fun animateImageChange(imageView: ImageView, newImageResource: Int) {
        //val animation = AlphaAnimation(0.0f, 1.0f)
       // animation.duration = 500
       // animation.fillAfter = true
        //imageView.startAnimation(animation)
        imageView.setImageResource(newImageResource)
    }
}