package com.example.ridehop_intership_project.Fragment

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ridehop_intership_project.Activity.MyRidesActivity
import com.example.ridehop_intership_project.Adapter.BookedRidesAdapter
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.Response.BookedRides
import com.example.ridehop_intership_project.Retrofit.APIClient
import com.example.ridehop_intership_project.Retrofit.ApiInterface
import com.example.ridehop_intership_project.databinding.FragmentBookedRidesBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_booked_rides,container,false)

        apiInterface= APIClient.client!!.create(ApiInterface::class.java).also {
            apiInterface = it
        }
        sh = requireActivity().getSharedPreferences("MySharedPref", AppCompatActivity.MODE_PRIVATE)
        token = sh.getString("tokken", "")!!

//        bookedListApi()
        binding!!.rvBookedItems.layoutManager = LinearLayoutManager(activity as MyRidesActivity)
        val data = ArrayList<BookedRides>()
        data.add(BookedRides("2134","Alex","Windsor","Toronto","27 Sept,23","01:02PM","327 Campbell Avenue,Windsor"))

        val adapter = BookedRidesAdapter(data,this)

        // Setting the Adapter with the recyclerview
        binding!!.rvBookedItems.adapter = adapter


        return binding!!.root
    }

//    private fun bookedListApi() {
//        val call: Call<BookedRides>? = apiInterface.bookedRides(token = "${token}")
//        call!!.enqueue(object : Callback<BookedRides?> {
//            override fun onResponse(
//                call: Call<BookedRides?>?,
//                response: Response<BookedRides?>) {
//
//                if(response.isSuccessful)
//                {
//
//                        var dataList= response.body()!!.list
//                        Log.d("lcmci",""+dataList)
//                        var data = dataList
//
//                        val adapter = BookedRidesAdapter(data,this@BookedRidesFragment)
//                        binding!!.rvBookedItems.adapter = adapter
//
//
//
//
//
//
//
////                    Toast.makeText(this@BookedRidesFragment,"Login Successfull",Toast.LENGTH_SHORT).show()
//
////                    var login = Intent(this@LoginActivity, DashboardActivity::class.java)
////                    login.putExtra("name",response.body()!!.user.fullName)
////                    login.putExtra("name",response.body()!!.user.email)
////
////                    login.putExtra("token",response.body()!!.token)
////                    login.putExtra("login",true)
////                    startActivity(login)
//                }
//
//
//
//            }
//
//            override fun onFailure(call: Call<BookedRides?>, t: Throwable) {
////                Toast.makeText(this@BookedRidesFragment,t.message, Toast.LENGTH_SHORT).show()
//
//            } //
//            //
//        })
//
//    }


}