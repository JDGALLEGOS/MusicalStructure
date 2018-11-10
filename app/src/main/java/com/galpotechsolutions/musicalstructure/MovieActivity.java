package com.galpotechsolutions.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MovieActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.singer_list);

        //Create a array of words
        final ArrayList<Singer> singers = new ArrayList<>();
        singers.add(new Singer("The Greatest showman", "The Greatest showman", R.drawable.greatest_showman2));
        singers.add(new Singer("My Little Pony The movie", "My Little Pony The movie", R.drawable.my_little_pony2));
        singers.add(new Singer("Coco The movie", "Coco The movie", R.drawable.coco2));
        singers.add(new Singer("Favorite Movies", "None", R.drawable.favorite2));

        //Create the SingerAdapter
        SingerAdapter itemAdapter = new SingerAdapter(this, singers);

        //Find the ListView
        ListView listView = findViewById(R.id.singer_list);

        //Set the Adapter  using the adapter
        listView.setAdapter(itemAdapter);

        //Call a new Activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Bundle extra = new Bundle();
                extra.putString("Singer",singers.get(i).getArtist());
                extra.putString("Album",singers.get(i).getAlbum());
                //Log.v("NumberActivity", "Word at index 0: " + singers.get(i).getArtist());
                Intent appInfo = new Intent(MovieActivity.this, SongsActivity.class);
                appInfo.putExtras(extra);
                startActivity(appInfo);
            }
        });

    }

}
