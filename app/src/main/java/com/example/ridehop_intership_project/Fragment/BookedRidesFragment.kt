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
import com.example.ridehop_intership_project.Adapter.RidesAvailableAdapter
import com.example.ridehop_intership_project.Model.BookedRides
import com.example.ridehop_intership_project.Model.RideAvailable
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.databinding.FragmentBookedRidesBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BookedRidesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BookedRidesFragment : Fragment() {
    lateinit var binding:FragmentBookedRidesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_booked_rides,container,false)

        binding!!.rvBookedItems.layoutManager = LinearLayoutManager(activity as MyRidesActivity)
        val data = ArrayList<BookedRides>()
        data.add(BookedRides("2547134","Sachin","Windsor","Toronto","27 Sept,23","01:02PM","327 Campbell Avenue,Windsor"))

        val adapter = BookedRidesAdapter(data,this)
//
//        // Setting the Adapter with the recyclerview
        binding!!.rvBookedItems.adapter = adapter


        return binding!!.root
    }


}