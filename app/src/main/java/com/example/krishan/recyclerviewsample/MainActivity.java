package com.example.krishan.recyclerviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;
    String[] subjects =
            {
                    "ANDROID",
                    "PHP",
                    "BLOGGER",
                    "WORDPRESS",
                    "JOOMLA",
                    "ASP.NET",
                    "JAVA",
                    "C++",
                    "MATHS",
                    "HINDI",
                    "ENGLISH"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview1);
        recylerViewLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recylerViewLayoutManager);

        recyclerViewAdapter = new RecyclerViewAdapter(this, subjects);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
