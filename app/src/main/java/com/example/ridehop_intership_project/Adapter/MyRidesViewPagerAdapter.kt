package com.example.ridehop_intership_project.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.ridehop_intership_project.Fragment.BookedRidesFragment
import com.example.ridehop_intership_project.Fragment.OfferedRidesFragment


class MyRidesViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> BookedRidesFragment()
            1 -> OfferedRidesFragment()
            else-> BookedRidesFragment()
        }
    }

    override fun getCount(): Int {
        return NUM_PAGES
    }

    companion object {
        private const val NUM_PAGES = 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title: String? = null
        if (position == 0) {
            title = "Booked"
        } else if (position == 1) {
            title = "Offered"
        }
        return title
    }
}