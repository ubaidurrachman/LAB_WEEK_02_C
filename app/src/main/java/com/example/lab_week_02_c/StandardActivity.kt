package com.example.lab_week_02_c

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class StandardActivity : AppCompatActivity() {

    companion object {
        private const val DEBUG = "DEBUG"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standard)

        Log.d(DEBUG, "onCreate")

        // Klik tombol untuk membuka activity Standard lagi
        findViewById<Button>(R.id.button_standard).setOnClickListener {
            startActivity(Intent(this, StandardActivity::class.java))
        }
    }

    // Perbaikan: Intent tidak boleh nullable
    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        Log.d(DEBUG, "onNewIntent")
    }
}
