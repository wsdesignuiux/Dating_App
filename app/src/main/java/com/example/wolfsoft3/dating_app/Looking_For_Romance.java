package com.example.wolfsoft3.dating_app;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipePlaceHolderView;

import model.Profile;

public class Looking_For_Romance extends AppCompatActivity implements View.OnClickListener {

    private SwipePlaceHolderView mSwipeView;
    private Context mContext;

    TextView map_nearby,map_match;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.looking_for_romance);

        mSwipeView = (SwipePlaceHolderView)findViewById(R.id.swipeView);
        mContext = getApplicationContext();

        mSwipeView.getBuilder()
                .setDisplayViewCount(3)
                .setSwipeDecor(new SwipeDecor()
                        .setPaddingTop(20)
                        .setRelativeScale(0.01f)
                        .setSwipeInMsgLayoutId(R.layout.tinder_swipe_in_msg_view)
                        .setSwipeOutMsgLayoutId(R.layout.tinder_swipe_out_msg_view));


        for(Profile profile : Util.loadProfiles(this.getApplicationContext())){
            mSwipeView.addView(new TinderCard(mContext, profile, mSwipeView));
        }

        findViewById(R.id.messgae_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Looking_For_Romance.this,Chat.class));
            }
        });

        findViewById(R.id.rejectBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSwipeView.doSwipe(false);
            }
        });

        findViewById(R.id.acceptBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Looking_For_Romance.this,Make_Character.class));
            }
        });



        map_match = findViewById(R.id.map_match);
        map_nearby = findViewById(R.id.map_nearby);


        map_nearby.setOnClickListener(this);
        map_match.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

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