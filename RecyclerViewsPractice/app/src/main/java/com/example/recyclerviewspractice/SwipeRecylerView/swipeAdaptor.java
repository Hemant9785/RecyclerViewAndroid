package com.example.recyclerviewspractice.SwipeRecylerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.chauthai.swipereveallayout.ViewBinderHelper;
import com.example.recyclerviewspractice.R;

import java.util.ArrayList;
import java.util.List;

public class swipeAdaptor extends RecyclerView.Adapter<swipeAdaptor.myViewHolder> {

    private Context context;
    private ArrayList<dataSwipe> dataset;

    private ViewBinderHelper viewBinderHelper = new ViewBinderHelper();



    public swipeAdaptor(Context context, ArrayList<dataSwipe> dataset) {
        this.context = context;
        this.dataset = dataset;
    }



    public class myViewHolder extends RecyclerView.ViewHolder{

        SwipeRevealLayout swipeRevealLayout;
        TextView tedit,tdelete,ttext;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            tedit = itemView.findViewById(R.id.swipe_edit_view);
            tdelete = itemView.findViewById(R.id.swipe_delete_view);
            ttext = itemView.findViewById(R.id.swipe_textView);
            swipeRevealLayout = itemView.findViewById(R.id.swipeMainLayout);

            tdelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "Clicked on delete", Toast.LENGTH_SHORT).show();
                }
            });


            tedit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "Clicked on edit", Toast.LENGTH_SHORT).show();
                }
            });
        }


        public void bind(dataSwipe d)
        {
            ttext.setText(d.getName());
        }
    }







    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.swipe_layout,parent,false);
        return new swipeAdaptor.myViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        viewBinderHelper.setOpenOnlyOne(true);
        dataSwipe d  = dataset.get(position);
        viewBinderHelper.bind(holder.swipeRevealLayout, d.getName());
        viewBinderHelper.closeLayout(d.getName());
        holder.bind(d);

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
