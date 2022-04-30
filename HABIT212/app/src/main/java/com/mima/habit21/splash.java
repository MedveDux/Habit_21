package com.mima.habit21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {
    public int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash); // подгрузка изначального экрана
        //getSupportActionBar().hide();

//        final Intent i = new Intent(SplashActivity.this, MainActivity.class);
        final Intent i;
        if (flag == 0) {
            i = new Intent(splash.this, MainActivity.class);
        }
        else {
            i = new Intent(splash.this, MainActivity.class);
        }
        if (flag == 2)
            flag = 1;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(i);
                finish();
            }
        },1000);
    }
}