package com.farmpe.farmpev2ux.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.farmpe.farmpev2ux.Bean.Profile_Address_Bean;
import com.farmpe.farmpev2ux.R;


import java.util.List;


public class Address_Adapter extends RecyclerView.Adapter<Address_Adapter.MyViewHolder> {

    private List<Profile_Address_Bean> productList;
    Activity activity;
    Fragment selectedFragment;
  public static String address_id;
    LinearLayout linear_layout;
    //SessionManager sessionManager;



    public Address_Adapter(Activity activity, List<Profile_Address_Bean> moviesList) {
        this.productList = moviesList;
        this.activity=activity;

    }



    public class MyViewHolder extends RecyclerView.ViewHolder {
        public LinearLayout item;
        public TextView bankname,name,area,delete_addrss,edit_address,mobile_no,block;




        public MyViewHolder(View view) {
            super(view);

            bankname=view.findViewById(R.id.bankname);
            name=view.findViewById(R.id.name);
            area=view.findViewById(R.id.area);
            delete_addrss=view.findViewById(R.id.delete_addrss);
            edit_address=view.findViewById(R.id.edit_address);
            linear_layout=view.findViewById(R.id.linear_layout);
            mobile_no=view.findViewById(R.id.mobile_no);
            block=view.findViewById(R.id.block);
           // sessionManager = new SessionManager(activity);


        }

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())


                .inflate(R.layout.address_adapter, parent, false);
        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final Profile_Address_Bean products = productList.get(position);

       // address_id = products.getProf_addrss_id();


        // holder.bankname.setText(products.getBankname());
        holder.name.setText(products.getProf_add_name() + " , " + products.getProf_address());
        //  holder.phone_no.setText(products.getPhonenumber()+" | "+products.getIfsccode());
        holder.area.setText(products.getProf_landmark() + " , " + products.getProf_block_name());
        holder.block.setText(products.getProf_state_name() + " - " + products.getProf_pincode());
        holder.mobile_no.setText("Phone No" + " - " + products.getProf_add_mobile());


        holder.edit_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//
//                address_id = products.getProf_addrss_id();
//
//                Bundle bundle = new Bundle();
//                bundle.putString("prof_add_status", "edit_add_addressss");
//                bundle.putString("addr_name", products.getProf_add_name());
//                bundle.putString("addr_mobile_number", products.getProf_add_mobile());
//                bundle.putString("addr_address", products.getProf_address());
//                bundle.putString("addr_pincode", products.getProf_pincode());
//                bundle.putString("addr_landmark", products.getProf_landmark());
//                bundle.putString("addr_state", products.getProf_state_name());
//                bundle.putString("addr_district", products.getProf_district_name());
//                bundle.putString("addr_block", products.getProf_block_name());
//                bundle.putString("addr_village", products.getProf_village());

//                selectedFragment = Add_New_Address_Fragment.newInstance();
//                FragmentTransaction transaction = ((FragmentActivity) activity).getSupportFragmentManager().beginTransaction();
//                transaction.replace(R.id.frame_layout1, selectedFragment);
//                transaction.addToBackStack("address_list_page");
//                transaction.commit();


            }
        });

    }


    @Override
    public int getItemCount() {
        return productList.size();
    }










}
