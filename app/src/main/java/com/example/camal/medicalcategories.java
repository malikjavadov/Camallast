package com.example.camal;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class medicalcategories extends AppCompatActivity {

    String s1[];
    RecyclerView doctorscategories;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicalcategories);

        doctorscategories= findViewById(R.id.doctorscategories);
        s1= getResources().getStringArray(R.array.doctors_categories);

        doctorsCategoriesAdapter doctorsCategoriesAdapter= new doctorsCategoriesAdapter( this, s1);
        doctorscategories.setAdapter(doctorsCategoriesAdapter);
        doctorscategories.setLayoutManager(new LinearLayoutManager(this));

        // actionBarEditing
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbarlayout_doctors);
    }
}
