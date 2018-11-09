package com.galpotechsolutions.musicalstructure;

import android.app.Activity;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class detailAdapter extends ArrayAdapter<Detail> {

    /**
     *
     * @param context The current context. Used to inflate the layout file
     * @param details A list of details object to display in a list
     */
    public detailAdapter(Activity context, ArrayList<Detail> details) {
        super(context,0, details);
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

        //check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.detail_items, parent, false);

            //Find the TextView in the detail_items.xml layout with the ID album_name
            mViewHolder.albumTextView = listItemView.findViewById(R.id.album_name);

            //Find the ImageView in the detail_items.xml layout with the ID album_image
            mViewHolder.iconView = listItemView.findViewById(R.id.album_image);

            //Find the ImageView in the detail_items.xml layout with the ID artist_name
            mViewHolder.artistTextView = listItemView.findViewById(R.id.artist_name);

            //Find the ImageView in the detail_items.xml layout with the ID song_name
            mViewHolder.songTextView = listItemView.findViewById(R.id.song_name);

            //Find the backward_image_view in the detail_items.xml layout with the ID backward_image_view
            mViewHolder.backwardView = listItemView.findViewById(R.id.backward_image_view);

            //Find the backward_image_view in the detail_items.xml layout with the ID backward_image_view
            mViewHolder.playView = listItemView.findViewById(R.id.play_image_view);

            //Find the backward_image_view in the detail_items.xml layout with the ID backward_image_view
            mViewHolder.forwardView = listItemView.findViewById(R.id.forward_image_view);

            //Set the tag of the ViewHolder
            listItemView.setTag(mViewHolder);
        }else{
            mViewHolder = (ViewHolder) listItemView.getTag();
        }

        //get the {@link Detail} object located at this position in the list
        Detail currentDetail = getItem(position);

        //Get the name of the album from the current detail object and set this text to the Detail album_name
        mViewHolder.albumTextView.setText(currentDetail.getAlbum());

        //Get the image of the album from the current detail object and set this text to the Detail album_image
        mViewHolder.iconView.setImageResource(currentDetail.getImageResourceId());

        //Get the name of the artist from the current detail object and set this text to the Detail artist_name
        mViewHolder.artistTextView.setText(currentDetail.getArtist());

        //Get the name of the artist from the current detail object and set this text to the Detail song_name
        mViewHolder.songTextView.setText(currentDetail.getSong());

        //Get the backward image and set this to the Detail backward_image_view
        mViewHolder.backwardView.setImageResource(android.R.drawable.ic_media_previous);

        //Get the play image and set this to the Detail play_image_view
        mViewHolder.playView.setImageResource(android.R.drawable.ic_media_play);

        //Get the forward image and set this to the Detail forward_image_view
        mViewHolder.forwardView.setImageResource(android.R.drawable.ic_media_next);

        //return the whole list item layout (contains 4 TextViews and 1 ImageView) so that it can be shown in the ListView
        return listItemView;
    }

    static class ViewHolder {
        TextView albumTextView;
        TextView artistTextView;
        TextView songTextView;
        ImageView iconView;
        ImageButton backwardView;
        ImageButton playView;
        ImageButton forwardView;
    }
}
