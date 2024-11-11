package com.example.cerising;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class IronmanDetailActivity extends AppCompatActivity { // Nama kelas sesuai dengan nama file
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ironman_detail);
    }

    // Method untuk kembali ke MainActivity
    public void goBackToHome(View view) {
        Intent intent = new Intent(IronmanDetailActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
