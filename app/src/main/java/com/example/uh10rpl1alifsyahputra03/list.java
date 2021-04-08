package com.example.uh10rpl1alifsyahputra03;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.Menu;

import java.util.ArrayList;

public class list extends AppCompatActivity {
    private RecyclerView recyclerView;
    private logdataadapter adapter;
    private ArrayList<logdata> List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.rvdata);
        addData();
        adapter = new logdataadapter(List);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(list.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    void addData(){
        List = new ArrayList<>();
        List.add(new logdata("Anjas", "Game Development", "45","6-04-2021"));
        List.add(new logdata("Jamil", "Apps Design", "30", "7-04-2021" ));
        List.add(new logdata("Aji", "Mobile Programming", "35", "8-04-2021" ));
        List.add (new logdata("Agus", "Website Programming" , "34", "9-04-2021"));
    }
}
