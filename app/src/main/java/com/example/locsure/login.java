package com.example.locsure;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageButton homeButton = findViewById(R.id.loginbtn2);

        homeButton.setOnClickListener(view -> {
            Intent intent = new Intent(login.this, homepage.class);

            startActivity(intent);
        });
    }
}
