package com.example.ridehop_intership_project.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ridehop_intership_project.Activity.SearchRidesActivity
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.Response.FindRideResponse
import java.io.Serializable

class RidesAvailableAdapter(
    private val mList: ArrayList<FindRideResponse>,
    searchRidesActivity: SearchRidesActivity
) : RecyclerView.Adapter<RidesAvailableAdapter.ViewHolder>() {

    var context=searchRidesActivity
    // create new views

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.rides_item, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

//        val ItemsViewModel = mList[position]

        // sets the image to the imageview from our itemHolder class
//       var Img=holder.imageView.setImageResource(mList[position].Image)
     var Name=holder.textView.setText("Date: "+mList[position].dateTime)
//        holder.rating.numStars=mList[position].Rating
//        var rating= mList[position].Rating
        var price=holder.price.setText("Price: $"+mList[position].price.toString()+"(PER SEAT)")
         var bookingId=holder.booking_Id.setText("Booking Id:"+ mList[position].bookingId.toString())
         holder.tvfrom.setText(mList[position].from)
        holder.tvto.setText(mList[position].to)

//        // sets the text to the textview from our itemHolder class
//        holder.textView.text = ItemsViewModel.text
        holder.LLRides.setOnClickListener(View.OnClickListener {

            context.open(mList[position])
        })

    }


    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        var LLRides:LinearLayout=itemView.findViewById(R.id.LLRides)
        var booking_Id: TextView = itemView.findViewById(R.id.bookingId)
        var textView: TextView = itemView.findViewById(R.id.textView)
        var price:TextView=itemView.findViewById(R.id.tvPrice)
        var tvfrom:TextView=itemView.findViewById(R.id.tvfrom)
        var tvto:TextView=itemView.findViewById(R.id.tvto)

    }




}
