package com.example.jkt12_dompetku.fragments.ShopFragmentData

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class ModelProduk(
    var namaProduk : String? = null,
    var hargaProduk : String? = null,
    var gambarProduk : Int = 0
) : Parcelable
