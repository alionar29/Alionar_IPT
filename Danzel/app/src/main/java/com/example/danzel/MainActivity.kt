package com.example.danzel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonClick = findViewById<Button>(R.id.button4)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Tommorow::class.java)
            startActivity(intent)
        }
    }

}

