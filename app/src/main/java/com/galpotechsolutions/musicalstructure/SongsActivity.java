package com.galpotechsolutions.musicalstructure;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.singer_list);

        final String extra = getIntent().getStringExtra("Singer");
        final String album = getIntent().getStringExtra("Album");


        Resources res = getResources();

        //Log.v("haashActivity", "Word at index 0: " + res.getString(R.string.artist_haash));
       //ArrayList<Singer> singers = (ArrayList<Singer>) extra.getSerializable("Singer");
        //Create a array of words
        final ArrayList<Song> songs = new ArrayList<>();
        if (extra.equals("Ha Ash")){
            songs.add(new Song(res.getString(R.string.artist_haash), "Soy Mujer", "4:19", R.drawable.ha_ash2));
            songs.add(new Song(res.getString(R.string.artist_haash),"Estes Donde Estes", "4:06", R.drawable.ha_ash2));
            songs.add(new Song(res.getString(R.string.artist_haash), "Te dejo en Libertad", "4:02", R.drawable.ha_ash2));
            songs.add(new Song(res.getString(R.string.artist_haash),"Perdon, Perdon", "3:46", R.drawable.ha_ash2));
            songs.add(new Song(res.getString(R.string.artist_haash),"Dos Copas de Más", "3:42", R.drawable.ha_ash2));
            songs.add(new Song(res.getString(R.string.artist_haash),"¿Qué Hago Yo?", "3:32", R.drawable.ha_ash2));
            songs.add(new Song(res.getString(R.string.artist_haash),"No Tiene Devolución", "3:33", R.drawable.ha_ash2));
            songs.add(new Song(res.getString(R.string.artist_haash),"Qué Más Da", "3:20", R.drawable.ha_ash2));
            songs.add(new Song(res.getString(R.string.artist_haash),"Ex de Verdad", "4:07", R.drawable.ha_ash2));
            songs.add(new Song(res.getString(R.string.artist_haash),"No Te Quiero Nada", "3:58", R.drawable.ha_ash2));
            songs.add(new Song(res.getString(R.string.artist_haash),"Sé Que Te Vas", "4:03", R.drawable.ha_ash2));
            songs.add(new Song(res.getString(R.string.artist_haash),"Lo Aprendí de Ti", "3:17", R.drawable.ha_ash2));
            songs.add(new Song(res.getString(R.string.artist_haash),"Odio Amarte", "4:18", R.drawable.ha_ash2));
            songs.add(new Song(res.getString(R.string.artist_haash),"His Eyes on the Sparrow", "3:46", R.drawable.ha_ash2));
        }else if (extra.equals("Matisse")) {
            songs.add(new Song(res.getString(R.string.artist_matise),"La Excepcion", "3:01", R.drawable.matisse2));
            songs.add(new Song(res.getString(R.string.artist_matise),"Todavía", "3:59", R.drawable.matisse2));
            songs.add(new Song(res.getString(R.string.artist_matise),"Como Antes", "3:56", R.drawable.matisse2));
            songs.add(new Song(res.getString(R.string.artist_matise),"Duele Amarte Así", "3:48", R.drawable.matisse2));
            songs.add(new Song(res.getString(R.string.artist_matise),"Dame unos Besitos", "3:16", R.drawable.matisse2));
            songs.add(new Song(res.getString(R.string.artist_matise),"Por Tu Bien", "3:53", R.drawable.matisse2));
            songs.add(new Song(res.getString(R.string.artist_matise),"Quiero Tenerte Ya", "2:54", R.drawable.matisse2));
            songs.add(new Song(res.getString(R.string.artist_matise),"Acuérdate de Mí", "3:57", R.drawable.matisse2));
            songs.add(new Song(res.getString(R.string.artist_matise),"Bonita", "3:19", R.drawable.matisse2));
            songs.add(new Song(res.getString(R.string.artist_matise),"Viene y Va", "3:27", R.drawable.matisse2));
            songs.add(new Song(res.getString(R.string.artist_matise),"Y Ya", "3:25", R.drawable.matisse2));
            songs.add(new Song(res.getString(R.string.artist_matise),"Todavía (Versión Acústica)", "4:16", R.drawable.matisse2));
        }else if (extra.equals("Carlos Rivera")){
            songs.add(new Song("Carlos Rivera","Por ti", "3:28", R.drawable.carlos_rivera2));
            songs.add(new Song("Carlos Rivera","Escapémonos", "3:03", R.drawable.carlos_rivera2));
            songs.add(new Song("Carlos Rivera","Fascinación", "3:46", R.drawable.carlos_rivera2));
            songs.add(new Song("Carlos Rivera","¿Qué fue de nuestra vida?", "4:59", R.drawable.carlos_rivera2));
            songs.add(new Song("Carlos Rivera","Sólo tú", "3:30", R.drawable.carlos_rivera2));
            songs.add(new Song("Carlos Rivera","El hubiera no existe", "3:50", R.drawable.carlos_rivera2));
            songs.add(new Song("Carlos Rivera","No deben marchitar", "4:01", R.drawable.carlos_rivera2));
            songs.add(new Song("Carlos Rivera","Si me das la espalda", "3:11", R.drawable.carlos_rivera2));
            songs.add(new Song("Carlos Rivera","Gracias a ti", "3:45", R.drawable.carlos_rivera2));
            songs.add(new Song("Carlos Rivera","Borrar y continuar", "3:48", R.drawable.carlos_rivera2));
            songs.add(new Song("Carlos Rivera","Si te vas", "3:48", R.drawable.carlos_rivera2));
        }else if (extra.equals("Favorite Spanish")){
            songs.add(new Song(res.getString(R.string.artist_haash),"¿Qué Hago Yo?", "3:32", R.drawable.ha_ash2));
            songs.add(new Song(res.getString(R.string.artist_haash),"No Tiene Devolución", "3:33", R.drawable.ha_ash2));
            songs.add(new Song(res.getString(R.string.artist_haash),"Qué Más Da", "3:20", R.drawable.ha_ash2));
            songs.add(new Song(res.getString(R.string.artist_haash),"Ex de Verdad", "4:07", R.drawable.ha_ash2));
            songs.add(new Song(res.getString(R.string.artist_haash),"No Te Quiero Nada", "3:58", R.drawable.ha_ash2));
            songs.add(new Song(res.getString(R.string.artist_matise),"Bonita", "3:19", R.drawable.matisse2));
            songs.add(new Song(res.getString(R.string.artist_matise),"Viene y Va", "3:27", R.drawable.matisse2));
            songs.add(new Song(res.getString(R.string.artist_matise),"Y Ya", "3:25", R.drawable.matisse2));
            songs.add(new Song(res.getString(R.string.artist_matise),"Todavía (Versión Acústica)", "4:16", R.drawable.matisse2));
            songs.add(new Song("Carlos Rivera","Escapémonos", "3:03", R.drawable.carlos_rivera2));
            songs.add(new Song("Carlos Rivera","Fascinación", "3:46", R.drawable.carlos_rivera2));
            songs.add(new Song("Carlos Rivera","¿Qué fue de nuestra vida?", "4:59", R.drawable.carlos_rivera2));
        }else if (extra.equals("Sia")){
            songs.add(new Song("Sia","Bird Set Free", "4:12", R.drawable.sia2));
            songs.add(new Song("Sia","Alive", "4:23", R.drawable.sia2));
            songs.add(new Song("Sia","One Million Bullets", "4:10", R.drawable.sia2));
            songs.add(new Song("Sia","Move Your Body", "4:07", R.drawable.sia2));
            songs.add(new Song("Sia","Unstoppable", "3:37", R.drawable.sia2));
            songs.add(new Song("Sia","Cheap Thrills", "3:30", R.drawable.sia2));
            songs.add(new Song("Sia","Reaper", "3:39", R.drawable.sia2));
            songs.add(new Song("Sia","House on Fire", "4:01", R.drawable.sia2));
            songs.add(new Song("Sia","Footprints", "3:13", R.drawable.sia2));
            songs.add(new Song("Sia","Sweet Design", "2:25", R.drawable.sia2));
            songs.add(new Song("Sia","Broken Glass", "4:24", R.drawable.sia2));
            songs.add(new Song("Sia","Space Between", "4:48", R.drawable.sia2));
        }else if (extra.equals("Maroon 5")){
            songs.add(new Song("Maroon 5","Maps", "3:10", R.drawable.maroon5_v));
            songs.add(new Song("Maroon 5","Animals", "3:49", R.drawable.maroon5_v));
            songs.add(new Song("Maroon 5","It Was Always You", "3:58", R.drawable.maroon5_v));
            songs.add(new Song("Maroon 5","Unkiss Me", "3:59", R.drawable.maroon5_v));
            songs.add(new Song("Maroon 5","Sugar", "3:56", R.drawable.maroon5_v));
            songs.add(new Song("Maroon 5","Leaving California", "3:24", R.drawable.maroon5_v));
            songs.add(new Song("Maroon 5","In Your Pocket", "3:40", R.drawable.maroon5_v));
            songs.add(new Song("Maroon 5","New Love", "3:17", R.drawable.maroon5_v));
            songs.add(new Song("Maroon 5","Coming Back for You", "3:48", R.drawable.maroon5_v));
            songs.add(new Song("Maroon 5","Feelings", "3:14", R.drawable.maroon5_v));
            songs.add(new Song("Maroon 5","My Heart is Open", "3:58", R.drawable.maroon5_v));
        }else if (extra.equals("Linking Park")){
            songs.add(new Song("Linking Park","Nobody Can Save Me", "3:45", R.drawable.linkin_park));
            songs.add(new Song("Linking Park","Good Goodbye", "3:31", R.drawable.linkin_park));
            songs.add(new Song("Linking Park","Talking to Myself", "3:51", R.drawable.linkin_park));
            songs.add(new Song("Linking Park","Battle Symphony", "3:36", R.drawable.linkin_park));
            songs.add(new Song("Linking Park","Invisible", "3:34", R.drawable.linkin_park));
            songs.add(new Song("Linking Park","Heavy", "2:49", R.drawable.linkin_park));
            songs.add(new Song("Linking Park","Sorry for Now", "3:23", R.drawable.linkin_park));
            songs.add(new Song("Linking Park","Halfway Right", "3:37", R.drawable.linkin_park));
            songs.add(new Song("Linking Park","One More Light", "4:15", R.drawable.linkin_park));
            songs.add(new Song("Linking Park","Sharp Edges", "2:58", R.drawable.linkin_park));
        }else if (extra.equals("Favorite English")){
            songs.add(new Song("Sia","Bird Set Free", "4:12", R.drawable.sia2));
            songs.add(new Song("Sia","Alive", "4:23", R.drawable.sia2));
            songs.add(new Song("Sia","One Million Bullets", "4:10", R.drawable.sia2));
            songs.add(new Song("Sia","Move Your Body", "4:07", R.drawable.sia2));
            songs.add(new Song("Maroon 5","Unkiss Me", "3:59", R.drawable.maroon5_v));
            songs.add(new Song("Maroon 5","Sugar", "3:56", R.drawable.maroon5_v));
            songs.add(new Song("Maroon 5","Leaving California", "3:24", R.drawable.maroon5_v));
            songs.add(new Song("Maroon 5","In Your Pocket", "3:40", R.drawable.maroon5_v));
            songs.add(new Song("Maroon 5","New Love", "3:17", R.drawable.maroon5_v));
            songs.add(new Song("Linking Park","Sorry for Now", "3:23", R.drawable.linkin_park));
            songs.add(new Song("Linking Park","Halfway Right", "3:37", R.drawable.linkin_park));
            songs.add(new Song("Linking Park","One More Light", "4:15", R.drawable.linkin_park));
            songs.add(new Song("Linking Park","Sharp Edges", "2:58", R.drawable.linkin_park));
        }else if (extra.equals("The Greatest showman")){
            songs.add(new Song("The Greatest showman","The Greatest showman", "5:02", R.drawable.greatest_showman2));
            songs.add(new Song("The Greatest showman","A Million Dreams", "4:29", R.drawable.greatest_showman2));
            songs.add(new Song("The Greatest showman","A Million Dreams (Reprise)", "1:10", R.drawable.greatest_showman2));
            songs.add(new Song("The Greatest showman","Come Alive", "3:35", R.drawable.greatest_showman2));
            songs.add(new Song("The Greatest showman","The Other Side", "3:34", R.drawable.greatest_showman2));
            songs.add(new Song("The Greatest showman","This Is Me", "3:54", R.drawable.greatest_showman2));
            songs.add(new Song("The Greatest showman","Rewrite the Stars", "3:37", R.drawable.greatest_showman2));
            songs.add(new Song("The Greatest showman","Tightrope", "3:54", R.drawable.greatest_showman2));
            songs.add(new Song("The Greatest showman","Never Enough (Reprise)", "1:20", R.drawable.greatest_showman2));
            songs.add(new Song("The Greatest showman","From Now On", "5:49", R.drawable.greatest_showman2));
        }else if (extra.equals("My Little Pony The movie")){
            songs.add(new Song("My Little Pony The movie","We Got This Together", "3:32", R.drawable.my_little_pony2));
            songs.add(new Song("My Little Pony The movie","I'm the Friend You Need", "2:15", R.drawable.my_little_pony2));
            songs.add(new Song("My Little Pony The movie","Time to Be Awesome", "2:54", R.drawable.my_little_pony2));
            songs.add(new Song("My Little Pony The movie","One Small Thing", "2:47", R.drawable.my_little_pony2));
            songs.add(new Song("My Little Pony The movie","Open Up Your Eyes", "3:23", R.drawable.my_little_pony2));
            songs.add(new Song("My Little Pony The movie","Rainbow", "3:17", R.drawable.my_little_pony2));
            songs.add(new Song("My Little Pony The movie","Off to See the World", "3:04", R.drawable.my_little_pony2));
            songs.add(new Song("My Little Pony The movie","Thank You for Being a Friend", "3:17", R.drawable.my_little_pony2));
            songs.add(new Song("My Little Pony The movie","Can You Feel It", "2:54", R.drawable.my_little_pony2));
            songs.add(new Song("My Little Pony The movie","I'll Chase the Sky", "2:52", R.drawable.my_little_pony2));
            songs.add(new Song("My Little Pony The movie","No Better Feelin", "2:53", R.drawable.my_little_pony2));
            songs.add(new Song("My Little Pony The movie","I'll Be Around", "3:49", R.drawable.my_little_pony2));
            songs.add(new Song("My Little Pony The movie","Neighsayer", "3:17", R.drawable.my_little_pony2));
        }else if (extra.equals("Coco The movie")){
            songs.add(new Song("Coco The movie","Remember Me", "1:49", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Much Needed Advice", "1:46", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Everyone Knows Juanita", "1:15", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Un Poco Loco", "1:52", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Jálale (Instrumental)", "2:55", R.drawable.coco2));
            songs.add(new Song("Coco The movie","The World Es Mi Familia", "0:51", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Remember Me (Lullaby)", "1:10", R.drawable.coco2));
            songs.add(new Song("Coco The movie","La Llorona", "2:46", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Remember Me (Reunion)", "1:14", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Proud Corazón", "2:04", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Remember Me (Dúo)", "2:44", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Will He Shoemaker?", "3:18", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Shrine and Dash", "1:24", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Miguel's Got an Axe to Find", "1:17", R.drawable.coco2));
            songs.add(new Song("Coco The movie","The Strum of Destiny", "1:10", R.drawable.coco2));
            songs.add(new Song("Coco The movie","It's All Relative", "2:38", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Un Poco Loco", "1:49", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Crossing the Marigold Bridge", "2:45", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Dept. of Family Reunions", "1:49", R.drawable.coco2));
            songs.add(new Song("Coco The movie","The Skeleton Key to Escape", "2:45", R.drawable.coco2));
            songs.add(new Song("Coco The movie","The Newbie Skeleton Walk", "1:08", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Adiós Chicharrón", "1:245", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Plaza de la Cruz", "0:57", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Family Doubtings", "2:24", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Taking Sides", "0:57", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Fiesta Espactacular", "0:56", R.drawable.coco2));
        }else if (extra.equals("Favorite Movies")){
            songs.add(new Song("The Greatest showman","Rewrite the Stars", "3:37", R.drawable.greatest_showman2));
            songs.add(new Song("The Greatest showman","Tightrope", "3:54", R.drawable.greatest_showman2));
            songs.add(new Song("The Greatest showman","Never Enough (Reprise)", "1:20", R.drawable.greatest_showman2));
            songs.add(new Song("The Greatest showman","From Now On", "5:49", R.drawable.greatest_showman2));
            songs.add(new Song("My Little Pony The movie","Open Up Your Eyes", "3:23", R.drawable.my_little_pony2));
            songs.add(new Song("My Little Pony The movie","Rainbow", "3:17", R.drawable.my_little_pony2));
            songs.add(new Song("My Little Pony The movie","Off to See the World", "3:04", R.drawable.my_little_pony2));
            songs.add(new Song("My Little Pony The movie","Thank You for Being a Friend", "3:17", R.drawable.my_little_pony2));
            songs.add(new Song("Coco The movie","Remember Me", "1:49", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Much Needed Advice", "1:46", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Everyone Knows Juanita", "1:15", R.drawable.coco2));
            songs.add(new Song("Coco The movie","Un Poco Loco", "1:52", R.drawable.coco2));
        }

        //Create the SongAdapter
        SongAdapter itemAdapter = new SongAdapter(this, songs);

        //Find the ListView
        ListView listView = findViewById(R.id.singer_list);

        //Set the Adapter  using the adapter
        listView.setAdapter(itemAdapter);

        //Call a new Activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Bundle extraSong = new Bundle();
                extraSong.putString("Singer",songs.get(i).getName());
                extraSong.putString("Album",album);
                extraSong.putString("Song",songs.get(i).getSong());
                Intent appInfo = new Intent(SongsActivity.this, DetailActivity.class);
                appInfo.putExtras(extraSong);
                startActivity(appInfo);
            }
        });

    }
}
