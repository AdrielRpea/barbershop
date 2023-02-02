package com.example.jkt12_dompetku.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.jkt12_dompetku.BookingPage.BarbershopActivity
import com.example.jkt12_dompetku.Profile.ProfileActivity
import com.example.jkt12_dompetku.R
import com.example.jkt12_dompetku.databinding.FragmentBookingBinding
import com.example.jkt12_dompetku.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = FragmentProfileBinding.inflate(layoutInflater)

        bind.PFbackright1Alamat.setOnClickListener {
            val inten = Intent(this@ProfileFragment.requireContext(), ProfileActivity::class.java)
            startActivity(inten)
        }
        return  bind.root
    }
}