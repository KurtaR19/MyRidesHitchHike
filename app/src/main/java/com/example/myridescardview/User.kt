package com.example.myridescardview

import java.io.Serializable

data class userInfo (
    var fullName: String? = null,
    var email: String? = null,
    var phoneNumber: Long? = null,
    var userId: String? = null
) : Serializable
