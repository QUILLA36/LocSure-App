// src/main/java/com/example/locsure/DeleteAccountActivity.java
package com.example.locsure;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DeleteAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_account);

        // Ambil referensi ke ImageButton del
        ImageButton delButton = findViewById(R.id.del);

        // Tambahkan OnClickListener ke ImageButton del
        delButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent ke halaman welcomepage
                Intent intent = new Intent(DeleteAccountActivity.this, WelcomePageActivity.class);
                startActivity(intent);

                // Tutup activity saat ini (DeleteAccountActivity)
                finish();
            }
        });
    }
}
