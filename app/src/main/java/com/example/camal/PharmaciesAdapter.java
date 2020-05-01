package com.example.camal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class PharmaciesAdapter extends RecyclerView.Adapter<PharmaciesAdapter.PharmacyViewHolder> {
    View v;
    ArrayList<String> p1;
    public PharmaciesAdapter(ArrayList<String> p1){

        this.p1 = p1;
    }


    public static class PharmacyViewHolder extends RecyclerView.ViewHolder {
        TextView tvPharmacyName;
        public PharmacyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvPharmacyName=itemView.findViewById(R.id.tvPharmacyName);
        }
    }

        @NonNull
        @Override
        public PharmacyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pharmacy_item, parent, false);
            return new PharmacyViewHolder(v);
        }


        @Override
        public void onBindViewHolder(@NonNull PharmacyViewHolder holder, final int position) {
            holder.tvPharmacyName.setText(p1.get(position));
            holder.tvPharmacyName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "You clicked on pos: " + position, Toast.LENGTH_SHORT).show();
                }
            });
        }

        @Override
        public int getItemCount() {
            return p1.size();
        }

}
