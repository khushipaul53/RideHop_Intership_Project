package com.example.ridehop_intership_project.Activity

import android.content.Intent
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

        val navView: NavigationView = binding!!.navigationView
        val navController = findNavController(R.id.nav_host_fragment_content_navigation)
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.nav_home, DashboardFragment()).commit()
//        navView.inflateHeaderView(R.layout.nav_header)
//        navView.inflateMenu(R.menu.nav_menu)

//        navView.setupWithNavController(navController)
        navView.setNavigationItemSelectedListener { menuItem ->
            // Handle clicks for each menu item here
            when (menuItem.itemId) {
                R.id.home -> {

                }
                R.id.profile -> {
                    navController.navigate(R.id.fragment_profile)

                }
                R.id.promocode -> {
                    navController.navigate(R.id.fragment_promocode)
                }

                R.id.setting -> {
                    navController.navigate(R.id.fragment_setting)
                }
                R.id.rewards -> {
                    navController.navigate(R.id.fragment_rewards)
                }
                R.id.myRides -> {
                    startActivity(Intent(applicationContext, MyRidesActivity::class.java))
//                    navController.navigate(R.id.fragment_myRides)
                }

                R.id.logout -> {

//                    navController.navigate(R.id.fragment_myRides)
                }

                // Add more cases as needed
            }

            // Close the drawer after handling the click
            binding!!.drawerlayout.closeDrawers()

            true
        }






    }

    public fun openSideMenu() {
        binding!!.drawerlayout.openDrawer(GravityCompat.START)

    }
}