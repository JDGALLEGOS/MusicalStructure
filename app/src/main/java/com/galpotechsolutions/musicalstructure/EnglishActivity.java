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

public class EnglishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.singer_list);

        //Create a array of words
        final ArrayList<Singer> singers = new ArrayList<>();
        singers.add(new Singer("Sia", "This is acting", R.drawable.sia2));
        singers.add(new Singer("Maroon 5", "V", R.drawable.maroon5_v));
        singers.add(new Singer("Linking Park", "One more light", R.drawable.linkin_park));
        singers.add(new Singer("Favorite English", "None", R.drawable.favorite2));

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
                extra.putString("Singer", singers.get(i).getArtist());
                extra.putString("Album",singers.get(i).getAlbum());
                Log.v("NumberActivity", "Word at index 0: " + singers.get(i).getArtist());
                Intent appInfo = new Intent(EnglishActivity.this, SongsActivity.class);
                appInfo.putExtras(extra);
                startActivity(appInfo);
            }
        });

    }
}
