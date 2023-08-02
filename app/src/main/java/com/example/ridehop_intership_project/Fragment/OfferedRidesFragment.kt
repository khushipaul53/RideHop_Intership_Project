package com.example.ridehop_intership_project.Fragment

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ridehop_intership_project.Activity.MyRidesActivity
import com.example.ridehop_intership_project.Adapter.OfferedRidesAdapter
import com.example.ridehop_intership_project.Model.BookedUser
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.Response.OfferedRideResponse
import com.example.ridehop_intership_project.Retrofit.APIClient
import com.example.ridehop_intership_project.Retrofit.ApiInterface
import com.example.ridehop_intership_project.Utils.CustomDialog
import com.example.ridehop_intership_project.databinding.FragmentOfferedRidesBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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
    lateinit var sh: SharedPreferences
    var token=""
    lateinit var apiInterface: ApiInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_offered_rides,container,false)

        apiInterface= APIClient.client!!.create(ApiInterface::class.java).also {
            apiInterface = it
        }
        sh = requireActivity().getSharedPreferences("MySharedPref", AppCompatActivity.MODE_PRIVATE)
        token = sh.getString("tokken", "")!!

        OfferedRide()

        binding!!.rvOfferedItems.layoutManager = LinearLayoutManager(activity as MyRidesActivity)


        return binding!!.root
    }

    private fun OfferedRide() {
        val call: Call<List<OfferedRideResponse?>>? = apiInterface.offeredRide(token = "${token}")
        call!!.enqueue(object : Callback<List<OfferedRideResponse?>> {
            override fun onResponse(
                call: Call<List<OfferedRideResponse?>>?,
                response: Response<List<OfferedRideResponse?>>
            ) {

                if(response.isSuccessful)
                {
                    var dataList= response.body()!!
                    Log.d("lcmci",""+dataList)
                    var data = dataList as ArrayList<OfferedRideResponse>

                    val adapter = OfferedRidesAdapter(data,this@OfferedRidesFragment)
                    binding!!.rvOfferedItems.adapter = adapter



                }



            }

            override fun onFailure(call: Call<List<OfferedRideResponse?>>, t: Throwable) {
                Toast.makeText(activity as MyRidesActivity,t.message, Toast.LENGTH_SHORT).show()

            } //
            //
        })

    }

    fun openRideDetails(bookingUsers: ArrayList<BookedUser>) {
        val customDialog = CustomDialog(requireContext()!!)

        customDialog.setDialogTitle("Details",bookingUsers.size,bookingUsers)
        customDialog.show()

    }

}