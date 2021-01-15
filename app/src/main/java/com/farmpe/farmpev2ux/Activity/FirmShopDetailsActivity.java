package com.farmpe.farmpev2ux.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.farmpe.farmpev2ux.Fragment.FirmShopDetailsFragment;
import com.farmpe.farmpev2ux.R;


public class FirmShopDetailsActivity extends AppCompatActivity {

    Fragment selectedFragment = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firm);


        selectedFragment = FirmShopDetailsFragment.newInstance();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout1, selectedFragment);
        transaction.commit();
    }
}
