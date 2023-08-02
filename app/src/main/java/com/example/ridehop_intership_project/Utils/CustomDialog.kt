package com.example.ridehop_intership_project.Utils

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ridehop_intership_project.Adapter.BookedCustomerRideList
import com.example.ridehop_intership_project.Adapter.RidesAvailableAdapter
import com.example.ridehop_intership_project.Model.BookedUser
import com.example.ridehop_intership_project.R

class CustomDialog(context: Context) : AlertDialog(context) {

    private lateinit var dialogTitle: TextView
    private lateinit var name: TextView

     var list: ArrayList<String> = ArrayList()

    private lateinit var customer: TextView

    private lateinit var rvList: RecyclerView
    private lateinit var seats: TextView
    private lateinit var gender: TextView



    private lateinit var dialogButton: Button

    init {
        val inflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.ride_detail_popup, null)
        setView(view)

        dialogTitle = view.findViewById(R.id.dialogTitle)
        customer = view.findViewById(R.id.customer)
        rvList=view.findViewById(R.id.rv_listofcustomer)


        dialogButton = view.findViewById(R.id.dialogButton)

        dialogButton.setOnClickListener {
            dismiss()
        }
    }

    fun setDialogTitle(
        title: String,
        listSize: Int,
        bookingUsers: ArrayList<BookedUser>,
    ) {
        dialogTitle.text = title
        customer.text=listSize.toString()+ " person has booked your ride"
        rvList.layoutManager = LinearLayoutManager(context)
        for(i in 0 until listSize )
        {
        list.add(bookingUsers[i].fullName)}
        val adapter = BookedCustomerRideList(list)
        rvList.adapter = adapter








    }

    // You can add methods to customize the dialog further
}
