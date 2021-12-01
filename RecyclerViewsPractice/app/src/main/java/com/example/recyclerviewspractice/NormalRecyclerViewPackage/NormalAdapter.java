package com.example.recyclerviewspractice.NormalRecyclerViewPackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewspractice.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class NormalAdapter extends RecyclerView.Adapter<NormalAdapter.MyHolder> {

    public Context mContext;
    public ArrayList<DataClass> dataset;

    public NormalAdapter(Context mContext, ArrayList<DataClass> dataset) {
        this.mContext = mContext;
        this.dataset = dataset;
    }

    @NonNull
    @Override
    public NormalAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.normal_recy_layout,parent,false);
        return new NormalAdapter.MyHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NormalAdapter.MyHolder holder, int position) {
        DataClass d = dataset.get(position);
        holder.p.setText(d.getPrimary());
        holder.s.setText(d.getSecondary());
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
    public void setDetails(DataClass d,MyHolder holder)
    {
        holder.p.setText(d.getPrimary());
        holder.s.setText(d.getSecondary());

    }



    //holder class
    public class MyHolder extends RecyclerView.ViewHolder{

        TextView p,s;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            p = itemView.findViewById(R.id.normal_recyclerView_primary);
            s = itemView.findViewById(R.id.normal_recyclerView_secondary);
        }


    }
}
