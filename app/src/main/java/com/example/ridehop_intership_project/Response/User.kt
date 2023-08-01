package com.example.ridehop_intership_project.Response

import java.io.Serializable

class User(
    var id:String,
    var email:String,
    var fullName:String,
    var gender:String,
    var age:Int,

    ): Serializable