package com.example.recyclerviewspractice.multipleSelection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewspractice.R;

import java.util.ArrayList;

public class multipleActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    multipleAdapter adapter;
//    int arr[] = new int[20];

    ArrayList<dataMultiple> arr = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple);
        recyclerView = findViewById(R.id.multiple_recycler_view);

        initRecyclerView();


    }

    private void initRecyclerView() {

        adapter  = new multipleAdapter(this,arr);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this,1));

        addData();

    }

    private void addData() {
        dataMultiple d;
        for (int i=0;i<21;i++)
        {
            d  = new dataMultiple("hemant"+i);
            arr.add(d);

        }
        adapter.notifyDataSetChanged();
    }
}