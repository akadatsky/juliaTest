package com.e.mymostpopulerapi.model;

import java.util.ArrayList;

public class Media {

    boolean approved_for_syndication;
    String caption;
    String copyright;
    ArrayList<MediaMetaData> mediaMetadata;
    String subtype;
    String type;

    public Media() {
    }

    public boolean isApproved_for_syndication() {
        return approved_for_syndication;
    }

    public String getCaption() {
        return caption;
    }

    public String getCopyright() {
        return copyright;
    }

    public ArrayList<MediaMetaData> getMediaMetadata() {
        return mediaMetadata;
    }

    public String getSubtype() {
        return subtype;
    }

    public String getType() {
        return type;
    }
}
