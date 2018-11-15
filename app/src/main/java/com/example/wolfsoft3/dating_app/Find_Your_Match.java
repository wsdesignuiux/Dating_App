package com.example.wolfsoft3.dating_app;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;


import adapter.Item_Your_Match_Adapater;
import model.Item_Find_Your_Match_Model;


public class Find_Your_Match extends AppCompatActivity implements View.OnClickListener {

    RecyclerView recyclerView;
    Item_Your_Match_Adapater item_your_match_adapater;
    ArrayList<Item_Find_Your_Match_Model> modelList;


    TextView map_nearby, map_match;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_your_match);

        recyclerView = findViewById(R.id.recycle_your_match);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        modelList = new ArrayList<>();

        modelList.add(new Item_Find_Your_Match_Model(R.drawable.bed2));
        modelList.add(new Item_Find_Your_Match_Model(R.drawable.bed1));
        modelList.add(new Item_Find_Your_Match_Model(R.drawable.bed2));
        modelList.add(new Item_Find_Your_Match_Model(R.drawable.bed3));
        modelList.add(new Item_Find_Your_Match_Model(R.drawable.bed1));
        modelList.add(new Item_Find_Your_Match_Model(R.drawable.bed2));
        modelList.add(new Item_Find_Your_Match_Model(R.drawable.bed2));
        modelList.add(new Item_Find_Your_Match_Model(R.drawable.bed3));

        item_your_match_adapater = new Item_Your_Match_Adapater(Find_Your_Match.this, modelList);
        recyclerView.setAdapter(item_your_match_adapater);


        map_match = findViewById(R.id.map_match);
        map_nearby = findViewById(R.id.map_nearby);


        map_nearby.setOnClickListener(this);
        map_match.setOnClickListener(this);

    }




            //// Swip to delete item

//        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT|ItemTouchHelper.RIGHT) {
//            @Override
//            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
//                return false;
//            }
//
//            @Override
//            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
//                modelList.remove(viewHolder.getAdapterPosition());
//                item_your_match_adapater.notifyDataSetChanged();
//            }
//        }).attachToRecyclerView(recyclerView);




    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.map_nearby:

                map_nearby.setTextColor(Color.parseColor("#fe7646"));
                map_match.setTextColor(Color.parseColor("#dbdbdb"));

                break;

            case R.id.map_match:

                map_match.setTextColor(Color.parseColor("#fe7646"));
                map_nearby.setTextColor(Color.parseColor("#dbdbdb"));

                break;
        }
    }
}
