package com.example.ridehop_intership_project.Activity

import android.app.AlertDialog
import android.app.DirectAction
import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.databinding.ActivityRiderDetailsBinding


class RiderDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityRiderDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_rider_details)
        val intent = intent
        var image=intent.getStringExtra("Image")
        var name=intent.getStringExtra("name")
//        var rating=intent.getIntxtra("rating")
        var price=intent.getStringExtra("price")

        binding.imageview.setImageResource(R.drawable.user)
        binding.rating.numStars=2
        binding.tvName.setText("Carlos,Wards")
        binding.tvPrice.setText("$10")
        binding.tvPhoneNumber.setText("+1 (345)-032-0435")
        binding.tvAge.setText("23")
        binding.tvEmail.setText("qwerty@yopmail.com")
        binding.tvCarType.setText("Car Type: "+ "Toyota- Corolla")
        binding.tvVechicle.setText("Vechicle Number: "+ "")


        binding.btBook.setOnClickListener(View.OnClickListener {

            AlertDialog.Builder(this)
                .setTitle("Confirmation")
                .setMessage("Do you really want to book this Ride?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton("Confirm",
                    DialogInterface.OnClickListener { dialog, whichButton ->
                        Toast.makeText(
                            this,
                            "Your ride is booked.",
                            Toast.LENGTH_SHORT
                        ).show()
                        this.onBackPressed()
                        this.onBackPressed()
                    })
                .setNegativeButton("Opps No!!", DialogInterface.OnClickListener{
                    dialog, whichButton ->
                    dialog.dismiss()
                }).show()

        })




    }
}