package com.example.ridehop_intership_project.Fragment

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.ridehop_intership_project.Activity.CreateOwnRideActivity
import com.example.ridehop_intership_project.Activity.DashboardActivity
import com.example.ridehop_intership_project.Activity.SearchRidesActivity
import com.example.ridehop_intership_project.Adapter.SliderViewPagerAdapter
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.databinding.FragmentDashboardBinding
import java.util.Calendar
import java.util.Timer
import java.util.TimerTask


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DashboardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DashboardFragment : Fragment() {
    lateinit var viewPager: ViewPager
    lateinit var viewPagerAdapter: SliderViewPagerAdapter
     lateinit var imageList: ArrayList<Int>
    lateinit var binding:FragmentDashboardBinding
    var currentPage=0
    lateinit var timer: Timer
    val DELAY_MS: Long = 500 //delay in milliseconds before task is to be executed
    private val sliderHandler: Handler = Handler()

    val PERIOD_MS: Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, view: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_dashboard,view,false)


        binding.sideMenu.setOnClickListener(View.OnClickListener {
            (activity as DashboardActivity).openSideMenu()
        })
         var seatsList=ArrayList<String>()
        seatsList.add("1")
        seatsList.add("2")
        seatsList.add("3")
        seatsList.add("4")


        var adapter= ArrayAdapter(activity as DashboardActivity, android.R.layout.simple_spinner_item, seatsList)

        // set simple layout resource file
        // for each item of spinner

        // set simple layout resource file
        // for each item of spinner
        adapter.setDropDownViewResource(
            android.R.layout.simple_spinner_dropdown_item
        )

        // Set the ArrayAdapter (ad) data on the
        // Spinner which binds data to spinner

        // Set the ArrayAdapter (ad) data on the
        // Spinner which binds data to spinner
        binding.spType.setAdapter(adapter)
        imageList=ArrayList()
        imageList!!.add(R.drawable.img1)
        imageList!!.add(R.drawable.img2)
        imageList!!.add(R.drawable.img3)
        imageList!!.add(R.drawable.img4)
//
        viewPagerAdapter = SliderViewPagerAdapter(activity as DashboardActivity, imageList)
        binding.viewPagerMain.adapter = viewPagerAdapter
        val timer = Timer()

        binding!!.btLogin.setOnClickListener(View.OnClickListener {
            var b=Bundle()
//            b.putString("from",)
//            b.putString("to",)
//            b.putString("seats")

            startActivity(Intent(activity as DashboardActivity, SearchRidesActivity::class.java))

        })

        binding!!.fab.setOnClickListener(View.OnClickListener {
            startActivity(Intent(activity as DashboardActivity, CreateOwnRideActivity::class.java))

        })

        binding!!.etDatetime.setOnClickListener(View.OnClickListener {
            val currentDate = Calendar.getInstance()
            val  date = Calendar.getInstance()
            DatePickerDialog(
                activity as DashboardActivity,
                { view, year, monthOfYear, dayOfMonth ->
                    date.set(year, monthOfYear, dayOfMonth)
                    TimePickerDialog(
                        context,
                        { view, hourOfDay, minute ->
                            date.set(Calendar.HOUR_OF_DAY, hourOfDay)
                            date.set(Calendar.MINUTE, minute)
                            Log.v(TAG, "The choosen one " + date.getTime())
                            binding!!.etDatetime.setText(date.getTime().toString())
                        },
                        currentDate[Calendar.HOUR_OF_DAY],
                        currentDate[Calendar.MINUTE], false
                    ).show()
                }, currentDate[Calendar.YEAR], currentDate[Calendar.MONTH],
                currentDate[Calendar.DATE]
            ).show()
        })


        return binding.root

    }
    

}


