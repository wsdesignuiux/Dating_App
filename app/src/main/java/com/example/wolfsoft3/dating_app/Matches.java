package com.example.wolfsoft3.dating_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import adapter.Item_Matches_Adapater;
import model.Item_Matches_Model;

public class Matches extends AppCompatActivity implements View.OnClickListener {

    RecyclerView recyclerView;
    Item_Matches_Adapater item_matches_adapater;
    ArrayList<Item_Matches_Model> modelList;

    ImageView img1,img2,img3,img4,img5,img6,img7,img8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matches);

        recyclerView = findViewById(R.id.recycle_matches);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        modelList = new ArrayList<>();

        modelList.add(new Item_Matches_Model(R.drawable.character_gray_1));
        modelList.add(new Item_Matches_Model(R.drawable.character_gray_1));
        modelList.add(new Item_Matches_Model(R.drawable.character_gray_1));
        modelList.add(new Item_Matches_Model(R.drawable.character_gray_1));
        modelList.add(new Item_Matches_Model(R.drawable.character_gray_1));
        modelList.add(new Item_Matches_Model(R.drawable.character_gray_1));
        modelList.add(new Item_Matches_Model(R.drawable.character_gray_1));
        modelList.add(new Item_Matches_Model(R.drawable.character_gray_1));
        modelList.add(new Item_Matches_Model(R.drawable.character_gray_1));

        item_matches_adapater = new Item_Matches_Adapater(Matches.this, modelList);
        recyclerView.setAdapter(item_matches_adapater);


        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);


        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.img1:

                img1.setImageResource(R.drawable.boy2);
                img2.setImageResource(R.drawable.boy11);
                img3.setImageResource(R.drawable.boy11);
                img4.setImageResource(R.drawable.boy11);
                img5.setImageResource(R.drawable.boy11);
                img6.setImageResource(R.drawable.boy11);
                img7.setImageResource(R.drawable.boy11);
                img8.setImageResource(R.drawable.boy11);

                break;

            case R.id.img2:

                img1.setImageResource(R.drawable.boy11);
                img2.setImageResource(R.drawable.boy2);
                img3.setImageResource(R.drawable.boy11);
                img4.setImageResource(R.drawable.boy11);
                img5.setImageResource(R.drawable.boy11);
                img6.setImageResource(R.drawable.boy11);
                img7.setImageResource(R.drawable.boy11);
                img8.setImageResource(R.drawable.boy11);

                break;

            case R.id.img3:

                img1.setImageResource(R.drawable.boy11);
                img2.setImageResource(R.drawable.boy11);
                img3.setImageResource(R.drawable.boy2);
                img4.setImageResource(R.drawable.boy11);
                img5.setImageResource(R.drawable.boy11);
                img6.setImageResource(R.drawable.boy11);
                img7.setImageResource(R.drawable.boy11);
                img8.setImageResource(R.drawable.boy11);

                break;

            case R.id.img4:

                img1.setImageResource(R.drawable.boy11);
                img2.setImageResource(R.drawable.boy11);
                img3.setImageResource(R.drawable.boy11);
                img4.setImageResource(R.drawable.boy2);
                img5.setImageResource(R.drawable.boy11);
                img6.setImageResource(R.drawable.boy11);
                img7.setImageResource(R.drawable.boy11);
                img8.setImageResource(R.drawable.boy11);

                break;

            case R.id.img5:

                img1.setImageResource(R.drawable.boy11);
                img2.setImageResource(R.drawable.boy11);
                img3.setImageResource(R.drawable.boy11);
                img4.setImageResource(R.drawable.boy11);
                img5.setImageResource(R.drawable.boy2);
                img6.setImageResource(R.drawable.boy11);
                img7.setImageResource(R.drawable.boy11);
                img8.setImageResource(R.drawable.boy11);

                break;

            case R.id.img6:

                img1.setImageResource(R.drawable.boy11);
                img2.setImageResource(R.drawable.boy11);
                img3.setImageResource(R.drawable.boy11);
                img4.setImageResource(R.drawable.boy11);
                img5.setImageResource(R.drawable.boy11);
                img6.setImageResource(R.drawable.boy2);
                img7.setImageResource(R.drawable.boy11);
                img8.setImageResource(R.drawable.boy11);

                break;

            case R.id.img7:

                img1.setImageResource(R.drawable.boy11);
                img2.setImageResource(R.drawable.boy11);
                img3.setImageResource(R.drawable.boy11);
                img4.setImageResource(R.drawable.boy11);
                img5.setImageResource(R.drawable.boy11);
                img6.setImageResource(R.drawable.boy11);
                img7.setImageResource(R.drawable.boy2);
                img8.setImageResource(R.drawable.boy11);

                break;

            case R.id.img8:

                img1.setImageResource(R.drawable.boy11);
                img2.setImageResource(R.drawable.boy11);
                img3.setImageResource(R.drawable.boy11);
                img4.setImageResource(R.drawable.boy11);
                img5.setImageResource(R.drawable.boy11);
                img6.setImageResource(R.drawable.boy11);
                img7.setImageResource(R.drawable.boy11);
                img8.setImageResource(R.drawable.boy2);

                break;
        }

    }
}
