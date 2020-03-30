package com.example.sea_ticketing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.view.Menu;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sea_ticketing.forum.Forum;
import com.example.sea_ticketing.new_ticket.ticket_filing;

public class Dashboard extends AppCompatActivity {
    TextView profiletext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppThemeDark);
        setTitle("Dashboard");
        profiletext=findViewById(R.id.profile_text);
        setContentView(R.layout.activity_dashboard);
        }

        public void Click(View view){
        Intent i =new Intent(Dashboard.this,Profile.class);
        startActivity(i);
        }
        public void History(View view){
            Intent i =new Intent(Dashboard.this,History.class);
            startActivity(i);
        }
        public void newticket(View view){
        Intent i =new Intent(Dashboard.this, ticket_filing.class);
        startActivity(i);
    }
    public void Forumpage(View view){
       Intent intent=new Intent(Dashboard.this, Forum.class);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.notification, menu);
        return true;
    }
    }


