package com.example.architecterapp.data.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

data class Address(
    var street: String,
    var suite: String,
    var city: String,
    var zipcode: String,
    var geo: Geo
)

{
    override fun toString(): String {
        return String.format("%s, %s, %s", suite, street, city)
    }
}