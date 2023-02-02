package com.example.jkt12_dompetku.fragments

import android.content.Intent
import android.graphics.ColorSpace
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.bumptech.glide.Glide.init
import com.example.jkt12_dompetku.BookingPage.BarbershopActivity
import com.example.jkt12_dompetku.Notification.NotificationActivity
import com.example.jkt12_dompetku.R
import com.example.jkt12_dompetku.databinding.FragmentBookingBinding
import com.example.jkt12_dompetku.databinding.FragmentHomeBinding
import com.example.jkt12_dompetku.databinding.FragmentShopBinding
import com.example.jkt12_dompetku.fragments.ShopFragmentData.ModelProduk
import com.example.jkt12_dompetku.fragments.ShopFragmentData.ProdukAdapter
import com.example.jkt12_dompetku.fragments.ShopFragmentData.ShopAdapter

class ShopFragment : Fragment() {

    private var binding : FragmentShopBinding? = null
    private lateinit var Binding: FragmentShopBinding
    lateinit var vpSlider : ViewPager
    lateinit var rvProduk: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_shop,container,false)

        //<-- Recycler View -->
        val lm = LinearLayoutManager(activity)
        lm.orientation = LinearLayoutManager.HORIZONTAL
        rvProduk = view.findViewById(R.id.rv_baju)

        val adapterProduk = ProdukAdapter(ArrayProduk,activity)
        rvProduk.setHasFixedSize(true)
        rvProduk.layoutManager = lm
        rvProduk.adapter = adapterProduk

        return view
    }
    val ArrayProduk : ArrayList<ModelProduk>get(){
        val arrayproduk = ArrayList<ModelProduk>()

        val produkbaju1 = ModelProduk()
        produkbaju1.namaProduk = "Alat Cukur 1"
        produkbaju1.hargaProduk = "Rp. 90.000"
        produkbaju1.gambarProduk = R.drawable.barang1

        val produkbaju2 = ModelProduk()
        produkbaju2.namaProduk = "Alat Cukur 2"
        produkbaju2.hargaProduk = "Rp. 190.000"
        produkbaju2.gambarProduk = R.drawable.barang2

        val produkbaju3 = ModelProduk()
        produkbaju3.namaProduk = "Alat Cukur 3"
        produkbaju3.hargaProduk = "Rp. 290.000"
        produkbaju3.gambarProduk = R.drawable.barang3

        val produkbaju4 = ModelProduk()
        produkbaju4.namaProduk = "Alat Cukur 4"
        produkbaju4.hargaProduk = "Rp. 390.000"
        produkbaju4.gambarProduk = R.drawable.barang4

        arrayproduk.add(produkbaju1)
        arrayproduk.add(produkbaju2)
        arrayproduk.add(produkbaju3)
        arrayproduk.add(produkbaju4)

        return arrayproduk
    }

    override fun onDestroyView() {
        super.onDestroyView()

        binding = null
    }
}