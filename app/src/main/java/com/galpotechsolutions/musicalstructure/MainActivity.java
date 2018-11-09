package com.galpotechsolutions.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the View that shows the Spanish Category
        TextView spanish = findViewById(R.id.spanish);

        spanish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link SpanishActivity}
                Intent spanishIntent = new Intent(MainActivity.this, SpanishActivity.class);
                //Start the new activity
                startActivity(spanishIntent);
            }
        });

        //Find the View that shows the English Category
        TextView english = findViewById(R.id.english);

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link EnglishActivity}
                Intent englishIntent = new Intent(MainActivity.this, EnglishActivity.class);
                //Start the new activity
                startActivity(englishIntent);
            }
        });

        //Find the View that shows the Movie Category
        TextView movie = findViewById(R.id.movies);

        movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link EnglishActivity}
                Intent movieIntent = new Intent(MainActivity.this, MovieActivity.class);
                //Start the new activity
                startActivity(movieIntent);
            }
        });

    }
}
