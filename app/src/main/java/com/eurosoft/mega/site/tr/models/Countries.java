package com.eurosoft.mega.site.tr.models;

/**
 * Created by ytu-nuh-koca on 20/08/2017.
 */

public class Countries {
    private String content;
    private int flagID;

    public Countries(String content, int flagID) {
        this.content = content;
        this.flagID = flagID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getFlagID() {
        return flagID;
    }

    public void setFlagID(int flagID) {
        this.flagID = flagID;
    }
}
