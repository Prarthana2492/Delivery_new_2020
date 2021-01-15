package com.farmpe.farmpev2ux.Fragment;


import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.farmpe.farmpev2ux.Adapter.NotificationAdapter;
import com.farmpe.farmpev2ux.Bean.Notification_Home_Bean;
import com.farmpe.farmpev2ux.R;


import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class Map_Get_Address_Page extends Fragment {

    public static List<Notification_Home_Bean> newOrderBeansList = new ArrayList<>();
    public static RecyclerView recyclerView;
    public static NotificationAdapter farmadapter;
    TextView toolbar_title,noti_count;
    ImageView back_arrw;
    LinearLayout back_feed,no_notifitn_added;
    Notification_Home_Bean notification_home_bean;
    Fragment selectedFragment;
    JSONObject lngObject;
    JSONArray notifn_array;
    String location;
    String morecount;



    public static Map_Get_Address_Page newInstance() {
        Map_Get_Address_Page fragment = new Map_Get_Address_Page();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.notification_recy, container, false);


        recyclerView=view.findViewById(R.id.recycler_noti);
        toolbar_title=view.findViewById(R.id.toolbar_title);
        back_feed=view.findViewById(R.id.back_feed);
        back_arrw=view.findViewById(R.id.back_arrw);
        no_notifitn_added=view.findViewById(R.id.no_notifitn_added);
        //  noti_count=view.findViewById(R.id.noti_count);

        //  sessionManager = new SessionManager(getActivity());



        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener(new View.OnKeyListener() {


            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_UP) {

                    FragmentManager fm = getActivity().getSupportFragmentManager();
                    fm.popBackStack ("home_notify", FragmentManager.POP_BACK_STACK_INCLUSIVE);


                    return true;
                }
                return false;
            }
        });


        back_feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //  back_arrw.setImageDrawable(getResources().getDrawable(R.drawable.ic_whitecancel));

                FragmentManager fm = getActivity().getSupportFragmentManager();
                fm.popBackStack ("home_notify", FragmentManager.POP_BACK_STACK_INCLUSIVE);


            }
        });


        newOrderBeansList.clear();
        GridLayoutManager mLayoutManager_farm = new GridLayoutManager(getActivity(), 1, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(mLayoutManager_farm);
        recyclerView.setItemAnimator(new DefaultItemAnimator());


        farmadapter=new NotificationAdapter(getActivity(),newOrderBeansList);
        recyclerView.setAdapter(farmadapter);







        return view;
    }



}
