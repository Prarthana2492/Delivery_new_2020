package com.farmpe.farmpev2ux.Adapter;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.farmpe.farmpev2ux.Bean.Add_New_Address_Bean;
import com.farmpe.farmpev2ux.R;


import java.util.List;


public class Request_Address_Book_Adapter extends RecyclerView.Adapter<Request_Address_Book_Adapter.MyViewHolder>{



    private List<Add_New_Address_Bean> productList;
    Activity activity;
    Fragment selectedFragment = null;
    public static TextView name,price,edit;
    public static String add_id;
    public static CardView cardView;
    LinearLayout linearLayout;



    public Request_Address_Book_Adapter(List<Add_New_Address_Bean> moviesList, Activity activity) {

        this.productList = moviesList;
        this.activity=activity;


    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name,street_addrss,city_1,edit_1,delete_1,default_1,default_add,area_district,colony;
        LinearLayout add_new_adress,address_book;


        public MyViewHolder(View view) {
            super(view);

            name = view.findViewById(R.id.name1);
            street_addrss= view.findViewById(R.id.street_address1);
//            city_1= view.findViewById(R.id.city_1);
//            edit_1= view.findViewById(R.id.edit_1);
//            delete_1 = view.findViewById(R.id.delete_1);
//            default_1 = view.findViewById(R.id.default_1);
//            default_add = view.findViewById(R.id.default_add);
            linearLayout = view.findViewById(R.id.bottom_sheet1);
            area_district = view.findViewById(R.id.districttt);
            colony = view.findViewById(R.id.colony);
            address_book = view.findViewById(R.id.address_book);
            add_new_adress = view.findViewById(R.id.linear_frame);


        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.address_book_adapter, parent, false);
        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final Add_New_Address_Bean products = productList.get(position);


        add_id =products.getAdd_id();

        System.out.println("1123213213" + products.getAdd_id() );
        System.out.println("1123213213name" + products.getAdd_name() );


        holder.name.setText(products.getAdd_name());
        holder.street_addrss.setText(products.getAdd_door_no() + products.getAdd_street());
       // holder.colony.setText(products.getAdd_street());


        if(products.getAdd_hobli().equals("")){
            System.out.println("hsfhhfdfhjhjhjhjhjhjhjhjhjhjhjhjhjhj");


            holder.colony.setText(products.getAdd_district()+","+products.getAdd_taluk());

        }else{

            holder.colony.setText(products.getAdd_district()+","+products.getAdd_taluk()+","+products.getAdd_hobli());

        }

        if(products.getAdd_pincode().equals("")){


            holder.area_district.setText(products.getAdd_state()+ " , " + "Phone No - " + products.getAdd_mobile());

        }else{


            holder.area_district.setText(products.getAdd_state()+ " - " + products.getAdd_pincode() + " , " + "Phone No - " + products.getAdd_mobile());

        }

         //  holder.mobile_no.setText("Phone No - " + products.getAdd_mobile());
        // holder.landmrk.setText(products.getAdd_landmark());



//        holder.address_book.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                if (Request_Address_Book_Fragment.address_string.equals("REQ_PRICE")) {
//
//                    Bundle bundle = new Bundle();
//                    bundle.putString("dealer_status","Req_Book");
//                    selectedFragment = DealerProfile.newInstance();
//                    FragmentTransaction transaction = ((FragmentActivity) activity).getSupportFragmentManager().beginTransaction();
//                    transaction.replace(R.id.frame_menu, selectedFragment);
//                    selectedFragment.setArguments(bundle);
//                    transaction.addToBackStack("address_book");
//                    transaction.commit();
//
//
//                } else {
//
//                    Bundle bundle = new Bundle();
//                    bundle.putString("request_navigation", "ADDRESS_BOOK");
//                    bundle.putString("add_id", products.getAdd_id());
//                    selectedFragment = Request_Details_New_Fragment.newInstance();
//                    FragmentTransaction transaction = ((FragmentActivity) activity).getSupportFragmentManager().beginTransaction();
//                    transaction.replace(R.id.frame_menu, selectedFragment);
//                    transaction.addToBackStack("address_book");
//                    selectedFragment.setArguments(bundle);
//                    transaction.commit();
//
//                }
//            }
//        });

    }


    @Override
    public int getItemCount() {
        return productList.size();
    }

}

