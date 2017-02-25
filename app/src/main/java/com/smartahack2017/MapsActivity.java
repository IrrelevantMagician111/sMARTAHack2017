package com.smartahack2017;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng current_pos = new LatLng(33.7753097,-84.3909888);
        LatLng North_Springs = new LatLng(33.9450535,-84.3594478);

        mMap.addMarker(new MarkerOptions().position(current_pos).title("your Position"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(33.9450535,-84.3594478)).title("North Springs"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(33.931838,-84.3528964)).title("Sandy Springs"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(33.9212412,-84.3465625)).title("Dunwoody"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(34.038688,-84.3153245)).title("Mansell Road"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(34.0863471,-84.263156)).title("Windward Park"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(33.9011509,-84.2844297)).title("Doraville"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(33.8878166,-84.307585)).title("Chamblee"));
        /*mMap.addMarker(new MarkerOptions().position(new LatLng(33.931838,-84.3528964)).title("Sandy Springs"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(33.931838,-84.3528964)).title("Sandy Springs"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(33.931838,-84.3528964)).title("Sandy Springs"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(33.931838,-84.3528964)).title("Sandy Springs"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(33.931838,-84.3528964)).title("Sandy Springs"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(33.931838,-84.3528964)).title("Sandy Springs"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(33.931838,-84.3528964)).title("Sandy Springs"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(33.931838,-84.3528964)).title("Sandy Springs"));*/

        float zoomLevel =10.0f;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(current_pos, zoomLevel));
    }

}
