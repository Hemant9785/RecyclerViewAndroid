package com.example.recyclerviewspractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.recyclerviewspractice.NormalRecyclerViewPackage.NormalRecycleActivity;

public class MainActivity extends AppCompatActivity {

    Button normalRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        normalRecycler = findViewById(R.id.main_normalRecyclerView);
        normalRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, NormalRecycleActivity.class);
                startActivity(i);
            }
        });
    }
}