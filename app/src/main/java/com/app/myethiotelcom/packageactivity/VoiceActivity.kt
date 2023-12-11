package com.app.myethiotelcom.packageactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.app.myethiotelcom.MainActivity
import com.app.myethiotelcom.R


class VoicePackageActivity : PackageActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.voice_page)
        val buyVoicePackageButton = findViewById<Button>(R.id.dailyVoicePackage)
        val backFromVoicePackage = findViewById<Button>(R.id.backfromvoicepackage)
        // action listener registration here
        buyVoicePackageButton.setOnClickListener { packageType() }
        backFromVoicePackage.setOnClickListener {
            startActivity(Intent(this@VoicePackageActivity, MainActivity::class.java))
        }
    }
    }
