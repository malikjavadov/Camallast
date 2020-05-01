package com.example.camal;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Pharmacy_main extends AppCompatActivity {
    ArrayList<String> arrayListPharmacies;
    RecyclerView recyclerViewPharmacy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy_main);
        arrayListPharmacies= new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.allCityPharmacies)));
        recyclerViewPharmacy = findViewById(R.id.recyclerViewPharmacy);
        PharmaciesAdapter pharmaciesAdapter = new PharmaciesAdapter(arrayListPharmacies);
        recyclerViewPharmacy.setAdapter(pharmaciesAdapter);
        recyclerViewPharmacy.setLayoutManager(new LinearLayoutManager(this));


        // actionBarEditing
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbarlayout_pharmacies);
    }
}
