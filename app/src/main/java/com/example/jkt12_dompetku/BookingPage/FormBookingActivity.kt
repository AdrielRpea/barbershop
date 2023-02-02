package com.example.jkt12_dompetku.BookingPage

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.jkt12_dompetku.R
import com.example.jkt12_dompetku.Stylepack.StyleActivity
import kotlinx.android.synthetic.main.activity_form_booking.*

class FormBookingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_form_booking)

        FBBtnNext.setOnClickListener {
            val gotoST = Intent(this, StyleActivity::class.java)
            startActivity(gotoST)
}
            lateinit var sharedPreferences: SharedPreferences
        var isRemembered = false

            sharedPreferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)

            isRemembered = sharedPreferences.getBoolean("CHECKBOX", false)

            if (isRemembered) {
                val intent = Intent(this, DataActivity::class.java)
                startActivity(intent)
                finish()
            }
            checkbox.setOnClickListener {
                Toast.makeText(this, "Information Saved", Toast.LENGTH_SHORT).show()
            }

            FBDatasaya.setOnClickListener {
                val name: String = FBNameinputdata.text.toString()
                val addres: String = FBAddressinputdata.text.toString()
                val phonenumber: Int = FBPhoneNumberinputdata.text.toString().toInt()
                val email: String = FBEmailinputdata.text.toString()
                val checked: Boolean = checkbox.isChecked

                val editor: SharedPreferences.Editor = sharedPreferences.edit()
                editor.putString("NAME", name)
                editor.putString("ADDRES", addres)
                editor.putInt("PHONENUMBER", phonenumber)
                editor.putString("EMAIL", email)
                editor.putBoolean("CHECKBOX", checked)
                editor.apply()

                val intent = Intent(this, DataActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }