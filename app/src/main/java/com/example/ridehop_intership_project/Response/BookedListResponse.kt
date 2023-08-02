package com.example.ridehop_intership_project.Response

import com.example.ridehop_intership_project.Model.BookedUser

class BookedListResponse (
    var _id: String,
    var  from:String,
    var  to:String,
    var  pickupPoint:String,
    var  dropOffPoint:String,
    var dateTime:String,
    var seats:Int,
    var  price:Int,
    var bookingId:Int,
    var user:User,
    var__v:Int,
    var bookingUsers:ArrayList<BookedUser>
        )