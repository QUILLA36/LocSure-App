package com.example.locsure;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class registpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registpage);

        // Add a click listener or any trigger event that signifies the user wants to go to the login page
        // For example, you can use a button click event

        // Assuming you have a button with ID "loginButton" in your XML layout
        // and you want to switch to the LoginActivity when the button is clicked
        findViewById(R.id.registbutton2).setOnClickListener(view -> {
            // Create an Intent to switch to the LoginActivity
            Intent intent = new Intent(registpage.this, login.class);

            // Start the LoginActivity
            startActivity(intent);
        });

        // Ambil referensi ke ImageButton
        ImageButton googleButton = findViewById(R.id.imageButton24);

        // Tambahkan OnClickListener ke ImageButton
        googleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent untuk membuka akun Google
                openGoogleAccount();
            }
        });
    }

    private void openGoogleAccount() {
        // Intent untuk membuka akun Google menggunakan aplikasi browser
        Uri uri = Uri.parse("https://accounts.google.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
