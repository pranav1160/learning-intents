package com.example.intents

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        // Initialize views
        val importedText = findViewById<TextView>(R.id.textView2)
        val backBtn = findViewById<ImageButton>(R.id.backbtn)

        // Retrieve data from intent
        val received = intent.getStringExtra("passwordName")
        importedText.text = received

        // Set click listener for the back button
        backBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
