package com.example.ridehop_intership_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ridehop_intership_project.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    var binding:ActivitySignupBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    }
}