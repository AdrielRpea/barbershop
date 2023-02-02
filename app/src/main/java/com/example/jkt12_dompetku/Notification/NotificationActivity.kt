package com.example.jkt12_dompetku.Notification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jkt12_dompetku.R

class NotificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_notification)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.icon_message2,
                "Hello Pelanggan Baru",
                "Selamat anda telah melakukan pemotongan rambut di tempat ini"
            ),
            Superhero(
                R.drawable.icon_promo,
                "Rambut Adalah Mahkota",
                "Dengan bercukur di tempat kami, mahkota anda dapat lebih baik lagi"
            ),
            Superhero(
                R.drawable.icon_message2,
                "Promo Spesial",
                "Paket anda dengan no. resi 1243456 telah sampai di tujuan. Silahkan cek paket anda sekarang." +
                        "Paket anda dengan no. resi 1243456 telah sampai di tujuan. Silahkan cek paket anda sekarang. " +
                        "Paket anda dengan no. resi 1243456 telah sampai di tujuan. Silahkan cek paket anda sekarang. " +
                        "Paket anda dengan no. resi 1243456 telah sampai di tujuan. Silahkan cek paket anda sekarang. " +
                        "Paket anda dengan no. resi 1243456 telah sampai di tujuan. Silahkan cek paket anda sekarang. " +
                        "Paket anda dengan no. resi 1243456 telah sampai di tujuan. Silahkan cek paket anda sekarang. " +
                        "Paket anda dengan no. resi 1243456 telah sampai di tujuan. Silahkan cek paket anda sekarang. " +
                        "Paket anda dengan no. resi 1243456 telah sampai di tujuan. Silahkan cek paket anda sekarang.  "
            ),
            Superhero(
                R.drawable.icon_promo,
                "Promo Spesial",
                "Ini adalah promo yang akan anda dapatkan ketika anda ingin berbelanja disini"
            ),
            Superhero(
                R.drawable.icon_message2,
                "Promo Spesial",
                "Ini adalah promo yang akan anda dapatkan ketika anda ingin berbelanja disini"
            ),
            Superhero(
                R.drawable.icon_promo,
                "Promo Spesial",
                "Ini adalah promo yang akan anda dapatkan ketika anda ingin berbelanja disini"
            ),
            Superhero(
                R.drawable.icon_message2,
                "Promo Spesial",
                "Ini adalah promo yang akan anda dapatkan ketika anda ingin berbelanja disini"
            ),
            Superhero(
                R.drawable.icon_promo,
                "Promo Spesial",
                "Ini adalah promo yang akan anda dapatkan ketika anda ingin berbelanja disini"
            ),
            Superhero(
                R.drawable.icon_message2,
                "Promo Spesial",
                "Ini adalah promo yang akan anda dapatkan ketika anda ingin berbelanja disini"
            ),
            Superhero(
                R.drawable.icon_promo,
                "Promo Spesial",
                "Ini adalah promo yang akan anda dapatkan ketika anda ingin berbelanja disini"
            ),
            Superhero(
                R.drawable.icon_message2,
                "Promo Spesial",
                "Ini adalah promo yang akan anda dapatkan ketika anda ingin berbelanja disini"
            ),
            Superhero(
                R.drawable.icon_promo,
                "Promo Spesial",
                "Ini adalah promo yang akan anda dapatkan ketika anda ingin berbelanja disini" +
                        "silahkan nikmati apa yang ingin anda nikmati di tempat ini dengan fasilitas yang ada yaaa"
            ),
            Superhero(
                R.drawable.icon_message2,
                "Promo Spesial",
                "Ini adalah promo yang akan anda dapatkan ketika anda ingin berbelanja disini"
            ),
            Superhero(
                R.drawable.icon_promo,
                "Promo Spesial",
                "Ini adalah promo yang akan anda dapatkan ketika anda ingin berbelanja disini"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this,superheroList){

        }
    }
}