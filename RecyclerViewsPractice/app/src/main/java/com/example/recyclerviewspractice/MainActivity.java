package com.example.recyclerviewspractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.recyclerviewspractice.NormalRecyclerViewPackage.NormalRecycleActivity;
import com.example.recyclerviewspractice.SingleSelection.SingleSelectionActivity;
import com.example.recyclerviewspractice.SwipeRecylerView.swipeActivity;
import com.example.recyclerviewspractice.card.cardActivity;
import com.example.recyclerviewspractice.multipleSelection.multipleActivity;

public class MainActivity extends AppCompatActivity {

    Button normalRecycler;
    Button cardRecycler;
    Button btn3;
    Button btn4;
    Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        normalRecycler = findViewById(R.id.main_normalRecyclerView);
        cardRecycler = findViewById(R.id.main_cardRecyclerView);
        btn3 = findViewById(R.id.main_singleSelection);
        btn4 = findViewById(R.id.main_btn4);
        btn5 = findViewById(R.id.main_btn5);

        normalRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, NormalRecycleActivity.class);
                startActivity(i);
            }
        });

        cardRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(MainActivity.this, cardActivity.class);
                startActivity(i);

            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  i = new Intent(MainActivity.this, SingleSelectionActivity.class);
                startActivity(i);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  i = new Intent(MainActivity.this, multipleActivity.class);
                startActivity(i);

            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  i = new Intent(MainActivity.this, swipeActivity.class);
                startActivity(i);

            }
        });
    }
}