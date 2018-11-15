package com.example.wolfsoft3.dating_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash__screen);
        Thread background = new Thread()
        {
            public void run()
            {
                try
                {
                    // Thread will sleep for 5 seconds
                    sleep(2*1000);
                    Intent intent = new Intent(Splash_Screen.this,Login.class);
                    startActivity(intent);

                    // After 5 seconds redirect to another intent



                    //Remove activity
                    finish();

                }catch (Exception e)
                {

                }

            }
        };

        // start thread
        background.start();
    }
    protected void OnDestroy()
    {
        super.onDestroy();
    }
}
