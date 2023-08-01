package com.example.ridehop_intership_project.Activity

import android.app.Activity
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.ContentValues
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.ridehop_intership_project.Adapter.RidesAvailableAdapter
import com.example.ridehop_intership_project.Fragment.ProfileFragment
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.Response.CreateRideResponse
import com.example.ridehop_intership_project.Response.FindRideResponse
import com.example.ridehop_intership_project.Response.SignupResponse
import com.example.ridehop_intership_project.Retrofit.APIClient
import com.example.ridehop_intership_project.Retrofit.ApiInterface
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.api.model.TypeFilter
import com.google.android.libraries.places.widget.Autocomplete
import com.google.android.libraries.places.widget.AutocompleteActivity
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.Calendar


class CreateOwnRideActivity : AppCompatActivity() {
    //     lateinit var binding: ActivityCreateOwnRideBinding
    lateinit var From: EditText
    lateinit var To: EditText
    lateinit var pickup: EditText
    lateinit var dropoff: EditText
    lateinit var dateTime: EditText
    lateinit var price: EditText


    lateinit var apiInterface: ApiInterface

    var from= ""
    private val AUTOCOMPLETE_REQUEST_CODE = 1
    lateinit var bt_Login: AppCompatButton
    lateinit var bt_back:ImageButton
    lateinit var seats:EditText
    lateinit var sh: SharedPreferences
    var token=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_create_own_ride)
        From = findViewById(R.id.From_searchView)
        To= findViewById(R.id.to_search)
        bt_Login=findViewById(R.id.bt_Submit)
        pickup=findViewById(R.id.et_pickup)
        dropoff=findViewById(R.id.et_Dropoff)
        dateTime=findViewById(R.id.etdate)
        seats=findViewById(R.id.etseats)
        price=findViewById(R.id.etprice)
        bt_back=findViewById(R.id.sideMenu)

        Places.initialize(applicationContext, "AIzaSyDZcBHRyr9ry2dVRcTTkQxlP1uANkVfvXE")
        apiInterface= APIClient.client!!.create(ApiInterface::class.java).also {
            apiInterface = it
        }
//        val fragment: ProfileFragment? = supportFragmentManager.findFragmentById(R.id.fragment_profile) as ProfileFragment? // Replace 'YourFragment' with the actual name of your fragment class and 'R.id.fragment_container' with the ID of the fragment container in your activity's layout
        sh = this.getSharedPreferences("MySharedPref", MODE_PRIVATE)
        token = sh.getString("tokken", "")!!


        pickup.setOnClickListener {
            from="from"
            startAutocompleteActivity()
        }
        dropoff.setOnClickListener(View.OnClickListener {
             from="to"
            startAutocompleteActivity()
//
        })
        bt_back.setOnClickListener(View.OnClickListener {
            onBackPressed()
        })
        bt_Login.setOnClickListener(View.OnClickListener {
//            startActivity(Intent(  this, MyRides::class.java))

            CreateRideApi()
//            if (fragment != null) {
//                val isFilled: Boolean = fragment.isEditTextFilled()
//                if (isFilled) {
//
//                    CreateRideApi()
//                }
//                else{
//                    Toast.makeText(this,"Please fill out the Phone Number in Profile Section", Toast.LENGTH_SHORT).show();
//
//                }
//            }
        })

        dateTime.setOnClickListener(View.OnClickListener {
            val currentDate = Calendar.getInstance()
            val  date = Calendar.getInstance()
            DatePickerDialog(
               this,
                { view, year, monthOfYear, dayOfMonth ->
                    date.set(year, monthOfYear, dayOfMonth)
                    TimePickerDialog(
                        this,
                        { view, hourOfDay, minute ->
                            date.set(Calendar.HOUR_OF_DAY, hourOfDay)
                            date.set(Calendar.MINUTE, minute)
                            Log.v(ContentValues.TAG, "The choosen one " + date.getTime())
                           dateTime.setText(date.getTime().toString())
                        },
                        currentDate[Calendar.HOUR_OF_DAY],
                        currentDate[Calendar.MINUTE], false
                    ).show()
                }, currentDate[Calendar.YEAR], currentDate[Calendar.MONTH],
                currentDate[Calendar.DATE]
            ).show()
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

    private fun CreateRideApi() {
        Log.d("wei",""+From.text.toString()+To.text.toString()+pickup.text.toString()+dropoff.text.toString()+seats.text.toString() )

        val data: MutableMap<String?, String?> = HashMap()
        data["from"] = From.text.toString()
        data["to"] = To.text.toString()
        data["pickupPoint"] = pickup.text.toString()
        data["dropOffPoint"]=dropoff.text.toString()
        data["dateTime"] = dateTime.text.toString()
        data["seats"]=seats.text.toString()
        data["price"]=price.text.toString()

        val call: Call<CreateRideResponse?>? = apiInterface.createRide(token = "${token}",data)
        call!!.enqueue(object : Callback<CreateRideResponse?> {
            override fun onResponse(
                call: Call<CreateRideResponse?>?,
                response: Response<CreateRideResponse?>
            ) {

                if(response.isSuccessful)
                {
                    Toast.makeText(this@CreateOwnRideActivity,response.body()!!.message,Toast.LENGTH_SHORT).show()
                    onBackPressed()

                }



            }

            override fun onFailure(call: Call<CreateRideResponse?>, t: Throwable) {
                Toast.makeText(this@CreateOwnRideActivity,t.message, Toast.LENGTH_SHORT).show()

            } //
            //
        })
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
                        pickup.setText(placeAddress)

                    }
                    else if(from.equals("to"))
                    {
                        dropoff.setText(placeAddress)

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