package com.example.ridehop_intership_project.Adapter


import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.cardview.widget.CardView
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.example.ridehop_intership_project.Fragment.RewardsFragment
import com.example.ridehop_intership_project.Model.RewardsSlider
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.R.*
import java.util.*
import kotlin.collections.ArrayList

class RewardsSliderViewPager(val frag: RewardsFragment,val context:Context, val imageList: ArrayList<RewardsSlider>) : PagerAdapter() {
    // on below line we are creating a method
    // as get count to return the size of the list.
      var fragment=frag
    override fun getCount(): Int {
        return imageList.size
    }

    // on below line we are returning the object
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as CardView
    }

    // on below line we are initializing
    // our item and inflating our layout file
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        // on below line we are initializing
        // our layout inflater.
        val mLayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        // on below line we are inflating our custom
        // layout file which we have created.
        val itemView: View = mLayoutInflater.inflate(layout.rewards_viewpager, container, false)

        // on below line we are initializing
        // our image view with the id.
//        val imageView: ImageView = itemView.findViewById<View>(id.idIVImage) as ImageView
        var ll:ImageView=itemView.findViewById<View>(id.llPicture) as ImageView

        // on below line we are setting
        // image resource for image view.

//        imageView.setImageResource(imageList.get(position))
        Glide.with(context)
            .load(imageList.get(position).image)
            .into(ll)

        var text: TextView =itemView.findViewById<View>(id.tvMessage) as TextView
        text.setText(imageList.get(position).message)
        var buttonText: AppCompatButton =itemView.findViewById<View>(id.bt_Continue) as AppCompatButton
        buttonText.setText(imageList.get(position).clickItemText)
        buttonText.setOnClickListener(View.OnClickListener {
            if(imageList.get(position).clickItemText.equals("Invite")) {
                fragment.invitefriend()

            }


            else if(imageList.get(position).clickItemText.equals("Redeem"))
            {
                Toast.makeText(fragment.requireContext(),"In Progress",Toast.LENGTH_SHORT).show()
            }
        })



        // on the below line we are adding this
        // item view to the container.
        Objects.requireNonNull(container).addView(itemView)

        // on below line we are simply
        // returning our item view.
        return itemView
    }

    // on below line we are creating a destroy item method.
    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        // on below line we are removing view
        container.removeView(`object` as CardView)
    }
}
