package com.example.ridehop_intership_project.Activity

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.ridehop_intership_project.R
import java.util.Timer
import java.util.TimerTask


class SplashActivity : AppCompatActivity() {

    lateinit var sh: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        sh = this.getSharedPreferences("MySharedPref", MODE_PRIVATE)
        val token = sh.getString("tokken", "")
        Log.d("sds", "" + token)


        Timer().schedule(object : TimerTask() {
            override fun run() {
                if (token.equals("")) {
                    startActivity(Intent(applicationContext, LoginActivity::class.java))

                }
                else{
                    var login=Intent(this@SplashActivity,DashboardActivity::class.java)
                    login.putExtra("login",false)
                    startActivity(login)

                }
            }
        }, 3000)




    }
    }



