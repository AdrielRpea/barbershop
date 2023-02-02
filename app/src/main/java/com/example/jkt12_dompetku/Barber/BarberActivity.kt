package com.example.jkt12_dompetku.Barber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jkt12_dompetku.R
import kotlinx.android.synthetic.main.activity_barber.*

class BarberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_barber)

        BR1BtnProfile.setOnClickListener {
            val gotoProfile = Intent(this, BarberProfile::class.java)
            startActivity(gotoProfile)
        }
    }
}