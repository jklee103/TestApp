package com.example.architecterapp.data.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

data class User(
    var id: Long,
    var name: String,
    var username: String,
    var email: String,
    var address: Address,
    var phone: String,
    var website: String,
    var company: Company
)