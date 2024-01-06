package com.example.locsure;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LogoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        // Ambil referensi ke ImageView logoutbtn
        ImageView logoutImageView = findViewById(R.id.logoutbtn);

        // Tambahkan OnClickListener ke ImageView logoutbtn
        logoutImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent ke halaman login
                Intent intent = new Intent(LogoutActivity.this, login.class);
                startActivity(intent);

                // Tutup activity saat ini (LogoutActivity)
                finish();
            }
        });
    }
}