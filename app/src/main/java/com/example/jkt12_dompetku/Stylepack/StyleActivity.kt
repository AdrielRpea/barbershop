package com.example.jkt12_dompetku.Stylepack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jkt12_dompetku.Barber.BarberActivity
import com.example.jkt12_dompetku.Barber.BarberProfile
import com.example.jkt12_dompetku.R
import kotlinx.android.synthetic.main.activity_barber.*
import kotlinx.android.synthetic.main.activity_form_booking.*
import kotlinx.android.synthetic.main.activity_style.*
import kotlinx.android.synthetic.main.item_style.*

class StyleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_style)

        ST1Gambar.setOnClickListener {
            val gotoProfile = Intent(this, BarberActivity::class.java)
            startActivity(gotoProfile)
        }
        val styleList = listOf<Style>(
            Style(
                R.drawable.style1,
                "Nama Style 1",
                "Rp. 150.000",
                "  60 Min"
            ),
            Style(
                R.drawable.style1,
                "Nama Style 2",
                "Rp. 160.000",
                "  50 Min"
            ),
            Style(
                R.drawable.style1,
                "Nama Style 3",
                "Rp. 170.000",
                "  40 Min"
            ),
            Style(
                R.drawable.style1,
                "Nama Style 4",
                "Rp. 180.000",
                "  30 Min"
            ),
            Style(
                R.drawable.style1,
                "Nama Style 1",
                "Rp. 150.000",
                "  60 Min"
            ),
            Style(
                R.drawable.style1,
                "Nama Style 2",
                "Rp. 160.000",
                "  50 Min"
            ),
            Style(
                R.drawable.style1,
                "Nama Style 3",
                "Rp. 170.000",
                "  40 Min"
            ),
            Style(
                R.drawable.style1,
                "Nama Style 4",
                "Rp. 180.000",
                "  30 Min"
            ),
            Style(
                R.drawable.style1,
                "Nama Style 1",
                "Rp. 150.000",
                "  60 Min"
            ),
            Style(
                R.drawable.style1,
                "Nama Style 2",
                "Rp. 160.000",
                "  50 Min"
            ),
            Style(
                R.drawable.style1,
                "Nama Style 3",
                "Rp. 170.000",
                "  40 Min"
            ),
            Style(
                R.drawable.style1,
                "Nama Style 4",
                "Rp. 180.000",
                "  30 Min"
            ),
            Style(
                R.drawable.style1,
                "Nama Style 1",
                "Rp. 150.000",
                "  60 Min"
            ),
            Style(
                R.drawable.style1,
                "Nama Style 2",
                "Rp. 160.000",
                "  50 Min"
            ),
            Style(
                R.drawable.style1,
                "Nama Style 3",
                "Rp. 170.000",
                "  40 Min"
            ),
            Style(
                R.drawable.style1,
                "Nama Style 4",
                "Rp. 180.000",
                "  30 Min"
            ),
            Style(
                R.drawable.style1,
                "Nama Style 1",
                "Rp. 150.000",
                "  60 Min"
            ),
            Style(
                R.drawable.style1,
                "Nama Style 2",
                "Rp. 160.000",
                "  50 Min"
            ),
            Style(
                R.drawable.style1,
                "Nama Style 3",
                "Rp. 170.000",
                "  40 Min"
            ),
            Style(
                R.drawable.style1,
                "Nama Style 4",
                "Rp. 180.000",
                "  30 Min"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_style)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = StyleAdapter(this,styleList){
        }
    }
}
