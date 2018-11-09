package com.galpotechsolutions.musicalstructure;

/**
 * {@link Song} represents the section that the user wants to listen.
 * It contains a default section, the name of the song
 */
public class Song {

    /** The name of the Song */
    private String mSong;
    /**The duration of the song */
    private String mDuration;
    /** Drawable resource ID */
    private int mImageResourceId;
    /** The name of the artist*/
    private String mName;

    /**
     *
     * @param vSong is the name of the song
     * @param vDuration is the duration of the song
     */
    public Song(String vName, String vSong, String vDuration,  int imageResourceId){
        mSong = vSong;
        mDuration = vDuration;
        mImageResourceId = imageResourceId;
        mName = vName;
    }

    public String getName() {return  mName; }

    public String getSong(){
        return mSong;
    }

    public String getDuration(){
        return mDuration;
    }

    public int getImageResourceId(){return mImageResourceId; }

}
