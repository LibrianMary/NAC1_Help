package com.example.nac1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Information(
    val name: String,
    val altura: String,
    val peso: String
) : Parcelable
