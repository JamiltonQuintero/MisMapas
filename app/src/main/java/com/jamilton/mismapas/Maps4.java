package com.jamilton.mismapas;


import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Maps4 extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_maps4);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map4);
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
        mMap4 = googleMap;

        // Add a marker in Sydney and move the camera

        LatLng olayaHerrera = new LatLng(6.2199741, -75.5888482);
        mMap4.addMarker(new MarkerOptions().position(olayaHerrera).title("Aeropuerto olaya Herrera"));
        // mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap4.moveCamera(CameraUpdateFactory.newLatLngZoom(olayaHerrera,15));
    }
}