package com.farmpe.farmpev2ux.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.farmpe.farmpev2ux.R;


public class Farmer_Activity_Page extends AppCompatActivity {

    LinearLayout txt_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.farmer_activity_page);

        txt_btn = findViewById(R.id.txt_btn);

        txt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Farmer_Activity_Page.this,FirmShopDetailsActivity.class);
                startActivity(intent);

            }
        });

    }
}
