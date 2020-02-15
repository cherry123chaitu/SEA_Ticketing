package com.example.sea_ticketing.new_ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.sea_ticketing.R;

public class ticket_filing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppThemeDark);
        setTitle("New Ticket");
        setContentView(R.layout.activity_ticket_filing);
    }
}
