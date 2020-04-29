package com.example.camal;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Pharmacy_main extends AppCompatActivity {



    String p1[];
    RecyclerView RecyclerViewPharmacy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy_main);




        p1= getResources().getStringArray(R.array.allCityPharmacies);
        RecyclerViewPharmacy= findViewById(R.id.RecyclerViewPharmacy);

        pharmaciesAdapter pharmaciesAdapterObj = new pharmaciesAdapter(this, p1);
        RecyclerViewPharmacy.setAdapter(pharmaciesAdapterObj);
        RecyclerViewPharmacy.setLayoutManager(new LinearLayoutManager(this));

        // actionBarEditing
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbarlayout_pharmacies);
    }
}
