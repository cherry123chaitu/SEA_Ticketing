package com.example.sea_ticketing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView contact;
EditText id,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id=findViewById(R.id.StudentId);
        contact = findViewById(R.id.AdminLink);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number= "9398161852";
                Intent i= new Intent();
                i.setAction(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:+"+number));
                startActivity(i);
            }
        });
    }

}
