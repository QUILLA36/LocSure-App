package com.example.locsure;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Ambil referensi ke ImageButton menufill1
        ImageButton menufill1Button = findViewById(R.id.menufill1btn);

        // Tambahkan OnClickListener ke ImageButton menufill1
        menufill1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent ke halaman myprofile
                Intent intent = new Intent(menu.this, myprofile.class);
                startActivity(intent);
            }
        });

        // Ambil referensi ke ImageButton menufill2btn
        ImageButton menufill2Button = findViewById(R.id.menufill2btn);

        // Tambahkan OnClickListener ke ImageButton menufill2btn
        menufill2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent ke halaman bookmarkpage
                Intent intent = new Intent(menu.this, bookmark.class);
                startActivity(intent);
            }
        });

        // Ambil referensi ke ImageButton menufill3btn
        ImageButton menufill3Button = findViewById(R.id.menufill3btn);

        // Tambahkan OnClickListener ke ImageButton menufill3btn
        menufill3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent ke halaman language
                Intent intent = new Intent(menu.this, languageset.class);
                startActivity(intent);
            }
        });

        // Ambil referensi ke ImageButton menufill4btn
        ImageButton menufill4Button = findViewById(R.id.menufill4btn);

        // Tambahkan OnClickListener ke ImageButton menufill4btn
        menufill4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent ke halaman logout
                Intent intent = new Intent(menu.this, LogoutActivity.class);
                startActivity(intent);
            }
        });

        // Ambil referensi ke ImageButton menufill5btn
        ImageButton menufill5Button = findViewById(R.id.menufill5btn);

        // Tambahkan OnClickListener ke ImageButton menufill5btn
        menufill5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent ke halaman delete account
                Intent intent = new Intent(menu.this, DeleteAccountActivity.class);
                startActivity(intent);
            }
        });
    }
}
