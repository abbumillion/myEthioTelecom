package com.app.myethiotelcom

import android.app.AlertDialog
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.core.app.ActivityCompat


class VoicePackageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.voice_page)
        val buyVoicePackageButton = findViewById<Button>(R.id.buyvoicepackage)
        val backFromVoicePackage = findViewById<Button>(R.id.backfromvoicepackage)

        // action listener registration here
        buyVoicePackageButton.setOnClickListener { v -> buyVoicePackage() }
        backFromVoicePackage.setOnClickListener { v -> backToMainPage() }
    }
    // action listener implementation here
    private fun backToMainPage() {
        val intent = Intent(this@VoicePackageActivity, MainActivity::class.java)
        startActivity(intent)    }

    private fun buyVoicePackage() {
        val builder = AlertDialog.Builder(this)
        //set title for alert dialog
        builder.setTitle(R.string.voice_dialog_title)
        //set message for alert dialog
        builder.setMessage(R.string.voice_dialog_text)
        builder.setIcon(android.R.drawable.ic_dialog_alert)

        //performing positive action
        builder.setPositiveButton("Yes"){dialogInterface, which ->
            Toast.makeText(applicationContext,"clicked yes",Toast.LENGTH_LONG).show()
        }
        //performing cancel action
        builder.setNeutralButton("Cancel"){dialogInterface , which ->
            Toast.makeText(applicationContext,"clicked cancel\n operation cancel",Toast.LENGTH_LONG).show()
        }
        //performing negative action
        builder.setNegativeButton("No"){dialogInterface, which ->
            Toast.makeText(applicationContext,"clicked No",Toast.LENGTH_LONG).show()
        }
        // Create the AlertDialog
        val alertDialog: AlertDialog = builder.create()
        // Set other dialog properties
        alertDialog.setCancelable(false)
        alertDialog.show()     }

    fun callPhoneNumber() {
        try {
            if (Build.VERSION.SDK_INT > 22) {
                if (ActivityCompat.checkSelfPermission(
                        this,
                        TELEPHONY_SERVICE
                    ) != PackageManager.PERMISSION_GRANTED
                ) {
                    ActivityCompat.requestPermissions(
                        this@VoicePackageActivity,
                        arrayOf(TELEPHONY_SERVICE),
                        101
                    )
                    return
                }
                val callIntent = Intent(Intent.ACTION_CALL)
               // callIntent.setData(Uri.parse("tel:" + txtPhone.getText().toString()))
                startActivity(callIntent)
            } else {
                val callIntent = Intent(Intent.ACTION_CALL)
              //  callIntent.setData(Uri.parse("tel:" + txtPhone.getText().toString()))
                startActivity(callIntent)
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

}