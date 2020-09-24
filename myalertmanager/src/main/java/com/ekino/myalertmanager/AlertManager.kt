package com.ekino.myalertmanager

import android.content.Context
import android.content.DialogInterface.BUTTON_POSITIVE
import androidx.appcompat.app.AlertDialog

object AlertManager {

    private lateinit var alert: AlertDialog
    private lateinit var context: Context

    fun initAlert(context: Context) {
        this.context = context
        alert = AlertDialog.Builder(context).create()
        alert.setCancelable(false)
        alert.setButton(BUTTON_POSITIVE, "OK") { _, _ -> }
    }

    fun showAlert(message: String) {
        alert.setTitle(message)
        alert.show()
    }

    val isAlertShowing: Boolean
        get() = alert.isShowing

}