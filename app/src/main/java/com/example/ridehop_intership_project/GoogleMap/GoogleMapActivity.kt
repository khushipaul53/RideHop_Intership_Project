package com.example.ridehop_intership_project.GoogleMap

import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class GoogleMapActivity : FragmentActivity(), OnMapReadyCallback {
    var delhi = LatLng(28.644800, 77.216721)

    // creating a variable for button.
     lateinit var hybridMapBtn: Button  // creating a variable for button.
    lateinit   var terrainMapBtn: Button // creating a variable for button.
    lateinit var satelliteMapBtn: Button

    private val mMap: GoogleMap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.ridehop_intership_project.R.layout.activity_google_map)

        val mapFragment = supportFragmentManager.findFragmentById(com.example.ridehop_intership_project.R.id.map) as SupportMapFragment?
        mapFragment!!.getMapAsync(this)
        mMap!!.setMapType(GoogleMap.MAP_TYPE_HYBRID);

    }

    override fun onMapReady(p0: GoogleMap?) {
        mMap!!.addMarker(MarkerOptions().position(delhi).title("Marker in Delhi"))

        // below line is use to move camera.

        // below line is use to move camera.
        mMap!!.moveCamera(CameraUpdateFactory.newLatLng(delhi))
    }
}