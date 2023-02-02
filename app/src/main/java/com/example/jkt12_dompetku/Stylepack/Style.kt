package com.example.jkt12_dompetku.Stylepack

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Style(val imgStyle: Int,
                 val nameStyle: String,
                 val hargaStyle: String,
                 val timeStyle: String
) : Parcelable
