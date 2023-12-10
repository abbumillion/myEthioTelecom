package com.app.myethiotelcom.packageactivity

import android.content.Intent
import androidx.activity.ComponentActivity
import com.app.myethiotelcom.helpers.PackageType
import com.app.myethiotelcom.model.Package

abstract class PackageActivity : ComponentActivity() {
    // global package object that
    // is processed within a single
    // use case or functionality

    protected var currentPackage = Package(1, "d", PackageType.FOR_GIFT, "")

    // ask package type
    fun packageType() {
        // choosing package types
        startActivity(Intent(this, PackageTypeActivity::class.java))
    }
}