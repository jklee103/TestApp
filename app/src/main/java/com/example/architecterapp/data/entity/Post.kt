package com.example.architecterapp.data.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Post(
    var userId: Long,
    var id: Long,
    var title: String,
    var body: String
) : Parcelable