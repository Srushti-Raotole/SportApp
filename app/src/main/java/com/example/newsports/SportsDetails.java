package com.example.newsports;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SportsDetails extends AppCompatActivity {
ImageView image_event;
    TextView text_location,text_date,text_sport_name;
    TextView text_organizers,text_winners,text_description;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_details);
        image_event=findViewById(R.id.image_event);
        text_sport_name=findViewById(R.id.text_sport_name);
        text_location=findViewById(R.id.text_location);
        text_date=findViewById(R.id.text_date);

        text_sport_name.setText(getIntent().getExtras().getString("Name"));
        text_date.setText(getIntent().getExtras().getString("Date"));
        text_location.setText(getIntent().getExtras().getString("Location"));

        int my_image_event=getIntent().getIntExtra("Img",0);
        image_event.setImageResource(my_image_event);
    }
}