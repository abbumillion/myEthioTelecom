package com.app.myethiotelcom.packageactivity

import android.os.Bundle
import android.widget.Button
import com.app.myethiotelcom.R

class PackageTypeActivity : PackageActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.package_type)
        val forYouButton = findViewById<Button>(R.id.forYou)
        val giftButton = findViewById<Button>(R.id.gift)
        // action listener registration here

        forYouButton.setOnClickListener { packageType() }
        giftButton.setOnClickListener {
//            startActivity()
        }
    }
}