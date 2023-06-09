package com.example.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnStart:Button
    lateinit var btnStop:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart = findViewById(R.id.btnStart)
        btnStop = findViewById(R.id.btnStop)
        btnStart.setOnClickListener {
            startService(Intent(this,MyService::class.java))

        }

        btnStop.setOnClickListener {
            stopService(Intent(this,MyService::class.java))
        }
    }
}