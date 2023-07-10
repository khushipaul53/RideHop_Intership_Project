package com.example.ridehop_intership_project.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
       var binding:  ActivityLoginBinding?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this, R.layout.activity_login)


        binding!!.btLogin!!.setOnClickListener(View.OnClickListener {
            startActivity(Intent(applicationContext, DashboardActivity::class.java))

        })

        binding!!.TvSignup!!.setOnClickListener(View.OnClickListener {
            startActivity(Intent(applicationContext, SignupActivity::class.java))

        })


    }
}