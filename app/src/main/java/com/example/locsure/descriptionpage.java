package com.example.locsure;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class descriptionpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descriptionpage);

        // Ambil referensi ke TextView routes
        TextView routesTextView = findViewById(R.id.textView17);

        // Tambahkan OnClickListener ke TextView
        routesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent untuk membuka MapsActivity
                Intent intent = new Intent(descriptionpage.this, maps.class);
                startActivity(intent);
            }
        });

        // Ambil referensi ke ImageButton bookmarkButton
        ImageButton bookmarkButton = findViewById(R.id.imageButton15);

        // Tambahkan OnClickListener ke ImageButton
        bookmarkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent untuk membuka BookmarkActivity
                Intent intent = new Intent(descriptionpage.this, bookmark.class);
                startActivity(intent);
            }
        });
    }
}
