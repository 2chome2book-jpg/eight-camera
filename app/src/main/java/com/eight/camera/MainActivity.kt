package com.eight.camera

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.photoButton).setOnClickListener {
            Toast.makeText(this, "eight camera active", Toast.LENGTH_SHORT).show()
        }
    }
}
