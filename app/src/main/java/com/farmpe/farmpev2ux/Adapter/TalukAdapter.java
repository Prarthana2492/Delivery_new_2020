package com.farmpe.farmpev2ux.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.farmpe.farmpev2ux.Bean.StateBean;
import com.farmpe.farmpev2ux.R;

import java.util.List;

public class TalukAdapter extends RecyclerView.Adapter<TalukAdapter.TalukMyViewHolder> {

    List<StateBean> stateBeanList;
    public static String talukid;
    Activity activity;


    public TalukAdapter(List<StateBean> stateBeanList, Activity activity) {
        this.stateBeanList = stateBeanList;
        this.activity=activity;
    }



    @NonNull
    @Override
    public TalukMyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View stateview= LayoutInflater.from(parent.getContext()).inflate(R.layout.state_name,parent,false);
        return new TalukMyViewHolder(stateview);
    }

    @Override
    public void onBindViewHolder(@NonNull final TalukMyViewHolder holder, int position) {
        final StateBean stateBean=stateBeanList.get(position);



        holder.statename.setText(stateBean.getName());

        System.out.println("talukidddd" + stateBean.getId());


        holder.state_name_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                System.out.println("checkingggggg" + stateBean.getId());
                talukid=stateBean.getId();

//                Add_New_Address_Fragment.block.setText(holder.statename.getText().toString());
//                Add_New_Address_Fragment.drawer.closeDrawers();
                //  Add_New_Address_Fragment.grade_dialog.dismiss();

            }
        });
    }

    @Override
    public int getItemCount() {
        return stateBeanList.size();
    }



    public class TalukMyViewHolder extends RecyclerView.ViewHolder {
        TextView statename;
        LinearLayout state_name_layout;

        public TalukMyViewHolder(View itemView) {
            super(itemView);
            statename=itemView.findViewById(R.id.state_item);
            state_name_layout=itemView.findViewById(R.id.state_name_layout);
        }
    }
}
