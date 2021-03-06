package com.example.camal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class doctorsCategoriesAdapter extends RecyclerView.Adapter<doctorsCategoriesAdapter.MyViewHolder> {

    String data1[];
    Context context;

    public doctorsCategoriesAdapter (Context ct, String s1[]){
        context = ct;
        data1 = s1;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater= LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
    }

    @Override
    public int getItemCount() {

        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView myText1;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1= itemView.findViewById(R.id.neurologists);
        }
    }
}
