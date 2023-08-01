package com.example.ridehop_intership_project.Response

import java.io.Serializable


class SignupResponse (
    var message:String,
    var token:String,
    var user:User,
):Serializable


