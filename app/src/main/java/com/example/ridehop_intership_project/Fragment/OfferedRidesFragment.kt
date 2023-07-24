package com.example.ridehop_intership_project.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ridehop_intership_project.Activity.MyRidesActivity
import com.example.ridehop_intership_project.Adapter.BookedRidesAdapter
import com.example.ridehop_intership_project.Adapter.OfferedRidesAdapter
import com.example.ridehop_intership_project.Model.BookedRides
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.databinding.FragmentOfferedRidesBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [OfferedRidesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class OfferedRidesFragment : Fragment() {
lateinit var binding:FragmentOfferedRidesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_offered_rides,container,false)

        binding!!.rvOfferedItems.layoutManager = LinearLayoutManager(activity as MyRidesActivity)
        val data = ArrayList<BookedRides>()
        data.add(BookedRides("2547134","Sachin","Windsor","Toronto","01 Sept","07:00 AM","327 Campbell Avenue,Windsor"))

        data.add(BookedRides("3467234","Keshav","Toronto","Windsor","24 Aug","04:00 PM","327 Campbell Avenue,Windsor"))

        data.add(BookedRides("5654347","Joseph","London","Toronto","10 Sept","01:00 PM","327 Campbell Avenue,Windsor"))

        data.add(BookedRides("2547134","Kriti","Windsor","Brampton","22 Aug","06:00 PM","327 Campbell Avenue,Windsor"))

        data.add(BookedRides("2547134","Aakriti","Windsor","Waterloo/Kitchener","12 Sept","08:00 PM","327 Campbell Avenue,Windsor"))

        val adapter = OfferedRidesAdapter(data,this)
        binding!!.rvOfferedItems.adapter = adapter

        return binding!!.root
    }

}