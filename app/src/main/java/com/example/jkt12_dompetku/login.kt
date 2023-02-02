package com.example.jkt12_dompetku

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.google.android.material.textfield.TextInputEditText

class login : AppCompatActivity() {
    val Channel_Notification_ID = "Channel_Notification_ID"
    val Channel_Notification_Name = "Channel_Notification_Name"
    val Notification_ID = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_login)
        createNotificationChannel()
    }

    fun createNotificationChannel(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val channel = NotificationChannel(Channel_Notification_ID, Channel_Notification_Name,
            NotificationManager.IMPORTANCE_DEFAULT).apply {  }

            val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(channel)
        }
    }

    fun onclick(view: View) {
        login(
            findViewById<TextInputEditText>(R.id.edtUserName).text.toString(),
            findViewById<TextInputEditText>(R.id.edtPassword).text.toString()
        )
    }

    fun login(userName: String, password: String) {
        if (userName == "name" && password == "1234") {
            startActivity(Intent(this, MainActivity::class.java))
            Toast.makeText(this, "Login Success!", Toast.LENGTH_SHORT).show()

            val notification = NotificationCompat.Builder(this, Channel_Notification_ID)
                .setContentTitle("Anda Telah Berhasil Login")
                .setContentText("Nicholas Adriel")
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .build()

            val notificationManager = NotificationManagerCompat.from(this)
            notificationManager.notify(Notification_ID, notification)
        } else {
            Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
        }
    }
}
