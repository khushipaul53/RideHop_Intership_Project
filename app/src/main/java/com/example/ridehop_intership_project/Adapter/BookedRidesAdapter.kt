package com.example.ridehop_intership_project.Adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ridehop_intership_project.Fragment.BookedRidesFragment
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.Response.BookedRides

class BookedRidesAdapter(
    private val mList: ArrayList<BookedRides>,
    fragment: BookedRidesFragment
) : RecyclerView.Adapter<BookedRidesAdapter.ViewHolder>() {

    var context=fragment
    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.booked_rides_item, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.booking_id.setText("Booking Id: "+ mList[position].booking_id)
        holder.datentime.setText(mList[position].Date)
        holder.from.setText(mList[position].From)
        holder.to_dest.setText(mList[position].Dest)
        holder.namePickup.setText(mList[position].Name+", "+mList[position].address)



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
        var booking_id:TextView=itemView.findViewById(R.id.tvbooking)
        val from: TextView = itemView.findViewById(R.id.tvfrom)
        val to_dest: TextView = itemView.findViewById(R.id.tvto)
        var datentime:TextView=itemView.findViewById(R.id.tvdatentime)
        val namePickup:TextView=itemView.findViewById(R.id.tvcustomerName)
        var LLRides:LinearLayout=itemView.findViewById(R.id.LLRides)
    }




}
