package com.example.architecterapp.data.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

data class Comment(
    var postId: Long,
    var id: Long,
    var name: String,
    var email: String,
    var body: String
)