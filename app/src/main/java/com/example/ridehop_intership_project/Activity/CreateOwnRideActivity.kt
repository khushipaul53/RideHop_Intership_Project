package com.example.ridehop_intership_project.Activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.databinding.DataBindingUtil
import com.example.ridehop_intership_project.R
import com.google.android.gms.common.api.Status
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.api.model.TypeFilter
import com.google.android.libraries.places.widget.Autocomplete
import com.google.android.libraries.places.widget.AutocompleteActivity
import com.google.android.libraries.places.widget.AutocompleteSupportFragment
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode


class CreateOwnRideActivity : AppCompatActivity() {
    //     lateinit var binding: ActivityCreateOwnRideBinding
    lateinit var From: EditText
    lateinit var To: EditText
    var from= ""
    private val AUTOCOMPLETE_REQUEST_CODE = 1
    lateinit var bt_Login: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_create_own_ride)
        From = findViewById(R.id.From_searchView)
        To= findViewById(R.id.to)
        Places.initialize(applicationContext, "AIzaSyDZcBHRyr9ry2dVRcTTkQxlP1uANkVfvXE")

        From.setOnClickListener {
            from="from"
            startAutocompleteActivity()
        }
        To.setOnClickListener(View.OnClickListener {
             from="to"
            startAutocompleteActivity()

        })
        bt_Login.setOnClickListener(View.OnClickListener {
//            startActivity(Intent(  this, MyRides::class.java))

        })



        // Initialize the AutocompleteSupportFragment
//        val autocompleteFragment = supportFragmentManager.findFragmentById(R.id.places_autocomplete_fragment)
//                    as AutocompleteSupportFragment
//
//        // Set the Place Fields to retrieve
//        autocompleteFragment.setPlaceFields(listOf(Place.Field.ID, Place.Field.NAME))
//
//        // Set the Autocomplete Activity Mode to fullscreen or overlay
//        autocompleteFragment.setActivityMode(AutocompleteActivityMode.FULLSCREEN)

        // Handle place selection
        // Set up place selection listener
//
//        autocompleteFragment.setOnPlaceSelectedListener(object : PlaceSelectionListener {
//            override fun onPlaceSelected(place: Place) {
//                val placeName = place.name
//                val placeAddress = place.address
//                val placeId = place.id
//
//                Toast.makeText(this@CreateOwnRideActivity, placeName, Toast.LENGTH_SHORT).show();
//            }
//
//            override fun onError(status: Status) {}
//        })


    }

    private fun startAutocompleteActivity() {

        val autocompleteIntent =
            Autocomplete.IntentBuilder(
                AutocompleteActivityMode.OVERLAY,
                listOf(Place.Field.ID, Place.Field.NAME, Place.Field.ADDRESS)
            )
                .setTypeFilter(TypeFilter.ADDRESS) // Optional: Specify the type of place data to return
                .build(this)

        // Start the Autocomplete activity
        startActivityForResult(autocompleteIntent, AUTOCOMPLETE_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == AUTOCOMPLETE_REQUEST_CODE) {
            when (resultCode) {
                Activity.RESULT_OK -> {
                    val place = Autocomplete.getPlaceFromIntent(data!!)
                    val placeName = place.name
                    val placeAddress = place.address

                    // Populate the EditText with the selected place's information
                   Toast.makeText(this,placeAddress,Toast.LENGTH_SHORT).show()
                    if(from.equals("from"))
                    {
                        From.setText(placeAddress)

                    }
                    else if(from.equals("to"))
                    {
                        To.setText(placeAddress)

                    }
                }

                AutocompleteActivity.RESULT_ERROR -> {
                    val status = Autocomplete.getStatusFromIntent(data!!)
                    Toast.makeText(this,status.statusMessage,Toast.LENGTH_SHORT).show()
                }

                Activity.RESULT_CANCELED -> {
                    // The user canceled the operation.
                }
            }
        }
    }
}