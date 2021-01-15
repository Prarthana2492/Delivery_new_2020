package com.farmpe.farmpev2ux.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.farmpe.farmpev2ux.Adapter.Request_Address_Book_Adapter;
import com.farmpe.farmpev2ux.Bean.Add_New_Address_Bean;
import com.farmpe.farmpev2ux.R;


import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;


public class Request_Address_Book_Fragment extends Fragment {

    Fragment selectedFragment;
    TextView name,add_address,filter;
    private RecyclerView recyclerView;
    LinearLayout back_feed;
    Request_Address_Book_Adapter mAdapter;
    String pickUPFrom;
    public static String address;
    public static LinearLayout linearLayout;


    JSONObject lngObject;
   public static String address_string;

    ArrayList<Add_New_Address_Bean> new_address_beanArrayList = new ArrayList<>();
    Add_New_Address_Bean add_new_address_bean;
    JSONArray get_address_array;
    LinearLayout back;
    String Id;
    ImageView b_arrow;


    public static Request_Address_Book_Fragment newInstance() {
        Request_Address_Book_Fragment fragment = new Request_Address_Book_Fragment();
        return fragment;

    }


    @SuppressLint("NewApi")

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.adress_book_recy_layout, container, false);
        //  getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);


        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if( keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_UP) {

//                    Bundle bundle = new Bundle();
//                    bundle.putString("navigation_from",getArguments().getString("back_status"));
//                    selectedFragment = MapFragment.newInstance();
//                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
//                    transaction.replace(R.id.frame_menu, selectedFragment);
//                    selectedFragment.setArguments(bundle);
//                    transaction.commit();

//                       FragmentManager fm = getActivity().getSupportFragmentManager();
//                       fm.popBackStack("currentlocation", FragmentManager.POP_BACK_STACK_INCLUSIVE);

                }
                return false;
            }
        });



        add_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Bundle bundle = new Bundle();
//                bundle.putString("navigation_from","Address_book");
//                selectedFragment = Add_New_Address_Fragment.newInstance();
//                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
//                transaction.replace(R.id.frame_menu, selectedFragment);
//                selectedFragment.setArguments(bundle);
//                transaction.addToBackStack("request_adress_book");
//                transaction.commit();

            }
        });



        back_feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//                Bundle bundle = new Bundle();
//                bundle.putString("navigation_from",getArguments().getString("back_status"));
//                selectedFragment = MapFragment.newInstance();
//                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
//                transaction.replace(R.id.frame_menu, selectedFragment);
//                selectedFragment.setArguments(bundle);
//                transaction.commit();
            }
        });


        mAdapter = new Request_Address_Book_Adapter(new_address_beanArrayList,getActivity());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);




        return view;
    }



//    private void addressbook_list() {
//
//        try{
//            final JSONObject jsonObject = new JSONObject();
//            jsonObject.put("UserId",sessionManager.getRegId("userId"));
//            jsonObject.put("PickUpFrom",pickUPFrom);
//            System.out.println("aaaaaaaaaaaaadddd" + sessionManager.getRegId("userId"));
//
//
//            Crop_Post.crop_posting(getActivity(), Urls.Get_New_Address, jsonObject, new VoleyJsonObjectCallback() {
//                @Override
//                public void onSuccessResponse(JSONObject result) {
//                    System.out.println("ggggggggggaaaaaaa"+result);
//
//                    try{
//                        new_address_beanArrayList.clear();
//
//                        get_address_array = result.getJSONArray("UserAddressDetails");
//
//                         for(int i=0;i<get_address_array.length();i++){
//                            JSONObject jsonObject1 = get_address_array.getJSONObject(i);
//
//                            add_new_address_bean = new Add_New_Address_Bean(jsonObject1.getString("Name"),jsonObject1.getString("StreeAddress"),jsonObject1.getString("StreeAddress1"),jsonObject1.getString("LandMark"),jsonObject1.getString("City"),jsonObject1.getString("Pincode"),jsonObject1.getString("MobileNo"), jsonObject1.getString("PickUpFrom"),jsonObject1.getString("State"),jsonObject1.getString("District"),jsonObject1.getString("Taluk"),jsonObject1.getString("Hoblie"),jsonObject1.getString("Village"),jsonObject1.getString("Id"),
//                                    jsonObject1.getBoolean("IsDefaultAddress"),jsonObject1.getString("StateId"),jsonObject1.getString("DistrictId"),jsonObject1.getString("TalukId"),jsonObject1.getString("VillageId"));
//                            new_address_beanArrayList.add(add_new_address_bean);
//
//                        }
//
//                        mAdapter.notifyDataSetChanged();
//
//
//                    }catch (Exception e){
//                        e.printStackTrace();
//                    }
//                }
//            });
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//    }


}
