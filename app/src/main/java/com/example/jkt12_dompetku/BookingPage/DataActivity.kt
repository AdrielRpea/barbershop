package com.example.jkt12_dompetku.BookingPage

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.media.AudioManager
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.jkt12_dompetku.R
import kotlinx.android.synthetic.main.activity_data.*

@Suppress("DEPRECATION")
class DataActivity : AppCompatActivity() {

    private var soundPool: SoundPool? = null
    private val soundId = 1
    lateinit var preferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)
        soundPool = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool!!.load(baseContext, R.raw.i_am_rider, 1)

        logout.setOnClickListener{
            val intent = Intent(this,FormBookingActivity::class.java)
            startActivity(intent)
            finish()
        }

        preferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)

        val name = preferences.getString("NAME","")
        TVname.text = name
        val addres = preferences.getString("ADDRES","")
        TVaddres.text = addres
        val phone = preferences.getInt("PHONENUMBER",0)
        TVphonenumber.text = "+62"+phone
        val email = preferences.getString("EMAIL","")
        TVemail.text = email

        hapus.setOnClickListener{
            soundPool?.play(soundId, 1F, 1F, 0, 0, 1F)

            val editor : SharedPreferences.Editor = preferences.edit()
            editor.clear()
            editor.apply()

            val intent = Intent(this,FormBookingActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
