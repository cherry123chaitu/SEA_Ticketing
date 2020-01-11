package com.example.sea_ticketing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        setTheme(R.style.AppThemeDark);
        setTitle("History");
    }
}
