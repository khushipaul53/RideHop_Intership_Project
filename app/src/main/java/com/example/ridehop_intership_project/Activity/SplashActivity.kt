package com.example.ridehop_intership_project.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ridehop_intership_project.R
import java.util.*

class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        Timer().schedule(object : TimerTask() {
            override fun run() {
                startActivity(Intent(applicationContext, LoginActivity::class.java))
            }
        }, 3000)
    }

    }

