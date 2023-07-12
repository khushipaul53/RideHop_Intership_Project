package com.example.ridehop_intership_project.Activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ridehop_intership_project.Adapter.RidesAvailableAdapter
import com.example.ridehop_intership_project.Model.RideAvailable
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.databinding.ActivitySearchRidesBinding


class SearchRidesActivity : AppCompatActivity() {

   var binding:ActivitySearchRidesBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_search_rides)

        binding!!.rvRides.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<RideAvailable>()
        data.add(RideAvailable(R.drawable.user,"Carlos,Ward",2,"$10"))
        data.add(RideAvailable(R.drawable.user,"Carlos,Ward",5,"$7"))
        data.add(RideAvailable(R.drawable.user,"Carlos,Ward",3,"$6"))
        data.add(RideAvailable(R.drawable.user,"Carlos,Ward",4,"$5"))
        data.add(RideAvailable(R.drawable.user,"Carlos,Ward",4,"$15"))
        data.add(RideAvailable(R.drawable.user,"Carlos,Ward",1,"$9"))
        data.add(RideAvailable(R.drawable.user,"Carlos,Ward",3,"$5"))
        val adapter = RidesAvailableAdapter(data,this)
//
//        // Setting the Adapter with the recyclerview
        binding!!.rvRides.adapter = adapter



    }

    fun open( Image:String,
              Name:String,
              Rating:Int,price:String) {

        var b=Bundle()

        val intent = Intent(this, RiderDetailsActivity::class.java)
        intent.putExtra("Image",Image)
        intent.putExtra("name",Name)
        intent.putExtra("rating",Rating)
        intent.putExtra("price",price)
        startActivity(intent)


    }


}