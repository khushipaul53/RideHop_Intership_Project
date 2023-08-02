package com.example.ridehop_intership_project.Activity


import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.ridehop_intership_project.Fragment.ProfileFragment
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.Response.SignupResponse
import com.example.ridehop_intership_project.databinding.ActivityDashboardBinding
import com.google.android.material.navigation.NavigationView
import java.io.Serializable


class DashboardActivity : AppCompatActivity() {
        var binding:ActivityDashboardBinding?=null
    lateinit var sharedPreferences :SharedPreferences

    lateinit var myEdit : SharedPreferences.Editor
    lateinit var data:Serializable
var token=""
    var name=""
    var email=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this, com.example.ridehop_intership_project.R.layout.activity_dashboard)


        // Attach the Fragment to the Activity

        // Attach the Fragment to the Activity


        // Save the Fragment tag in the Bundle (if needed for future reference)

        // Save the Fragment tag in the Bundle (if needed for future reference)

//        FirebaseApp.initializeApp(this)
//        var value = getIntent().getExtras()!!.getString("token")
        sharedPreferences=  this.getSharedPreferences("MySharedPref", MODE_PRIVATE)
        myEdit = sharedPreferences.edit()
if(getIntent().getExtras()!!.getBoolean("login"))
{

    token=getIntent().getExtras()!!.getString("token")!!
        Log.d("dkvmfmd", "" + token)
    myEdit.putString("tokken", token);
    myEdit.commit();
}

        if(intent!=null)
        {
        var data= intent.getSerializableExtra("data")
        Log.d("bvb",""+data)
        }


//        FirebaseMessaging.getInstance().token.addOnCompleteListener {
//            if (it.isComplete) {
//                try {
//                   var firebaseToken = it.result.toString()
//                    println("tag firebase tokn" + firebaseToken)
//                } catch (e: Exception) {
//                    e.printStackTrace()
//                }}}

        val navView: NavigationView = binding!!.navigationView
        val navController = findNavController(com.example.ridehop_intership_project.R.id.nav_host_fragment_content_navigation)
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.nav_home, DashboardFragment()).commit()
        navView.inflateHeaderView(R.layout.nav_header)
        var headerView: View =navView.getHeaderView(0)


        var headerName: TextView =headerView.findViewById<TextView>(R.id.tvheadername)
        var headerEmail:TextView=headerView.findViewById<TextView>(R.id.tvheaderemail)


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
//                    navController.navigate(R.id.fragment_setting)
                }
                R.id.rewards -> {
                    navController.navigate(R.id.fragment_rewards)
                }
                R.id.myRides -> {
                    startActivity(Intent(applicationContext, MyRidesActivity::class.java))
//                    navController.navigate(R.id.fragment_myRides)
                }

                R.id.logout -> {
                    AlertDialog.Builder(this)
                        .setTitle("Confirmation")
                        .setMessage("Do you really want Logout?")
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setPositiveButton("Confirm",
                            DialogInterface.OnClickListener { dialog, whichButton ->
                                myEdit = sharedPreferences.edit()
                                myEdit.putString("tokken","");
                                myEdit.commit();
                                startActivity(Intent(applicationContext, SplashActivity::class.java))


                            })
                        .setNegativeButton("Opps No!!", DialogInterface.OnClickListener{
                                dialog, whichButton ->
                            dialog.dismiss()
                        }).show()
//                    navController.navigate(R.id.fragment_myRides)
                }

                // Add more cases as needed
            }

            // Close the drawer after handling the click
            binding!!.drawerlayout.closeDrawers()

            true
        }






    }

    private fun editProfile() {
        AlertDialog.Builder(this)
            .setTitle("Please!!")
            .setMessage("Do fill your profile to offer a Ride")
            .setIcon(android.R.drawable.ic_dialog_alert)
            .setPositiveButton("Okay",
                DialogInterface.OnClickListener { dialog, whichButton ->
                    val navController = findNavController(com.example.ridehop_intership_project.R.id.nav_host_fragment_content_navigation)

                    navController.navigate(R.id.profile)
                })
            .setNegativeButton("May be After!!", DialogInterface.OnClickListener{
                    dialog, whichButton ->
                dialog.dismiss()
            }).show()

    }

    public fun openSideMenu() {
        binding!!.drawerlayout.openDrawer(GravityCompat.START)

    }
}