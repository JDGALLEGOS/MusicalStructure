package com.galpotechsolutions.musicalstructure;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.singer_list);

        final String artist = getIntent().getStringExtra("Singer");
        final String album = getIntent().getStringExtra("Album");
        final String song = getIntent().getStringExtra("Song");

        //create a array of words
        ArrayList<Detail> details = new ArrayList<>();
        if (artist.equals("Ha Ash")){
            details.add(new Detail(album,R.drawable.ha_ash, song, artist));
        }else if (artist.equals("Matisse")) {
            details.add(new Detail(album,R.drawable.matisse, song, artist));
        }else if (artist.equals("Carlos Rivera")) {
            details.add(new Detail(album,R.drawable.carlos_rivera, song, artist));
        }else if (artist.equals("Carlos Rivera")) {
            details.add(new Detail(album,R.drawable.carlos_rivera, song, artist));
        }else if (artist.equals("Sia")) {
            details.add(new Detail(album,R.drawable.sia, song, artist));
        }else if (artist.equals("Maroon 5")) {
            details.add(new Detail(album,R.drawable.maroon5, song, artist));
        }else if (artist.equals("Linking Park")) {
            details.add(new Detail(album,R.drawable.linking_park, song, artist));
        }else if (artist.equals("The Greatest showman")) {
            details.add(new Detail(album,R.drawable.greatest_showman, song, artist));
        }else if (artist.equals("My Little Pony The movie")) {
            details.add(new Detail(album,R.drawable.my_little_pony, song, artist));
        }else if (artist.equals("Coco The movie")) {
            details.add(new Detail(album,R.drawable.coco, song, artist));
        }

        //Create the detailAdapter
        detailAdapter itemAdapter = new detailAdapter(this, details);
        //Find the ListView
        final ListView listView = findViewById(R.id.singer_list);
        //Set the Adapter  using the adapter
        listView.setAdapter(itemAdapter);
    }
}
