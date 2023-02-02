package com.example.jkt12_dompetku.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.jkt12_dompetku.BookingPage.BarbershopActivity
import com.example.jkt12_dompetku.R
import com.example.jkt12_dompetku.databinding.FragmentBookingBinding
import kotlinx.android.synthetic.main.fragment_booking.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.BS1

class BookingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = FragmentBookingBinding.inflate(layoutInflater)

        bind.BS1.setOnClickListener {
            val inten = Intent(this@BookingFragment.requireContext(),BarbershopActivity::class.java)
            startActivity(inten)
        }
        return  bind.root
    }
}