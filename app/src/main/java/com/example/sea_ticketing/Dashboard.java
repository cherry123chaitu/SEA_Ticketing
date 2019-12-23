package com.example.sea_ticketing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppThemeDark);
        setTitle("Dashboard");
        setContentView(R.layout.activity_dashboard);
    }
}
