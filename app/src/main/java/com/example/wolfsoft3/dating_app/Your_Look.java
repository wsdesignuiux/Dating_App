package com.example.wolfsoft3.dating_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Your_Look extends AppCompatActivity implements View.OnClickListener {

//    RecyclerView recyclerView;
//    Item_Your_Look_Adapater item_your_look_adapater;
//    ArrayList<Item_Matches_Model> modelList;

    ImageView character_gray_1,character_gray_2,character_gray_3,character_gray_4,character_gray_5,character_gray_6,character_gray_7,character_gray_8,character_gray_9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.your__look);

//        recyclerView = findViewById(R.id.recycle_your_look);
//        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
//
//        modelList = new ArrayList<>();
//
//        modelList.add(new Item_Matches_Model(R.drawable.character_gray_1));
//        modelList.add(new Item_Matches_Model(R.drawable.character_gray_2));
//        modelList.add(new Item_Matches_Model(R.drawable.character_gray_3));
//        modelList.add(new Item_Matches_Model(R.drawable.character_gray_4));
//        modelList.add(new Item_Matches_Model(R.drawable.character_gray_5));
//        modelList.add(new Item_Matches_Model(R.drawable.character_gray_6));
//        modelList.add(new Item_Matches_Model(R.drawable.character_gray_7));
//        modelList.add(new Item_Matches_Model(R.drawable.character_gray_8));
//        modelList.add(new Item_Matches_Model(R.drawable.character_gray_9));
//
//        item_your_look_adapater = new Item_Your_Look_Adapater(Your_Look.this, modelList);
//        recyclerView.setAdapter(item_your_look_adapater);



        character_gray_1 = findViewById(R.id.character_gray_1);
        character_gray_2 = findViewById(R.id.character_gray_2);
        character_gray_3 = findViewById(R.id.character_gray_3);
        character_gray_4 = findViewById(R.id.character_gray_4);
        character_gray_5 = findViewById(R.id.character_gray_5);
        character_gray_6 = findViewById(R.id.character_gray_6);
        character_gray_7 = findViewById(R.id.character_gray_7);
        character_gray_8 = findViewById(R.id.character_gray_8);
        character_gray_9 = findViewById(R.id.character_gray_9);

        character_gray_1.setOnClickListener(this);
        character_gray_2.setOnClickListener(this);
        character_gray_3.setOnClickListener(this);
        character_gray_4.setOnClickListener(this);
        character_gray_5.setOnClickListener(this);
        character_gray_6.setOnClickListener(this);
        character_gray_7.setOnClickListener(this);
        character_gray_8.setOnClickListener(this);
        character_gray_9.setOnClickListener(this);





    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.character_gray_1:

                character_gray_1.setImageResource(R.drawable.character_orange_1);
                character_gray_2.setImageResource(R.drawable.character_gray_2);
                character_gray_3.setImageResource(R.drawable.character_gray_3);
                character_gray_4.setImageResource(R.drawable.character_gray_4);
                character_gray_5.setImageResource(R.drawable.character_gray_5);
                character_gray_6.setImageResource(R.drawable.character_gray_6);
                character_gray_7.setImageResource(R.drawable.character_gray_7);
                character_gray_8.setImageResource(R.drawable.character_gray_8);
                character_gray_9.setImageResource(R.drawable.character_gray_9);


                break;

            case R.id.character_gray_2:

                character_gray_1.setImageResource(R.drawable.character_gray_1);
                character_gray_2.setImageResource(R.drawable.character_orange_2);
                character_gray_3.setImageResource(R.drawable.character_gray_3);
                character_gray_4.setImageResource(R.drawable.character_gray_4);
                character_gray_5.setImageResource(R.drawable.character_gray_5);
                character_gray_6.setImageResource(R.drawable.character_gray_6);
                character_gray_7.setImageResource(R.drawable.character_gray_7);
                character_gray_8.setImageResource(R.drawable.character_gray_8);
                character_gray_9.setImageResource(R.drawable.character_gray_9);

                break;

            case R.id.character_gray_3:

                character_gray_1.setImageResource(R.drawable.character_gray_1);
                character_gray_2.setImageResource(R.drawable.character_gray_2);
                character_gray_3.setImageResource(R.drawable.character_orange_3);
                character_gray_4.setImageResource(R.drawable.character_gray_4);
                character_gray_5.setImageResource(R.drawable.character_gray_5);
                character_gray_6.setImageResource(R.drawable.character_gray_6);
                character_gray_7.setImageResource(R.drawable.character_gray_7);
                character_gray_8.setImageResource(R.drawable.character_gray_8);
                character_gray_9.setImageResource(R.drawable.character_gray_9);

                break;

            case R.id.character_gray_4:

                character_gray_1.setImageResource(R.drawable.character_gray_1);
                character_gray_2.setImageResource(R.drawable.character_gray_2);
                character_gray_3.setImageResource(R.drawable.character_gray_3);
                character_gray_4.setImageResource(R.drawable.character_orange_4);
                character_gray_5.setImageResource(R.drawable.character_gray_5);
                character_gray_6.setImageResource(R.drawable.character_gray_6);
                character_gray_7.setImageResource(R.drawable.character_gray_7);
                character_gray_8.setImageResource(R.drawable.character_gray_8);
                character_gray_9.setImageResource(R.drawable.character_gray_9);

                break;

            case R.id.character_gray_5:

                character_gray_1.setImageResource(R.drawable.character_gray_1);
                character_gray_2.setImageResource(R.drawable.character_gray_2);
                character_gray_3.setImageResource(R.drawable.character_gray_3);
                character_gray_4.setImageResource(R.drawable.character_gray_4);
                character_gray_5.setImageResource(R.drawable.character_orange_5);
                character_gray_6.setImageResource(R.drawable.character_gray_6);
                character_gray_7.setImageResource(R.drawable.character_gray_7);
                character_gray_8.setImageResource(R.drawable.character_gray_8);
                character_gray_9.setImageResource(R.drawable.character_gray_9);

                break;

            case R.id.character_gray_6:

                character_gray_1.setImageResource(R.drawable.character_gray_1);
                character_gray_2.setImageResource(R.drawable.character_gray_2);
                character_gray_3.setImageResource(R.drawable.character_gray_3);
                character_gray_4.setImageResource(R.drawable.character_gray_4);
                character_gray_5.setImageResource(R.drawable.character_gray_5);
                character_gray_6.setImageResource(R.drawable.character_orange_6);
                character_gray_7.setImageResource(R.drawable.character_gray_7);
                character_gray_8.setImageResource(R.drawable.character_gray_8);
                character_gray_9.setImageResource(R.drawable.character_gray_9);

                break;

            case R.id.character_gray_7:

                character_gray_1.setImageResource(R.drawable.character_gray_1);
                character_gray_2.setImageResource(R.drawable.character_gray_2);
                character_gray_3.setImageResource(R.drawable.character_gray_3);
                character_gray_4.setImageResource(R.drawable.character_gray_4);
                character_gray_5.setImageResource(R.drawable.character_gray_5);
                character_gray_6.setImageResource(R.drawable.character_gray_6);
                character_gray_7.setImageResource(R.drawable.character_orange_7);
                character_gray_8.setImageResource(R.drawable.character_gray_8);
                character_gray_9.setImageResource(R.drawable.character_gray_9);

                break;


            case R.id.character_gray_8:

                character_gray_1.setImageResource(R.drawable.character_gray_1);
                character_gray_2.setImageResource(R.drawable.character_gray_2);
                character_gray_3.setImageResource(R.drawable.character_gray_3);
                character_gray_4.setImageResource(R.drawable.character_gray_4);
                character_gray_5.setImageResource(R.drawable.character_gray_5);
                character_gray_6.setImageResource(R.drawable.character_gray_6);
                character_gray_7.setImageResource(R.drawable.character_gray_7);
                character_gray_8.setImageResource(R.drawable.character_orange_8);
                character_gray_9.setImageResource(R.drawable.character_gray_9);

                break;

            case R.id.character_gray_9:

                character_gray_1.setImageResource(R.drawable.character_gray_1);
                character_gray_2.setImageResource(R.drawable.character_gray_2);
                character_gray_3.setImageResource(R.drawable.character_gray_3);
                character_gray_4.setImageResource(R.drawable.character_gray_4);
                character_gray_5.setImageResource(R.drawable.character_gray_5);
                character_gray_6.setImageResource(R.drawable.character_gray_6);
                character_gray_7.setImageResource(R.drawable.character_gray_7);
                character_gray_8.setImageResource(R.drawable.character_gray_8);
                character_gray_9.setImageResource(R.drawable.character_orange_9);

                break;


        }
    }
}
