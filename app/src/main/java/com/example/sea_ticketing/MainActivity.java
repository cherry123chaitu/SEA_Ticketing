package com.example.sea_ticketing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private TextView contact;
int count=0;
private EditText id,password;
public  Button Login_Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id=findViewById(R.id.StudentId);
        contact = findViewById(R.id.AdminLink);
        Login_Button =findViewById(R.id.LOGIN_BUTTON);
        password=findViewById(R.id.password);

        Login_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(view);
            }
        });
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
    public void click(View v){
        String uid,pass;
        uid = id.getText().toString();
        pass= password.getText().toString();
        if(uid.equals("1")&& (pass.equals("12"))){
            Toast.makeText(getApplicationContext(),"Welcome 170030",Toast.LENGTH_SHORT).show();
        Intent i= new Intent(MainActivity.this,Dashboard.class);
        startActivity(i);
            SharedPreferences sp = getSharedPreferences("login",MODE_PRIVATE);
            sp.edit().putBoolean("logged",true).apply();

        }
        else{
            count=count+1;
            if(count==3){

            Intent emailIntent= new Intent();
            emailIntent.setAction(Intent.ACTION_SENDTO);
            emailIntent.setData(Uri.parse("mailto:"+"cherry123chaitu@gmail.com"));
            startActivity(emailIntent);
            Login_Button.setEnabled(false);
        }
        }
    }

}
