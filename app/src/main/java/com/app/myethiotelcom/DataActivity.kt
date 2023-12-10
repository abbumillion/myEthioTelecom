package com.app.myethiotelcom

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity

class DataPackageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.data_page)
        val buyVoicePackageButton = findViewById<Button>(R.id.buydatapackage)
        val backFromVoicePackage = findViewById<Button>(R.id.backfromdatapackage)

        // action listener registration here
        buyVoicePackageButton.setOnClickListener { v -> buyVoicePackage() }
        backFromVoicePackage.setOnClickListener { v -> backToMainPage() }
    }
    // action listener implementation here
    private fun backToMainPage() {
        val intent = Intent(this@DataPackageActivity, MainActivity::class.java)
        startActivity(intent)    }

    private fun buyVoicePackage() {
        val builder = AlertDialog.Builder(this)
        //set title for alert dialog
        builder.setTitle(R.string.data_dialog_title)
        //set message for alert dialog
        builder.setMessage(R.string.data_dialog_text)
        builder.setIcon(android.R.drawable.ic_dialog_alert)

        //performing positive action
        builder.setPositiveButton("Yes"){dialogInterface, which ->
            Toast.makeText(applicationContext,"clicked yes", Toast.LENGTH_LONG).show()
        }
        //performing cancel action
        builder.setNeutralButton("Cancel"){dialogInterface , which ->
            Toast.makeText(applicationContext,"clicked cancel\n operation cancel", Toast.LENGTH_LONG).show()
        }
        //performing negative action
        builder.setNegativeButton("No"){dialogInterface, which ->
            Toast.makeText(applicationContext,"clicked No", Toast.LENGTH_LONG).show()
        }
        // Create the AlertDialog
        val alertDialog: AlertDialog = builder.create()
        // Set other dialog properties
        alertDialog.setCancelable(false)
        alertDialog.show()     }
}