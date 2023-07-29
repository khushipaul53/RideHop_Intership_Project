package com.example.ridehop_intership_project.Fragment

import android.app.Activity.RESULT_OK
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.databinding.FragmentProfileBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProfileFragment : Fragment() {
    lateinit var binding:FragmentProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, view: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_profile,view,false)
        binding!!.icBack.setOnClickListener(View.OnClickListener { // Call finish() to close the current activity and go back to the previous screen
            activity?.supportFragmentManager?.popBackStack()
        })

        binding!!.tvHeading.setText("Profile")
        // Inflate the layout for this fragment
      binding!!.ivEditPic.setOnClickListener(View.OnClickListener {
          pickPhoto()

      })
        return binding!!.root
    }

    private fun pickPhoto() {

        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
        // starting activity on below line.
        startActivityForResult(intent, 1)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode === RESULT_OK) {
            // compare the resultCode with the
            // constant
            if (requestCode === 1) {
                // Get the url of the image from data
                val selectedImageUri: Uri = data?.data!!
                if (null != selectedImageUri) {
                    // update the image view in the layout
//                    binding!!.ivProfilePic.setImageURI(selectedImageUri)
                    Glide.with(this)
                        .load(selectedImageUri)
                        .into( binding!!.ivProfilePic)
                }
            }
        }
    }


}