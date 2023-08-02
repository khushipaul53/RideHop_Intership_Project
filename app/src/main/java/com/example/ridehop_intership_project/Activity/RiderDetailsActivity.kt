package com.example.ridehop_intership_project.Activity

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.Response.BookeRideResponse
import com.example.ridehop_intership_project.Retrofit.APIClient
import com.example.ridehop_intership_project.Retrofit.ApiInterface
import com.example.ridehop_intership_project.databinding.ActivityRiderDetailsBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class RiderDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityRiderDetailsBinding
    lateinit var apiInterface: ApiInterface
    lateinit var sh: SharedPreferences
    var token=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_rider_details)
        val intent = getIntent()
//        var data=intent.getSerializableExtra("response") as FindRideResponse
         var id=intent.extras!!.getString("id")
        var from=intent.extras!!.getString("from")
        var to=intent.extras!!.getString("to")


        apiInterface= APIClient.client!!.create(ApiInterface::class.java).also {
            apiInterface = it
        }

        sh = this.getSharedPreferences("MySharedPref", MODE_PRIVATE)
        token = sh.getString("tokken", "")!!
        binding.imageview.setImageResource(R.drawable.user)
        binding.rating.numStars=2
        binding.tvName.setText("Alex")
        binding.tvPrice.setText("$10")
        binding.tvPhoneNumber.setText("+1 (345)-032-0435")
        binding.tvAge.setText("23")
        binding.tvEmail.setText("qwerty@yopmail.com")
        binding.tvCarType.setText("Car Type: "+ "Toyota- Corolla")
        binding.tvVechicle.setText("Vechicle Number: "+ "")

  binding!!.icBack.setOnClickListener(View.OnClickListener {
      onBackPressed()

  })

        binding.btBook.setOnClickListener(View.OnClickListener {
//            Log.d("vbc",""+ )
            AlertDialog.Builder(this)
                .setTitle("Confirmation")
                .setMessage("Do you really want to book this Ride?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton("Confirm",
                    DialogInterface.OnClickListener { dialog, whichButton ->
//                        Toast.makeText(
//                            this,
//                            "Your ride is booked.",
//                            Toast.LENGTH_SHORT
//                        ).show()
//                        this.onBackPressed()
//                        this.onBackPressed()
                        bookRideApi(id,from,to)
                    })
                .setNegativeButton("Opps No!!", DialogInterface.OnClickListener{
                    dialog, whichButton ->
                    dialog.dismiss()
                }).show()

        })


        binding!!.btEmail.setOnClickListener(View.OnClickListener {
            var  emailintent = Intent(Intent.ACTION_SEND);
            emailintent.setType("text/plain")
            startActivity(emailintent)

        })

        binding!!.btcalling.setOnClickListener(View.OnClickListener {
            var intent =  Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:0987654321"));

            startActivity(intent);
        })


    }



    private fun bookRideApi(ID: String?,From:String?,To:String?) {
        val data: MutableMap<String?, String?> = HashMap()
        data["id"] = ID
        data["from"] = From
        data["to"]=To
        data["seats"]=getIntent().extras!!.getInt("selectedSeats").toString()
        val call: Call<BookeRideResponse?>? = apiInterface.bookaRide(token="${token}",data)
        call!!.enqueue(object : Callback<BookeRideResponse?> {
            override fun onResponse(
                call: Call<BookeRideResponse?>?,
                response: Response<BookeRideResponse?>) {

                if(response.isSuccessful)
                {




                    Toast.makeText(this@RiderDetailsActivity,response.body()!!.message,Toast.LENGTH_SHORT).show()
                     onBackPressed()
//                    var login = Intent(this@LoginActivity,DashboardActivity::class.java)
//
//                    login.putExtra("token",response.body()!!.token)
//                    login.putExtra("login",true)
//                    startActivity(login)
                }



            }

            override fun onFailure(call: Call<BookeRideResponse?>, t: Throwable) {
                Toast.makeText(this@RiderDetailsActivity,t.message,Toast.LENGTH_SHORT).show()

            } //
            //
        })
    }
}