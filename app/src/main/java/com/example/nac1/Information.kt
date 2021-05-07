package com.example.nac1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val name: String,
    val height: String,
    val weight: String
    //val resultado: Double
) : Parcelable
