package com.example.ridehop_intership_project.Response

import com.example.ridehop_intership_project.Model.BookedUser

class LoginUser (
    var _id:String,
    var email: String,
    var fullName: String,
    var password: String,
    var gender: String,
    var age: Int,
    var ridesBooked: ArrayList<BookedUser>,
        )