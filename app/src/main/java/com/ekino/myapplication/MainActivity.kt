package com.ekino.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.ekino.utilities.AlertManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AlertManager.initAlert(this)
    }

    override fun onResume() {
        super.onResume()
        Handler(Looper.getMainLooper()).postDelayed({
            AlertManager.showAlert("Hello")
        }, 3000)
    }
}