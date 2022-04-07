package com.example.hellosensor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startCompass(View v) {
        Intent intent = new Intent(this, Compass.class);
        startActivity(intent);
    }

    public void startAccelerometer(View v) {
        Intent intent = new Intent(this, Accelerometer.class);
        startActivity(intent);
    }
}