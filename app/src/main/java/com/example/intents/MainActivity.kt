package com.example.intents

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Initialize views
        val goto = findViewById<Button>(R.id.button_go)
        val pass = findViewById<TextView>(R.id.passwd)

        // Set click listener for the button
        goto.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val passExpo = pass.text.toString()
            intent.putExtra("passwordName", passExpo)
            startActivity(intent)
            finish()
        }
    }
}
