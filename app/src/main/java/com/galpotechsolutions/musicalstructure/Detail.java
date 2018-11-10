package com.galpotechsolutions.musicalstructure;

/**
 * {@link Detail} represents the detail of the section show to the user.
 * It contains the name of the album, the image of the album,
 * the name of the artist and the name of the songs
 */
public class Detail {
    /** The name of the Album */
    private String mAlbum;
    /** Drawable resource ID */
    private int mImageResourceId;
    /** The name of the Song*/
    private String mSong;
    /**The duration of the artist */
    private String mArtist;

    /**
     *
     * @param vAlbum is the name of the album
     * @param imageResourceId is the image of the album
     * @param vSong is the name of the song
     * @param vArtist is the name of the artist
     */
    public Detail(String vAlbum, int imageResourceId, String vSong, String vArtist){
        mAlbum = vAlbum;
        mImageResourceId = imageResourceId;
        mSong = vSong;
        mArtist = vArtist;
    }

    public String getAlbum(){
        return mAlbum;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public String getSong(){
        return mSong;
    }

    public String getArtist(){
        return  mArtist;
    }
}
