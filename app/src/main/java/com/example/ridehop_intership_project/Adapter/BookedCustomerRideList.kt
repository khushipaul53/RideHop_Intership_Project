package com.example.ridehop_intership_project.Adapter

import com.example.ridehop_intership_project.Model.BookedUser



import com.example.ridehop_intership_project.Fragment.OfferedRidesFragment


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ridehop_intership_project.Fragment.BookedRidesFragment
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.Response.BookedListResponse
import com.example.ridehop_intership_project.Response.OfferedRideResponse

class BookedCustomerRideList(
    private val mList: ArrayList<String>,

) : RecyclerView.Adapter<BookedCustomerRideList.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.booked_rides_customer_list, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tv_CustomerName.setText(mList[position])

//        holder.tvdate.setText(mList[position].Date)
//        holder.LLRides.setOnClickListener(View.OnClickListener {
//            context.openRideDetails(mList[position].bookingUsers)
//        })

    }


    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        var tv_CustomerName:TextView=itemView.findViewById(R.id.tv_CustomerName)

    }




}
