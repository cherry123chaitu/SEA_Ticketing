package com.example.sea_ticketing.forum;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sea_ticketing.R;

public class Forum extends AppCompatActivity {


    ListView listView;
    String mTitle[]={"Projector Issue","fan issue","white board","benches"};
    String roomnums[]={"C401","C402","C403","C404"};
    String upvotes[]={"200","50","500","20"};
    String downvotes[]={"0","10","30","50"};
    int probimages[]={R.drawable.ic_projector,R.drawable.ic_fan,R.drawable.ic_whiteboard,R.drawable.ic_benches};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);
        setTheme(R.style.AppThemeDark);
        setTitle("Forum");
        myAdapter adapter= new myAdapter(this,mTitle,roomnums,upvotes,downvotes,probimages);
        listView.setAdapter(adapter);
    }

    class myAdapter extends ArrayAdapter<String> {
        Context context;
        String fprob[];
        String froom[];
        String fup[];
        String fdown[];
        int imageproblems[];

        myAdapter(Context c,String title[],String rnum[],String upvote[],String downvote[],int imageprobs[]){
            super(c,R.layout.row,R.id.textView,title);
            this.context=c;
            this.fprob=title;
            this.froom=rnum;
            this.fdown=downvote;
            this.fup=upvote;
            this.imageproblems=imageprobs;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row=layoutInflater.inflate(R.layout.row,parent,false);
            ImageView probimage= row.findViewById(R.id.imageView);
            ImageView upvoteimage = row.findViewById(R.id.imageView3);
            ImageView downvoteimage = row.findViewById(R.id.imageView4);
            TextView titletext= row.findViewById(R.id.textView);
            TextView roomnumber = row.findViewById(R.id.textView3);
            TextView textup = row.findViewById(R.id.textView4);
            TextView textdown = row.findViewById(R.id.textView5);

            upvoteimage.setImageResource(R.drawable.ic_upvote);
            downvoteimage.setImageResource(R.drawable.ic_down);
            probimage.setImageResource(imageproblems[position]);
            titletext.setText(fprob[position]);
            roomnumber.setText(froom[position]);
            textdown.setText(fdown[position]);
            textup.setText(fup[position]);
            return row;
        }
}

}
