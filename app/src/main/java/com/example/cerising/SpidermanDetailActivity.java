package com.example.cerising;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class SpidermanDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiderman_detail);
    }


    public void goBackToHome(View view) {
        Intent intent = new Intent(SpidermanDetailActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
