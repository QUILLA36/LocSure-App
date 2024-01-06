package com.example.locsure;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class WelcomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomepage);

        ImageButton imageButtonRegister = findViewById(R.id.registbutton1);
        ImageButton imageButtonLogin = findViewById(R.id.loginbutton1);

        imageButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    // Create Intent to switch to RegistPageActivity
                    Intent intent = new Intent(WelcomePageActivity.this, registpage.class);

                    // Start the new activity
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        imageButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    // Create Intent to switch to LoginPageActivity
                    Intent intent = new Intent(WelcomePageActivity.this, login.class);

                    // Start the new activity
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}



