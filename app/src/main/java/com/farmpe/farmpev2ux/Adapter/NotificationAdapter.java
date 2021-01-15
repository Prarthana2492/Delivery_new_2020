package com.farmpe.farmpev2ux.Adapter;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.farmpe.farmpev2ux.Bean.Notification_Home_Bean;
import com.farmpe.farmpev2ux.R;


import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.MyViewHolder>  {
    private List<Notification_Home_Bean> productList;
    Activity activity;
    Fragment selectedFragment;

    public LinearLayout linearLayout;



    public static CardView cardView;
    public NotificationAdapter(Activity activity, List<Notification_Home_Bean> moviesList) {
        this.productList = moviesList;
        this.activity=activity;

    }



    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        LinearLayout noti_layout;
        public TextView prod_price,prod_name,duration,farmer_name,location,connect,view_text;



        public MyViewHolder(View view) {
            super(view);

            prod_name=view.findViewById(R.id.prod_name);
            noti_layout=view.findViewById(R.id.noti_layout);
           // view_text=view.findViewById(R.id.view_text);
            image=view.findViewById(R.id.image);


        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.notification_item, parent, false);
        return new MyViewHolder(itemView);

    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final Notification_Home_Bean products = productList.get(position);

//
//        if (products.getIs_read()) {
//            System.out.println("fdjvhjfvdfvdf" + products.getIs_read());
//
//            holder.noti_layout.setBackgroundResource(R.drawable.white_filled_background);
//            holder.view_text.setVisibility(View.GONE);
//
//
//        } else {
//
//            holder.noti_layout.setBackgroundResource(R.drawable.notification_cream_background);
//            holder.view_text.setVisibility(View.VISIBLE);
//
//
//        }


        holder.prod_name.setText(products.getNotiftn_mess());

        holder.view_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                selectedFragment = Notification_RFQ_Details.newInstance();
//                FragmentTransaction transaction = ((FragmentActivity) activity).getSupportFragmentManager().beginTransaction();
//                transaction.replace(R.id.frame_layout, selectedFragment);
//                transaction.addToBackStack("noti_view");
//                transaction.commit();

            }
        });


//        holder.noti_layout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                if(products.getIs_read()){
//                    System.out.println("fdjvhjfvdfvdf" + products.getIs_read());
//
//
//                    holder.noti_layout.setBackgroundResource(R.drawable.white_filled_background);
//                    holder.view_text.setVisibility(View.GONE);
//
//                }else{
//
//                    holder.noti_layout.setBackgroundResource(R.drawable.notification_cream_background);
//                    holder.view_text.setVisibility(View.VISIBLE);
//
//
//
//                }
//
//                holder.noti_layout.setBackgroundResource(R.drawable.white_filled_background);
//                holder.view_text.setVisibility(View.GONE);
//
//            }
//        });
//    }

    }
    @Override
    public int getItemCount() {
        System.out.println("lengthhhhhhh"+productList.size());
        return productList.size();
    }



}