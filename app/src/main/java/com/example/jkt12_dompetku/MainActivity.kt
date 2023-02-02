package com.example.jkt12_dompetku

import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.jkt12_dompetku.BookingPage.BarbershopActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_home.*

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNav: BottomNavigationView
    private lateinit var appBarconfiguration: AppBarConfiguration
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        val AirplaneReceiver: BroadcastReceiver = MyAirPlaneReceiver()
        val filter = IntentFilter()
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        registerReceiver(AirplaneReceiver, filter)

        bottomNav = findViewById(R.id.bottomNav)
        navController = findNavController(R.id.fragmentContainerView)
        appBarconfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.bookingFragment,
                R.id.shopFragment,
                R.id.profileFragment
            )
        )
        setupActionBarWithNavController(navController, appBarconfiguration)

        bottomNav.setupWithNavController(navController)

        BS1.setOnClickListener {
            val gotoBS1 = Intent(this, BarbershopActivity::class.java)
            startActivity(gotoBS1)
        }
    }
}
