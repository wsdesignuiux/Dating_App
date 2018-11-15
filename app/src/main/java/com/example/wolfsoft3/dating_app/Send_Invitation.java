package com.example.wolfsoft3.dating_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.skyfishjy.library.RippleBackground;

public class Send_Invitation extends AppCompatActivity {


    RippleBackground rippleBackground1, rippleBackground2;

    ImageView centerImage2, centerImage;

    boolean onoff = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send__invitation);


        rippleBackground2 = findViewById(R.id.content);
        rippleBackground2.startRippleAnimation();
        rippleBackground1 = findViewById(R.id.content2);
        rippleBackground1.startRippleAnimation();


        centerImage = findViewById(R.id.centerImage);
        centerImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onoff == true) {
                    rippleBackground2.stopRippleAnimation();
                    onoff = false;
                } else {
                    rippleBackground2.startRippleAnimation();
                    onoff = true;
                }
            }
        });


        centerImage2 = findViewById(R.id.centerImage2);
        centerImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (onoff == true) {
                    rippleBackground1.stopRippleAnimation();
                    onoff = false;

                } else {
                    rippleBackground1.startRippleAnimation();
                    onoff = true;

                }
            }
        });
//        final RippleBackground rippleBackground1=(RippleBackground)findViewById(R.id.content);
//        ImageView imageView1=(ImageView)findViewById(R.id.centerImage);
//        imageView1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });


//        final RippleBackground rippleBackground2=(RippleBackground)findViewById(R.id.content2);
//        ImageView imageView2=(ImageView)findViewById(R.id.centerImage2);
//        imageView2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                rippleBackground2.startRippleAnimation();
//
//
//            }
//        });

    }
}
