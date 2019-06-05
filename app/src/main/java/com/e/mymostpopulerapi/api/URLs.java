package com.e.mymostpopulerapi.api;

public class URLs {

    public static final String SERVER_URL = "https://api.nytimes.com/svc/mostpopular/v2/";
    public static final String KEY = ".json?api-key=11gBCcayzqgAkCCD0hLRxn7uafYHS8aT";
    public static final String EMAILED = SERVER_URL + "emailed/30" + KEY;
    public static final String SHARED = SERVER_URL + "shared/" + KEY;
    public static final String VIEWED = SERVER_URL + "viewed/" + KEY;
}
