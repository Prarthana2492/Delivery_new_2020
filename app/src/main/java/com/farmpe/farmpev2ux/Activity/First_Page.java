package com.farmpe.farmpev2ux.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.farmpe.farmpev2ux.R;


public class First_Page extends AppCompatActivity {

    TextView txt_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);

        txt_1 = findViewById(R.id.txt_1);

        txt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(First_Page.this,Language_Page.class);
                startActivity(intent);

            }
        });

    }
}
