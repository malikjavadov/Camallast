package com.example.camal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;

public class HospitalActivity extends AppCompatActivity {

    String h1[];
    RecyclerView RecyclerViewHospital;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals_main);

        h1= getResources().getStringArray(R.array.allCityHospitals);
        RecyclerViewHospital= findViewById(R.id.RecyclerViewHospital);

        hospitalsAdapter hospitalsAdapterObj = new hospitalsAdapter(this, h1);
        RecyclerViewHospital.setAdapter(hospitalsAdapterObj);
        RecyclerViewHospital.setLayoutManager(new LinearLayoutManager(this));

        // actionBarEditing
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbarlayout_hospitals);
    }
}
