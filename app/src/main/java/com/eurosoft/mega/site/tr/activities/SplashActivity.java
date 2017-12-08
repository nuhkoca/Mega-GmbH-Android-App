package com.eurosoft.mega.site.tr.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.eurosoft.mega.site.tr.MainActivity;
import com.eurosoft.mega.site.tr.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
        mainIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(mainIntent);
            }
        }, 2500);
    }
}
