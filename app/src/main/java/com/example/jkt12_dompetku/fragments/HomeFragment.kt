package com.example.jkt12_dompetku.fragments


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.jkt12_dompetku.ImageData
import com.example.jkt12_dompetku.ImageSliderAdapter
import com.example.jkt12_dompetku.Notification.NotificationActivity
import com.example.jkt12_dompetku.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var adapter: ImageSliderAdapter
    private val list = ArrayList<ImageData>()
    private lateinit var dots: ArrayList<TextView>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding.btnnotification.setOnClickListener {
            val inten = Intent(this@HomeFragment.requireContext(), NotificationActivity::class.java)
            startActivity(inten)
        }
        return (binding.root)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentHomeBinding.inflate(layoutInflater)

        list.add(
            ImageData(
                "https://th.bing.com/th/id/OIP.e1vffpnOUHpTTuLRpEE8QwHaE-?w=263&h=180&c=7&r=0&o=5&dpr=1.25&pid=1.7"
            )
        )
        list.add(
            ImageData(
                "https://th.bing.com/th/id/OIP._OEIt3ngPFreWYtDlWPKwwHaFj?pid=ImgDet&rs=1"
            )
        )
        list.add(
            ImageData(
                "https://th.bing.com/th/id/OIP.sUElW-beV0kWZdCsY-2otAHaFj?pid=ImgDet&w=960&h=720&rs=1"
            )
        )
        adapter = ImageSliderAdapter(list)
        binding.viewPager.adapter = adapter
    }
}