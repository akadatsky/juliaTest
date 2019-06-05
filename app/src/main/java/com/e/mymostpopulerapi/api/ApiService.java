package com.e.mymostpopulerapi.api;

import android.content.Context;
import android.os.AsyncTask;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.widget.EditText;


import com.e.mymostpopulerapi.ui.main.SectionsPagerAdapter;

import java.net.URL;
import java.net.HttpURLConnection;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;


public class ApiService extends AsyncTask<String, Void, String> {

    @Override
    protected String doInBackground(String... strings) {
        URL url = null;
        HttpURLConnection httpURLConnection = null;
        StringBuilder result = new StringBuilder();

        try {
            url = new URL(strings[0]);
            httpURLConnection = (HttpURLConnection) url.openConnection();

            InputStream inputStream = httpURLConnection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line = bufferedReader.readLine();
            while (line != null) {
                result.append(line);
                line = bufferedReader.readLine();
            }

            return result.toString();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }

        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

        super.onPostExecute(s);
        StringBuilder str = new StringBuilder();

        try {
            JSONObject jsonObject = new JSONObject(s);

            for (int i = 0; i < jsonObject.getJSONArray("results").length(); i++) {
                str.append(jsonObject.getJSONArray("results").getJSONObject(i).getString("title"));
                str.append("\n");
                str.append(jsonObject.getJSONArray("results").getJSONObject(i).getString("url"));
                str.append("\n\n");
            }

            Log.i("MYResult", str.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


}
