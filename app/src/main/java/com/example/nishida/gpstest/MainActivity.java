package com.example.nishida.gpstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        locationPermission();
    }

    // Intent で LocationPermission
    private void locationPermission() {
        Intent intent = new Intent(getApplication(), LocationPermission.class);
        startActivity(intent);
    }
}
