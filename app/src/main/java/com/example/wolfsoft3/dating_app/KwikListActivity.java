package com.example.wolfsoft3.dating_app;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.KwikListRecycleAdapter;
import model.KwikListModelClass;


public class KwikListActivity extends AppCompatActivity {


    private ArrayList<KwikListModelClass> kwikListModelClasses;
    private RecyclerView recyclerView;
    private KwikListRecycleAdapter bAdapter;

    private String txt[]={"01.SplashScreen","02.Login","03.Make Character","04.Your_Look","05.Your_Bedroom",
            "06.Its_You","07.Navigation_drawer","08.Find_Your_Match","09.Map_and_Navigation","10.Looking_For_Romance",
            "11.Match","12.Invitation","13.Romantic_Relationship","14.Relationship","15.Matches","16.Chat",
            "17.Likes","18.Plan","19.Send_Invitation"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_recycle);


        recyclerView = findViewById(R.id.listrecycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(KwikListActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        kwikListModelClasses = new ArrayList<>();

        for (int i = 0; i < txt.length; i++) {
            KwikListModelClass beanClassForRecyclerView_contacts = new KwikListModelClass(txt[i]);
            kwikListModelClasses.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new KwikListRecycleAdapter(KwikListActivity.this,kwikListModelClasses);
        recyclerView.setAdapter(bAdapter);


    }
}
