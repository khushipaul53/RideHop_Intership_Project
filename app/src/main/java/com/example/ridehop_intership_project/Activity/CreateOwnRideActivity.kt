package com.example.ridehop_intership_project.Activity

import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.databinding.ActivityCreateOwnRideBinding
import com.google.android.gms.common.api.Status
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.widget.AutocompleteSupportFragment
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener

class CreateOwnRideActivity : AppCompatActivity() {
    lateinit var binding: ActivityCreateOwnRideBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_create_own_ride)

        val ai: ApplicationInfo = this.packageManager
            .getApplicationInfo(this.packageName, PackageManager.GET_META_DATA)
        val value = ai.metaData["keyValue"]
        val apiKey = value.toString()

        if (!Places.isInitialized()) {
            Places.initialize(applicationContext, apiKey)
            val autocompleteSupportFragment1 = supportFragmentManager.findFragmentById(R.id.map) as AutocompleteSupportFragment?

            autocompleteSupportFragment1!!.setPlaceFields(
                listOf(

                    Place.Field.NAME,
                    Place.Field.ADDRESS,
                    Place.Field.PHONE_NUMBER,
                    Place.Field.LAT_LNG,
                    Place.Field.OPENING_HOURS,
                    Place.Field.RATING,
                    Place.Field.USER_RATINGS_TOTAL

                )
            )
            autocompleteSupportFragment1.setOnPlaceSelectedListener(object :
                PlaceSelectionListener {
                override fun onPlaceSelected(place: Place){


                    // Information about the place
                    val name = place.name
                    val address = place.address
                    val phone = place.phoneNumber.toString()
                    val latlng = place.latLng
                    val latitude = latlng?.latitude
                    val longitude = latlng?.longitude

                    val isOpenStatus : String = if(place.isOpen == true){
                        "Open"
                    } else {
                        "Closed"
                    }

                    val rating = place.rating
                    val userRatings = place.userRatingsTotal

                    binding.from.text = "Name: $name \nAddress: $address \nPhone Number: $phone \n" +
                            "Latitude, Longitude: $latitude , $longitude \nIs open: $isOpenStatus \n" +
                            "Rating: $rating \nUser ratings: $userRatings"
                }

                override fun onError(p0: Status) {
                    Toast.makeText(applicationContext,"Some error occurred", Toast.LENGTH_SHORT).show()
                }
            })


    }
}
}