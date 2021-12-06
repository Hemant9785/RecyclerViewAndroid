package com.example.recyclerviewspractice.multipleSelection;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewspractice.R;

import java.util.ArrayList;

public class multipleAdapter extends RecyclerView.Adapter<multipleAdapter.myHolder> {

    private Context mContext;
    private ArrayList<dataMultiple>dataset;
    private int checkedPos[] = new int[100];



    class myHolder extends RecyclerView.ViewHolder
    {
        public TextView t;
        public ImageView i;

        public myHolder(@NonNull View itemView) {
            super(itemView);
            t = itemView.findViewById(R.id.singleSelection_name);
            i  =itemView.findViewById(R.id.singleSelection_selection);

        }

        public void bind(dataMultiple d)
        {
            if(checkedPos[getAdapterPosition()]==1)
            {
                i.setVisibility(View.VISIBLE);
            }
            else
            {
                i.setVisibility(View.GONE);
            }

            t.setText(d.getName());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(checkedPos[getAdapterPosition()]!=1)
                    {
                        checkedPos[getAdapterPosition()] = 1;
                        notifyItemChanged(getAdapterPosition());
                    }
                    else
                    {
                        checkedPos[getAdapterPosition()] = 0;
                        notifyItemChanged(getAdapterPosition());
                    }
                }
            });
        }
    }


    public multipleAdapter(Context mContext, ArrayList<dataMultiple> dataset) {
        this.mContext = mContext;
        this.dataset = dataset;

//        checkedPos = new int[dataset.size()];
        for(int i=0;i<checkedPos.length;i++)
        {
            checkedPos[i]= 0;
        }
    }

    //methods
    @NonNull
    @Override
    public multipleAdapter.myHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.singleselection_layout,parent,false);
        return new multipleAdapter.myHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull multipleAdapter.myHolder holder, int position) {
        dataMultiple  d = dataset.get(position);
        holder.bind(d);
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
