package com.example.jkt12_dompetku.Notif

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jkt12_dompetku.R

class Detail_Notification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_detail_notification)
    }
}