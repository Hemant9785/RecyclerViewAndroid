package com.example.recyclerviewspractice.NormalRecyclerViewPackage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.recyclerviewspractice.R;

import java.util.ArrayList;

public class NormalRecycleActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    NormalAdapter adapter;
    ArrayList<DataClass> dataset= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_recycle);
        adapter = new NormalAdapter(this,dataset);


        recyclerView = findViewById(R.id.normal_recycler_view);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);
        addData();
    }

    private void addData() {
        DataClass d1 = new DataClass("Hemant","Hero");
        DataClass d2 = new DataClass("Riya","Villan");
        DataClass d3 = new DataClass("Sonu","Maha Villan");
        DataClass d4 = new DataClass("Naresh","Hemants Father");
        DataClass d5= new DataClass("Aarti","Heamants Mother");
        DataClass d6 = new DataClass("Joshi","surname");
        DataClass d7 = new DataClass("kfjasdklf","Hedsafo");
        DataClass d8 = new DataClass("Hemant","Herdsafo");
        DataClass d9 = new DataClass("Hedsafmant","Heasdfro");
        DataClass d10 = new DataClass("Hemadasfnt","Herosdgj");
        DataClass d11 = new DataClass("Hemandsaft","Herhjkgo");
        DataClass d12 = new DataClass("Hemasadfnt","Hergjho");
        DataClass d13 = new DataClass("Hemasdafnt","Herasdfo");
        DataClass d14 = new DataClass("Hesdafmant","Herasdfo");

        dataset.add(d1);
        dataset.add(d2);
        dataset.add(d3);
        dataset.add(d4);
        dataset.add(d5);
        dataset.add(d6);
        dataset.add(d7);
        dataset.add(d8);
        dataset.add(d9);
        dataset.add(d10);
        dataset.add(d11);
        dataset.add(d12);
        dataset.add(d13);
        dataset.add(d14);
        adapter.notifyDataSetChanged();


    }
}