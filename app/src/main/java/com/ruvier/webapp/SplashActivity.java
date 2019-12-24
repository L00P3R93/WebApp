package com.ruvier.webapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.ruvier.webapp.R;

public class SplashActivity extends AppCompatActivity {

    private ImageView logo;
    private static int splashTimeOut = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        logo = findViewById(R.id.logo);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, splashTimeOut);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.splashanimation);
        logo.startAnimation(animation);
    }
}
