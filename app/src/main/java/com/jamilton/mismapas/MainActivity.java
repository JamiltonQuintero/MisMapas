package com.jamilton.mismapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton mapa3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void irMapra (View view){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void irMapa2 (View view){
        Intent intent2 = new Intent(this, Map2.class);
        startActivity(intent2);
    }

    public void irMapa3(View view){
        Intent intent3 = new Intent(this, Maps3.class);
        startActivity(intent3);
    }
    public void irMapa4(View view){
        Intent intent4 = new Intent(this, Maps4.class);
        startActivity(intent4);
    }

}