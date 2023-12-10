package com.app.myethiotelcom.model

import com.app.myethiotelcom.helpers.PackageType

data class Package(val id: Int, val name: String, val type: PackageType, val commandText: String) {
    private fun buy() {
        // buying
    }

    private fun save() {
        // saving to local storage
    }

    private fun log() {
        // log package transactions
    }

}
