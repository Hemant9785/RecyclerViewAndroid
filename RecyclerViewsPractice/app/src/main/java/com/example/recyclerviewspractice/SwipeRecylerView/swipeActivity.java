package com.example.recyclerviewspractice.SwipeRecylerView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewspractice.R;

import java.util.ArrayList;

public class swipeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<dataSwipe>dataset = new ArrayList<>();
    swipeAdaptor adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);

        initRecyclerView();
    }

    private void initRecyclerView() {

        recyclerView  = findViewById(R.id.swipeActivity_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.HORIZONTAL));
        adapter = new swipeAdaptor(this,dataset);
        recyclerView.setAdapter(adapter);
        createData();
    }

    private void createData() {
        dataSwipe d ;
        for (int i=0;i<50;i++)
        {
            d = new dataSwipe("Hemant "+i);
            dataset.add(d);
        }
        adapter.notifyDataSetChanged();
    }
}