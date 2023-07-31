package com.example.ridehop_intership_project.Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.ridehop_intership_project.Activity.DashboardActivity
import com.example.ridehop_intership_project.Adapter.RewardsSliderViewPager
import com.example.ridehop_intership_project.BuildConfig
import com.example.ridehop_intership_project.Model.RewardsSlider
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.databinding.FragmentRewardsBinding


/**
 * A simple [Fragment] subclass.
 * Use the [RewardsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RewardsFragment : Fragment() {
    lateinit var binding:FragmentRewardsBinding
    lateinit var viewPagerAdapter: RewardsSliderViewPager
    lateinit var imageList: ArrayList<RewardsSlider>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_rewards,container,false)

        imageList=ArrayList()
        imageList!!.add(RewardsSlider(R.drawable.congo,"Please invite your friend to get more points!!","Invite"))
        imageList!!.add(RewardsSlider(R.drawable.congo,"Redeem your points here by booking ride for 2 kms","Redeem"))

//
        viewPagerAdapter = RewardsSliderViewPager(this,activity as DashboardActivity, imageList)
        binding.SliderViewPager.adapter = viewPagerAdapter
        return binding!!.root
    }

    fun invitefriend() {
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.type = "text/plain"
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "RideHop")
        var shareMessage = "\nLet me recommend you this application\n\n"
        shareMessage =
            """
            ${shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID}
            
            
            """.trimIndent()
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage)
        startActivity(Intent.createChooser(shareIntent, "choose one"))
    }


}