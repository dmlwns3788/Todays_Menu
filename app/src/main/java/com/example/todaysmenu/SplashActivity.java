package com.example.todaysmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.todaysmenu.MainActivity;

public class SplashActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Thread.sleep(2000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }

}
