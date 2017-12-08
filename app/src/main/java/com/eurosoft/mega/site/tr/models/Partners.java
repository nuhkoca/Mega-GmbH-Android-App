package com.eurosoft.mega.site.tr.models;

/**
 * Created by ytu-nuh-koca on 19/08/2017.
 */

public class Partners {
    private int photoID;
    private String url;

    public Partners(int photoID, String url) {
        this.photoID = photoID;
        this.url = url;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
