package com.example.camal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class hospitalsAdapter  extends RecyclerView.Adapter<hospitalsAdapter.HospitalViewHolder> {

    Context context;
    String hos1[];
    public hospitalsAdapter(Context ct, String h1[]){
    hos1=h1;
    context=ct;
    }







    @NonNull
    @Override
    public HospitalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflaterHospital= LayoutInflater.from(context);
        View viewHospital=inflaterHospital.inflate(R.layout.row_hospitals,parent, false);

        return new HospitalViewHolder(viewHospital);
    }

    @Override
    public void onBindViewHolder(@NonNull HospitalViewHolder holder, int position) {
    holder.hos11.setText(hos1[position]);

    }

    @Override
    public int getItemCount() {
        return hos1.length;
    }

    public class HospitalViewHolder extends RecyclerView.ViewHolder {

        TextView hos11;

        public HospitalViewHolder(@NonNull View itemView) {
            super(itemView);

            hos11=itemView.findViewById(R.id.hospitalsTextView);
        }
    }
}
