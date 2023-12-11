package com.app.myethiotelcom.packageactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.app.myethiotelcom.MainActivity
import com.app.myethiotelcom.R


class VoicePackageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.voice_page)
        // voice package type buttons
        val dailyVoicePackageButton = findViewById<Button>(R.id.dailyVoicePackage)
        val weeklyVoicePackageButton = findViewById<Button>(R.id.weeklyVoicePackage)
        val monthlyVoicePackageButton = findViewById<Button>(R.id.monthlyVoicePackage)
        val backFromVoicePackage = findViewById<Button>(R.id.backfromvoicepackage)
        // action listener registration here
        dailyVoicePackageButton.setOnClickListener { startActivity(Intent(this@VoicePackageActivity, MainActivity::class.java)) }




        // back to main
        backFromVoicePackage.setOnClickListener {
            startActivity(Intent(this@VoicePackageActivity, MainActivity::class.java))
        }
    }
    }
