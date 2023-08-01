package com.example.ridehop_intership_project.Retrofit

import com.example.ridehop_intership_project.Response.CreateRideResponse
import com.example.ridehop_intership_project.Response.FindRideResponse
import com.example.ridehop_intership_project.Response.LoginResponse
import com.example.ridehop_intership_project.Response.SignupResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiInterface {

    @POST("/ridehop/login")
    fun login(@Body param: Map<String?, String?>?): Call<LoginResponse?>?

    @POST("/ridehop/signup")
    fun signup(@Body param: Map<String?, String?>?): Call<SignupResponse?>?

    @GET("/ride/findride")
    fun findRide(
        @Header("x-auth-token") token:String,
        @Query("from") from: String?,
        @Query("to") to: String,
        @Query("seats") seats: Int
    ): Call<List<FindRideResponse?>>?

    @POST("ride/create")
    fun createRide(
        @Header("x-auth-token")token:String,
        @Body param: Map<String?, String?>?):
            Call<CreateRideResponse?>?

}