package com.e.mymostpopulerapi.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.e.mymostpopulerapi.R;

public class EmailedFragment extends Fragment {

    String emailText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_emailed, container, false);
        TextView textView = view.findViewById(R.id.txtEmail);
        textView.setText(this.emailText);

        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
    }

    public void setText(String text){
        this.emailText = text;
    }

}
