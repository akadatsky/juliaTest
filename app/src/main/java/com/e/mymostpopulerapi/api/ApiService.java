package com.e.mymostpopulerapi.api;


import com.e.mymostpopulerapi.model.EmailResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET(URLs.EMAILED)
    Call<EmailResponse> getEmail();

}
