package com.app.myethiotelcom

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.app.myethiotelcom.R.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.first_page)


        val voiceButton = findViewById<Button>(id.voiceButton)
        val dataButton = findViewById<Button>(id.dataButton)
        val smsButton = findViewById<Button>(id.smsButton)


        voiceButton.setOnClickListener { v -> button1Action() }
        dataButton.setOnClickListener { v -> button2Action() }
        smsButton.setOnClickListener { v -> button3Action() }
    }

    fun button1Action() {
        val intent = Intent(this@MainActivity, VoiceActivity::class.java)
        startActivity(intent)
    }
    fun button2Action() {
        val intent = Intent(this@MainActivity, DataActivity::class.java)
        startActivity(intent)
    }
    fun button3Action() {
        val intent = Intent(this@MainActivity, SMSActivity::class.java)
        startActivity(intent)
    }

}
