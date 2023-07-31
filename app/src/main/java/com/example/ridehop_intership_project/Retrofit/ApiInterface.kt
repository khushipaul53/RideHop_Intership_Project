package com.example.ridehop_intership_project.Retrofit

import com.example.ridehop_intership_project.Response.LoginResponse
import com.example.ridehop_intership_project.Response.SignupResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {

    @POST("/ridehop/login")
    fun login(@Body param: Map<String?, String?>?): Call<LoginResponse?>?

    @POST("/ridehop/signup")
    fun signup(@Body param: Map<String?, String?>?): Call<SignupResponse?>?
}