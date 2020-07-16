package com.jamilton.mismapas;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Maps3 extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_maps3);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map3);
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
        mMap3 = googleMap;

        // Add a marker in Sydney and move the camera

        LatLng piesDescalzos = new LatLng(6.2446045, -75.5768986);
        mMap3.addMarker(new MarkerOptions().position(piesDescalzos).title("Parque de los Pies descalzos"));
        // mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap3.moveCamera(CameraUpdateFactory.newLatLngZoom(piesDescalzos,15));
    }
}
