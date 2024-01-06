package com.example.locsure;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.cardview.widget.CardView;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        // Ambil referensi ke CardView borobudur
        CardView borobudurCardView = findViewById(R.id.borobudur);

        // Tambahkan OnClickListener ke CardView
        borobudurCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent ke halaman deskripsi (gantilah DescriptionPageActivity.class dengan kelas yang sesuai)
                Intent intent = new Intent(homepage.this, descriptionpage.class);
                startActivity(intent);
            }
        });

        // Ambil referensi ke ImageButton eventbtn
        ImageButton eventButton = findViewById(R.id.eventbtn);

        // Tambahkan OnClickListener ke ImageButton eventbtn
        eventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent ke halaman eventpage (gantilah EventPageActivity.class dengan kelas yang sesuai)
                Intent intent = new Intent(homepage.this, event.class);
                startActivity(intent);
            }
        });

        // Ambil referensi ke ImageButton walletbtn
        ImageButton walletButton = findViewById(R.id.walletbtn);

        // Tambahkan OnClickListener ke ImageButton walletbtn
        walletButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent ke halaman payment (gantilah PaymentActivity.class dengan kelas yang sesuai)
                Intent intent = new Intent(homepage.this, payment.class);
                startActivity(intent);
            }
        });

        // Ambil referensi ke ImageButton calendarbtn
        ImageButton calendarButton = findViewById(R.id.calendarbtn);

        // Tambahkan OnClickListener ke ImageButton calendarbtn
        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent ke halaman calendar (gantilah CalendarActivity.class dengan kelas yang sesuai)
                Intent intent = new Intent(homepage.this, calendar.class);
                startActivity(intent);
            }
        });

        // Ambil referensi ke ImageButton menubtn
        ImageButton menuButton = findViewById(R.id.menubtn);

        // Tambahkan OnClickListener ke ImageButton menubtn
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent ke halaman menu (gantilah MenuActivity.class dengan kelas yang sesuai)
                Intent intent = new Intent(homepage.this, menu.class);
                startActivity(intent);
            }
        });
    }
}
