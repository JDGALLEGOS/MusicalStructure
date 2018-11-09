package com.galpotechsolutions.musicalstructure;

/**
 * {@link Singer} represents the section that the user wants to listen.
 * It contains a default section, the name of the album and the image
 */
public class Singer {

    /** The name of the album */
    private String mAlbum;
    /**The group or singer */
    private String mArtist;
    /** Drawable resource ID */
    private int mImageResourceId;

    /**
     *
     * @param vName is the name of the artist or group
     * @param vAlbum is the name of the album
     * @param imageResourceId is drawable reference ID that corresponds to the album
     */
    public Singer(String vName, String vAlbum, int imageResourceId){
        mAlbum = vAlbum;
        mArtist = vName;
        mImageResourceId = imageResourceId;
    }

    public String getAlbum(){
        return mAlbum;
    }

    public String getArtist(){
        return mArtist;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

}
