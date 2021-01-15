package com.farmpe.farmpev2ux.Fragment;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.farmpe.farmpev2ux.R;


//Our class extending fragment
public class Bank_Profile_Fragment extends Fragment {


    public static Bank_Profile_Fragment newInstance() {
        Bank_Profile_Fragment itemOnFragment = new Bank_Profile_Fragment();
        return itemOnFragment;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.profile_page_two, container, false);


        Window window = getActivity().getWindow();
        window.setStatusBarColor(ContextCompat.getColor(getActivity(), R.color.colorPrimaryDark));




        return view;
    }

}
