package com.example.wolfsoft3.dating_app;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import adapter.You_Likes_View_Pager_Adapter;

public class Likes extends AppCompatActivity {

    ViewPager viewpager_likes;
    TabLayout tablayout_likes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.likes);



        viewpager_likes = findViewById(R.id.viewpager_likes);
        tablayout_likes = findViewById(R.id.tablayout_likes);

        tablayout_likes.addTab(tablayout_likes.newTab().setText("Like You"));
        tablayout_likes.addTab(tablayout_likes.newTab().setText("You Visited"));

        You_Likes_View_Pager_Adapter adapter = new You_Likes_View_Pager_Adapter(getSupportFragmentManager(), tablayout_likes.getTabCount());
        viewpager_likes.setAdapter(adapter);
        viewpager_likes.setOffscreenPageLimit(2);
        viewpager_likes.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout_likes));
        tablayout_likes.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager_likes.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        Typeface mTypeface = Typeface.create("roboto_regular",Typeface.NORMAL);
        ViewGroup vg = (ViewGroup) tablayout_likes.getChildAt(0);
        int tabsCount = vg.getChildCount();
        for (int j = 0; j < tabsCount; j++) {
            ViewGroup vgTab = (ViewGroup) vg.getChildAt(j);
            int tabChildsCount = vgTab.getChildCount();
            for (int i = 0; i < tabChildsCount; i++) {
                View tabViewChild = vgTab.getChildAt(i);
                if (tabViewChild instanceof TextView) {
                    ((TextView) tabViewChild).setTypeface(mTypeface, Typeface.NORMAL);
                }
            }
        }
    }

    }

