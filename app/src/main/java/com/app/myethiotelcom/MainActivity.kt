package com.app.myethiotelcom

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.app.myethiotelcom.R.id
import com.app.myethiotelcom.R.layout
import com.app.myethiotelcom.packageactivity.DataPackageActivity
import com.app.myethiotelcom.packageactivity.SMSPackageActivity
import com.app.myethiotelcom.packageactivity.VoicePackageActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.first_page)
        // action listener registration here
        findViewById<Button>(id.voiceButton).setOnClickListener {
            startActivity(Intent(this@MainActivity, VoicePackageActivity::class.java))
        }
        findViewById<Button>(id.dataButton).setOnClickListener {
            startActivity(Intent(this@MainActivity, DataPackageActivity::class.java))
        }
        findViewById<Button>(id.smsButton).setOnClickListener {
            startActivity(Intent(this@MainActivity, SMSPackageActivity::class.java))
        }
    }

}
