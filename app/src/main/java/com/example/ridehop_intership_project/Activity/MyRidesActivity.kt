package com.example.ridehop_intership_project.Activity

import android.R
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.ridehop_intership_project.Adapter.MyRidesViewPagerAdapter
import com.example.ridehop_intership_project.databinding.ActivityMyRidesBinding


class MyRidesActivity : AppCompatActivity() {
    lateinit var binding: ActivityMyRidesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,com.example.ridehop_intership_project.R.layout.activity_my_rides)

        val adapter: FragmentPagerAdapter = MyRidesViewPagerAdapter(supportFragmentManager)
        binding.viewPager.adapter = adapter
        binding.tabs.setupWithViewPager(binding!!.viewPager);

        binding!!.icBack.setOnClickListener(View.OnClickListener { // Call finish() to close the current activity and go back to the previous screen
            this.supportFragmentManager?.popBackStack()
        })
    }
}