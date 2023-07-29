package com.example.ridehop_intership_project.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.databinding.FragmentPromocodeBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [PromocodeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PromocodeFragment : Fragment() {

  lateinit var binding:FragmentPromocodeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_promocode,container,false)
//        val navController = findNavController(R.id.nav_host_fragment_content_navigation)

        binding.btLogin.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.fragment_rewards)


        })

        binding!!.text.setText("Congratulations!! You Have Completed your 1 ride.Keep Stay Motivated to recieve more Points.")
        return binding!!.root
    }


}