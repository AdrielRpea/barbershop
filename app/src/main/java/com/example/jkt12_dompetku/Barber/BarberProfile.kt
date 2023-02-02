package com.example.jkt12_dompetku.Barber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jkt12_dompetku.R

class BarberProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_barber_profile)
    }


}