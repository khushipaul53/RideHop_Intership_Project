package com.example.ridehop_intership_project.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.ridehop_intership_project.Fragment.DashboardFragment
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.databinding.ActivityDashboardBinding
import com.google.android.material.navigation.NavigationView

class DashboardActivity : AppCompatActivity() {
        var binding:ActivityDashboardBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_dashboard)
        val navView: NavigationView = binding!!.navView
        val navController = findNavController(R.id.nav_host_fragment_content_navigation)
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.nav_home, DashboardFragment()).commit()
        navView.setupWithNavController(navController)







    }

    public fun openSideMenu() {
        binding!!.drawerLayout.openDrawer(GravityCompat.START)

    }
}