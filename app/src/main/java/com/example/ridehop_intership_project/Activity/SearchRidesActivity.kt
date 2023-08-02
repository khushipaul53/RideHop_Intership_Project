package com.example.ridehop_intership_project.Activity

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.ridehop_intership_project.Adapter.RidesAvailableAdapter
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.Response.FindRideResponse
import com.example.ridehop_intership_project.Retrofit.APIClient
import com.example.ridehop_intership_project.Retrofit.ApiInterface
import com.example.ridehop_intership_project.databinding.ActivitySearchRidesBinding
import com.facebook.CallbackManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.UnsupportedEncodingException
import java.net.URLDecoder


class SearchRidesActivity : AppCompatActivity() {

   var binding:ActivitySearchRidesBinding?=null
    lateinit var apiInterface: ApiInterface
    lateinit var sh:SharedPreferences
    var token=""
    var from=""
    var to=""
    var seats=0
lateinit var swipe:SwipeRefreshLayout
    var callbackManager = CallbackManager.Factory.create()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_search_rides)


        apiInterface= APIClient.client!!.create(ApiInterface::class.java).also {
            apiInterface = it
        }
        sh = this.getSharedPreferences("MySharedPref", MODE_PRIVATE)
        token = sh.getString("tokken", "")!!
         from=decodeUrlParameter(intent.extras!!.getString("from")!!)
         to=decodeUrlParameter(intent.extras!!.getString("to")!!)
         seats=Integer.parseInt(intent.extras!!.getString("selectedSeats"))

        FindRideApi(from!!,to!!,seats)
     binding!!.icBack.setOnClickListener(View.OnClickListener {
         onBackPressed()
     })
        binding!!.rvRides.layoutManager = LinearLayoutManager(this)





    }
    fun decodeUrlParameter(encodedParameter: String): String {
        try {
            return URLDecoder.decode(encodedParameter, "UTF-8")
        } catch (e: UnsupportedEncodingException) {
            e.printStackTrace()
        }
        return "" // Return an empty string or handle the error accordingly
    }

    private fun FindRideApi(from:String,to:String,seats:Int) {
        val call: Call<List<FindRideResponse?>>? = apiInterface.findRide(token = "${token}",from,to,seats)
        call!!.enqueue(object : Callback<List<FindRideResponse?>> {
            override fun onResponse(
                call: Call<List<FindRideResponse?>>?,
                response: Response<List<FindRideResponse?>>
            ) {

                if(response.isSuccessful)
                {
                   var dataList= response.body()!!
                    Log.d("lcmci",""+dataList)
                    var data = dataList as ArrayList<FindRideResponse>


                    val adapter = RidesAvailableAdapter(data,this@SearchRidesActivity)
//
//        // Setting the Adapter with the recyclerview
                    binding!!.rvRides.adapter = adapter


                }



            }

            override fun onFailure(call: Call<List<FindRideResponse?>>, t: Throwable) {
                Toast.makeText(this@SearchRidesActivity,t.message, Toast.LENGTH_SHORT).show()

            } //
            //
        })
    }

    fun open(findRideResponse: FindRideResponse) {
        var id = findRideResponse._id
        var from=findRideResponse.from
        var to=findRideResponse.to

        Log.d("eiie",""+seats)

        val intent = Intent(this, RiderDetailsActivity::class.java)
        intent.putExtra("id",id)
        intent.putExtra("from",from)
        intent.putExtra("to",to)
        intent.putExtra("selectedSeats",seats)
//        intent.putExtra("rating",Rating)
        startActivity(intent)


    }


}