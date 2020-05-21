package com.example.samratritwik.sit;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NBAActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nba);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent SmashIntent = new Intent(NBAActivity.this,GridviewActivity.class);
                startActivity(SmashIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
