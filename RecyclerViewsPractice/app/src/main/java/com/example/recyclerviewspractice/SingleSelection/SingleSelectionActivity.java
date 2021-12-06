package com.example.recyclerviewspractice.SingleSelection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.recyclerviewspractice.R;

import java.util.ArrayList;

public class SingleSelectionActivity extends AppCompatActivity {

    Button btn;
    RecyclerView recyclerView;
    singleSelectionAdapter adapter;
    ArrayList<dataClass> dataset = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_selection);
        btn = findViewById(R.id.singleSelection_btn);
        recyclerView = findViewById(R.id.singleSelection_recyclerview);

        initRecyclerView();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(adapter.getSelected()==null)
                    Toast.makeText(getBaseContext(), "no selection", Toast.LENGTH_SHORT).show();
                else
                {
                    Toast.makeText(getBaseContext(), ""+adapter.getSelected().getName(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void initRecyclerView() {

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        adapter = new singleSelectionAdapter(this,dataset);
        recyclerView.setAdapter(adapter);
        addData();
    }

    private void addData() {

        dataClass d ;
        d = new dataClass("Hemant");
        dataset.add(d);
        d = new dataClass("joshi");
        dataset.add(d);
        d = new dataClass("Riya");
        dataset.add(d);
        d = new dataClass("Sonu");
        dataset.add(d);
        d = new dataClass("Naresh");
        dataset.add(d);
        d = new dataClass("Aarti");
        dataset.add(d);
        d = new dataClass("Suman");
        dataset.add(d);
        d = new dataClass("Abhishek");
        dataset.add(d);
        d = new dataClass("Rajat");
        dataset.add(d);
        d = new dataClass("Mohit");
        dataset.add(d);
        d = new dataClass("Chirag");
        dataset.add(d);
        d = new dataClass("Shanu");
        dataset.add(d);
        d = new dataClass("Dean");
        dataset.add(d);
        d = new dataClass("Administrator");
        dataset.add(d);
        d = new dataClass("Bhu");
        dataset.add(d);

        d = new dataClass("Hemant");
        dataset.add(d);
        d = new dataClass("joshi");
        dataset.add(d);
        d = new dataClass("Riya");
        dataset.add(d);
        d = new dataClass("Sonu");
        dataset.add(d);
        d = new dataClass("Naresh");
        dataset.add(d);
        d = new dataClass("Aarti");
        dataset.add(d);
        d = new dataClass("Suman");
        dataset.add(d);
        d = new dataClass("Abhishek");
        dataset.add(d);
        d = new dataClass("Rajat");
        dataset.add(d);
        d = new dataClass("Mohit");
        dataset.add(d);
        d = new dataClass("Chirag");
        dataset.add(d);
        d = new dataClass("Shanu");
        dataset.add(d);
        d = new dataClass("Dean");
        dataset.add(d);
        d = new dataClass("Administrator");
        dataset.add(d);
        d = new dataClass("Bhu");
        dataset.add(d);

        adapter.notifyDataSetChanged();
    }
}