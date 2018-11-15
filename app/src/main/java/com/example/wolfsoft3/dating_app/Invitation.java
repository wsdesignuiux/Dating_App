package com.example.wolfsoft3.dating_app;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Invitation extends AppCompatActivity implements View.OnClickListener {

    TextView ilove,letme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.invitation);


        ilove = findViewById(R.id.ilove);
        letme = findViewById(R.id.letme);

        ilove.setOnClickListener(this);
        letme.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ilove:
                ilove.setBackgroundResource(R.drawable.google_login_ract);
                ilove.setTextColor(Color.parseColor("#ffffff"));
                letme.setTextColor(Color.parseColor("#fe7646"));
                letme.setBackgroundResource(R.drawable.pop_up_let_ract);
                break;

            case R.id.letme:
                ilove.setBackgroundResource(R.drawable.pop_up_let_ract);
                letme.setTextColor(Color.parseColor("#ffffff"));
                ilove.setTextColor(Color.parseColor("#fe7646"));
                letme.setBackgroundResource(R.drawable.google_login_ract);
                break;
        }
    }
}
