package com.farmpe.farmpev2ux.Fragment;


import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.farmpe.farmpev2ux.R;


public class Language_Setting_Page extends Fragment {
    Fragment selectedFragment = null;
    LinearLayout back_feed;


    public static Language_Setting_Page newInstance() {
        Language_Setting_Page fragment = new Language_Setting_Page();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.language_setting_page, container, false);

        back_feed = view.findViewById(R.id.back_feed);

        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener(new View.OnKeyListener() {


            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_UP) {

                    selectedFragment = Profile_Fragment.newInstance();
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame_layout1, selectedFragment);
                    transaction.commit();


                    return true;
                }
                return false;
            }
        });

                back_feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedFragment = Profile_Fragment.newInstance();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout1, selectedFragment);
                transaction.commit();




            }
        });


//        newOrderBeansList.clear();
//        GridLayoutManager mLayoutManager_farm = new GridLayoutManager(getActivity(), 1, GridLayoutManager.VERTICAL, false);
//        recyclerView.setLayoutManager(mLayoutManager_farm);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//
//
//        farmadapter=new NotificationAdapter(getActivity(),newOrderBeansList);
//        recyclerView.setAdapter(farmadapter);




        return view;
    }



}
