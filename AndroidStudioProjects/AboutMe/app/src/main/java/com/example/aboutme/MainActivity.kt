package com.example.aboutme


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AboutMeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aboutButton: Button = findViewById(R.id.aboutButton)
        val aboutText: TextView = findViewById(R.id.aboutText)

        aboutButton.setOnClickListener {
            // Toggle the visibility of the description
            if (aboutText.visibility == View.GONE) {
                aboutText.visibility = View.VISIBLE
            } else {
                aboutText.visibility = View.GONE
            }
        }
    }
}
