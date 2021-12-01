package com.example.recyclerviewspractice.card;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewspractice.R;

import java.util.ArrayList;

public class cardActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    cardAdapter adapter;
    ArrayList<cardData> dataset = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        initializeRecyler();
    }

    private void initializeRecyler() {
        recyclerView = findViewById(R.id.card_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new cardAdapter(this,dataset);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        addDataset();
    }

    private void addDataset() {

        cardData d;
        d = new cardData("Hemant","Johsi");
        dataset.add(d);


        d = new cardData("Naresh","Johsi");
        dataset.add(d);

        d = new cardData("Mohit","Sharma");
        dataset.add(d);

        d = new cardData("Aastha","Mangal");
        dataset.add(d);

        d = new cardData("Abhishek","Sharma");
        dataset.add(d);

        d = new cardData("Virat","Kohli");
        dataset.add(d);

        d = new cardData("MSD","test batter");
        dataset.add(d);

        d = new cardData("Shardul","Thakur");
        dataset.add(d);

        d = new cardData("Ravichandran","Asvin");
        dataset.add(d);

        d = new cardData("Dean","Ambrose");
        dataset.add(d);
        adapter.notifyDataSetChanged();


    }
}