package com.galpotechsolutions.musicalstructure;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SingerAdapter extends ArrayAdapter<Singer> {

    /**
     *
     * @param context The current context. Used to inflate the layout file
     * @param singers A list of Singer object to display in a list
     */
    public SingerAdapter(Activity context, ArrayList<Singer> singers) {
        super(context,0, singers);
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
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

            //Find the TextView in the list_item.xml layout with the ID singer_text_view
            mViewHolder.singerTextView = listItemView.findViewById(R.id.singer_text_view);

            //Find the TextView in the list_item.xml layout with the ID singer_text_view
            mViewHolder.albumTextView = listItemView.findViewById(R.id.default_text_view);

            // Find the ImageView in the list_item.xml layout with the ID list_item_icon
            mViewHolder.iconView = listItemView.findViewById(R.id.list_item_icon);

            //Set the tag of the ViewHolder
            listItemView.setTag(mViewHolder);
        }else {
            mViewHolder = (ViewHolder) listItemView.getTag();
        }

        //get the {@link Singer} object located at this position in the list
        Singer currentSinger = getItem(position);


        //Get the singer from the current Singer object and set this text to the singer TextView
        mViewHolder.singerTextView.setText(currentSinger.getArtist());


        //Get the album from the current Singer object and set this text to the singer TextView
        mViewHolder.albumTextView.setText(currentSinger.getAlbum());


        // Get the image resource ID from the current Singer object and set the image to iconView
        mViewHolder.iconView.setImageResource(currentSinger.getImageResourceId());

        //return the whole list item layout (contains 2 TextViews and 1 ImageView) so that it can be shown in the ListView
        return listItemView;
    }

    static class ViewHolder {
        TextView singerTextView;
        TextView albumTextView;
        ImageView iconView;
    }

}
