package com.example.wolfsoft3.dating_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Plan extends AppCompatActivity implements View.OnClickListener {


    LinearLayout linear1,linear2,linear3,linear11,linear22,linear33;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan);

        linear1 = findViewById(R.id.linear1);
        linear2 = findViewById(R.id.linear2);
        linear3 = findViewById(R.id.linear3);
        linear11 = findViewById(R.id.linear11);
        linear22 = findViewById(R.id.linear22);
        linear33 = findViewById(R.id.linear33);

        linear11.setOnClickListener(this);
        linear22.setOnClickListener(this);
        linear33.setOnClickListener(this);

    }

    //linear 22 is normal
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.linear11:
                linear1.setVisibility(View.VISIBLE);
                linear2.setVisibility(View.GONE);
                linear3.setVisibility(View.GONE);
                break;

            case R.id.linear22:
                linear1.setVisibility(View.GONE);
                linear2.setVisibility(View.VISIBLE);
                linear3.setVisibility(View.GONE);
                break;

            case R.id.linear33:
                linear1.setVisibility(View.GONE);
                linear2.setVisibility(View.GONE);
                linear3.setVisibility(View.VISIBLE);
                break;
        }
    }
}
