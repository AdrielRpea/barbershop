package com.example.jkt12_dompetku

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Settings
import android.widget.Toast

class MyAirPlaneReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
            if(Settings.System.getInt(context.contentResolver,
                    Settings.Global.AIRPLANE_MODE_ON,0)==0){
                Toast.makeText(context, "Flight mode status OFF.",
                    Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(context, "Flight mode Status on.",
                    Toast.LENGTH_LONG).show()
            }
    }
}