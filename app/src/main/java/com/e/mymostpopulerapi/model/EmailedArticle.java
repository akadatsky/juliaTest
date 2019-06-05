package com.e.mymostpopulerapi.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class EmailedArticle {

    String url;
    String adx_keywords;
    String subsection;
    int email_count;
    String count_type;
    String column;
    int eta_id;
    String section;
    int id;
    int asset_id;
    String nytdsection;
    String byline;
    String type;
    String title;
    @SerializedName(value="abstract")
    String ab;
    String published_date;
    String source;
    String updated;
    ArrayList<String> des_facet;
    ArrayList<String> org_facet;
    ArrayList<String> per_facet;
    ArrayList<String> geo_facet;
    ArrayList<Media> media;
    String uri;

    public EmailedArticle() {
    }

    public String getUrl() {
        return url;
    }

    public String getAdx_keywords() {
        return adx_keywords;
    }

    public String getSubsection() {
        return subsection;
    }

    public int getEmail_count() {
        return email_count;
    }

    public String getCount_type() {
        return count_type;
    }

    public String getColumn() {
        return column;
    }

    public int getEta_id() {
        return eta_id;
    }

    public String getSection() {
        return section;
    }

    public int getId() {
        return id;
    }

    public int getAsset_id() {
        return asset_id;
    }

    public String getNytdsection() {
        return nytdsection;
    }

    public String getByline() {
        return byline;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getAb() {
        return ab;
    }

    public String getPublished_date() {
        return published_date;
    }

    public String getSource() {
        return source;
    }

    public String getUpdated() {
        return updated;
    }

    public ArrayList<String> getDes_facet() {
        return des_facet;
    }

    public ArrayList<String> getOrg_facet() {
        return org_facet;
    }

    public ArrayList<String> getPer_facet() {
        return per_facet;
    }

    public ArrayList<String> getGeo_facet() {
        return geo_facet;
    }

    public ArrayList<Media> getMedia() {
        return media;
    }

    public String getUri() {
        return uri;
    }
}
