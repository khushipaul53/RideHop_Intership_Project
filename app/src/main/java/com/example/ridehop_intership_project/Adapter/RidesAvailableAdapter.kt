package com.example.ridehop_intership_project.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ridehop_intership_project.Activity.SearchRidesActivity
import com.example.ridehop_intership_project.Model.RideAvailable
import com.example.ridehop_intership_project.R

class RidesAvailableAdapter(
    private val mList: ArrayList<RideAvailable>,
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
       var Img=holder.imageView.setImageResource(mList[position].Image)
     var Name=holder.textView.setText(mList[position].Name)
        holder.rating.numStars=mList[position].Rating
        var rating= mList[position].Rating
        var price=holder.price.setText(mList[position].Price+"(PER SEAT)")
//        // sets the text to the textview from our itemHolder class
//        holder.textView.text = ItemsViewModel.text
        holder.LLRides.setOnClickListener(View.OnClickListener {

            context.open(Img.toString(),Name.toString(),rating, price.toString())
        })

    }


    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        var LLRides:LinearLayout=itemView.findViewById(R.id.LLRides)
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textView: TextView = itemView.findViewById(R.id.textView)
        var price:TextView=itemView.findViewById(R.id.tvPrice)
        val rating:RatingBar=itemView.findViewById(R.id.rating)
    }




}
