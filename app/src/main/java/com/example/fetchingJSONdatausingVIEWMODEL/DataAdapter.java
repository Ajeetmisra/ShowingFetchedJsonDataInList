package com.example.fetchingJSONdatausingVIEWMODEL;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fetchingJSONdatausingVIEWMODEL.States;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    ArrayList<States> arrayList;
    public DataAdapter(ArrayList<States> data) {
        this.arrayList = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TextView textView = holder.tv;
        TextView textView1 = holder.tv1;
        textView.setText(arrayList.get(holder.getAdapterPosition()).getLoc());
        textView1.setText(String.valueOf(arrayList.get(holder.getAdapterPosition()).getCases()));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv;TextView tv1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tv = (TextView) itemView.findViewById(R.id.location);
            this.tv1 = (TextView) itemView.findViewById(R.id.cases);
        }
    }
}
