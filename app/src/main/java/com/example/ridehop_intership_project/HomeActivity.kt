package com.example.ridehop_intership_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ridehop_intership_project.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    var binding:ActivityHomeBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

    }
}