package com.example.recyclerviewspractice.SingleSelection;

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

public class singleSelectionAdapter extends RecyclerView.Adapter<singleSelectionAdapter.SingleViewHolder> {

    private Context context;
    private ArrayList<dataClass>dataset;
    private int checkedPos = 0;


    //ViewHolder
    public class SingleViewHolder extends RecyclerView.ViewHolder {
        private TextView t;
        private ImageView i;
        public SingleViewHolder(@NonNull View itemView) {
            super(itemView);
            t = itemView.findViewById(R.id.singleSelection_name);
            i = itemView.findViewById(R.id.singleSelection_selection);
        }

        public void Bind(dataClass d)
        {
            if(checkedPos == -1)
            {
                i.setVisibility(ImageView.GONE);
            }
            else
            {
                if(checkedPos == getAdapterPosition())
                {
                    i.setVisibility(ImageView.VISIBLE);
                }
                else
                {
                    i.setVisibility(ImageView.GONE);
                }
            }

            t.setText(d.getName());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    i.setVisibility(View.VISIBLE);
                    if(checkedPos != getAdapterPosition())
                    {
                        notifyItemChanged(checkedPos);
                        checkedPos = getAdapterPosition();

                    }
                }
            });

        }
    }


    public singleSelectionAdapter(Context context, ArrayList<dataClass> dataset) {
        this.context = context;
        this.dataset = dataset;
    }

    //Methods
    @NonNull
    @Override
    public singleSelectionAdapter.SingleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View itemView = LayoutInflater.from(context).inflate(R.layout.singleselection_layout,parent,false);
       return new singleSelectionAdapter.SingleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull singleSelectionAdapter.SingleViewHolder holder, int position) {
            holder.Bind(dataset.get(position));
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public dataClass getSelected()
    {
        if(checkedPos==-1)
            return null;
        return dataset.get(checkedPos);
    }


}
