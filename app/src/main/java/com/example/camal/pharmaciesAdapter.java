package com.example.camal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class pharmaciesAdapter  extends RecyclerView.Adapter<pharmaciesAdapter.pharmaciesViewHolder> {

    Context context;
    String phar1[];
    public pharmaciesAdapter(Context ct, String p1[]){
        phar1=p1;
        context=ct;
    }




    @NonNull
    @Override
    public pharmaciesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflaterPharmacy= LayoutInflater.from(context);
        View viewPharmacy=inflaterPharmacy.inflate(R.layout.row_pharmacies, parent, false);

        return new pharmaciesViewHolder(viewPharmacy);
    }




    @Override
    public void onBindViewHolder(@NonNull pharmaciesViewHolder holder, int position) {
        holder.phar11.setText(phar1[position]);

    }

    @Override
    public int getItemCount() {
        return phar1.length;
    }

    public class pharmaciesViewHolder extends RecyclerView.ViewHolder {

        TextView phar11;

        public pharmaciesViewHolder(@NonNull View itemView) {
            super(itemView);

            phar11=itemView.findViewById(R.id.pharmaciesTextView);
        }
    }
}
