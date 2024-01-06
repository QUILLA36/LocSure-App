package com.example.locsure;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.locsure.WelcomePageActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Delay for 2000 milliseconds (2 seconds) and then launch the WelcomePageActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, WelcomePageActivity.class);
                startActivity(intent);
                finish(); // Finish the current activity so that the user cannot go back to the splash screen
            }
        }, 2000);
    }
}
