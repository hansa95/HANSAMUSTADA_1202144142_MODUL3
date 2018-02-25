package com.example.user.hansamustada_1202144142_modul3;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //bikin my_rv
        RecyclerView my_recycler_view = (RecyclerView)findViewById(R.id.my_recycler_view);

        //set ukuran fix
        my_recycler_view.setHasFixedSize(true);

        MyAdapter adapter = new MyAdapter(Items);
        my_recycler_view.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager();
        my_recycler_view.setLayoutManager(llm);


    }
}
