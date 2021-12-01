package com.example.recyclerviewspractice.card;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewspractice.R;

import java.util.ArrayList;
import java.util.List;

public class cardAdapter extends RecyclerView.Adapter<cardAdapter.cardHolder> {

    private Context mContext;
    private ArrayList<cardData>dataset;

    public cardAdapter(Context mContext, ArrayList<cardData> dataset) {
        this.mContext = mContext;
        this.dataset = dataset;
    }

    class cardHolder extends RecyclerView.ViewHolder
    {
        TextView t1,t2;
        public cardHolder(@NonNull View itemView) {
            super(itemView);
            t1 = itemView.findViewById(R.id.card_name);
            t2 = itemView.findViewById(R.id.card_surname);
        }

        public void setDetails(cardData d)
        {
            t1.setText(d.getName());;
            t2.setText(d.getSurName());
        }
    }

    @NonNull
    @Override
    public cardAdapter.cardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView  = LayoutInflater.from(mContext).inflate(R.layout.card_layout,parent,false);
        return new cardAdapter.cardHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull cardAdapter.cardHolder holder, int position) {
//        holder.setDetails(dataset.get(position));
        cardData d = dataset.get(position);
        holder.setDetails(d);
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }








}
