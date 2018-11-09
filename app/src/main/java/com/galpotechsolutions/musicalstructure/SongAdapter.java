package com.galpotechsolutions.musicalstructure;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    /**
     *
     * @param context The current context. Used to inflate the layout file
     * @param songs A list of song object to display in a list
     */
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context,0, songs);
    }

    /**
     *
     * @param position    The position in the list of data that should be displayed in the list item view.
     * @param convertView The recycled view to populate
     * @param parent      The parent viewGroup that is used for inflation.
     * @return            The view for the position in the AdapterView.
     */

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder mViewHolder = new ViewHolder();

        //Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.songs_items, parent, false);

            //Find the TextView in the list_item.xml layout with the ID song_text_view
            mViewHolder.songTextView = listItemView.findViewById(R.id.song_text_view);

            //Find the TextView in the list_item.xml layout with the ID duration_text_view
            mViewHolder.durationTextView = listItemView.findViewById(R.id.duration_text_view);

            // Find the ImageView in the list_item.xml layout with the ID list_item_icon
            mViewHolder.iconView = listItemView.findViewById(R.id.album_image);

            //Set the tag of the ViewHolder
            listItemView.setTag(mViewHolder);
        }else {
            mViewHolder = (ViewHolder) listItemView.getTag();
        }

        //get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        //Get the name from the current song object and set this text to the Song TextView
        mViewHolder.songTextView.setText(currentSong.getSong());

        //Get the duration from the current Song object and set this text to the duration TextView
        mViewHolder.durationTextView.setText(currentSong.getDuration());

        // Get the image resource ID from the current Singer object and set the image to iconView
        mViewHolder.iconView.setImageResource(currentSong.getImageResourceId());

        //return the whole list item layout (contains 2 TextViews and 1 ImageView) so that it can be shown in the ListView
        return listItemView;
    }

    static class ViewHolder {
        TextView songTextView;
        TextView durationTextView;
        ImageView iconView;
    }
}
