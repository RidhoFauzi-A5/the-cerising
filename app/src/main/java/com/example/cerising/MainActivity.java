package com.example.cerising;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSpiderman = findViewById(R.id.btnSpiderman);
        Button btnIronMan = findViewById(R.id.btnIronMan);
        Button btnHulk = findViewById(R.id.btnHulk);

        btnSpiderman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SpidermanDetailActivity.class);
                startActivity(intent);
            }
        });

        btnIronMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IronmanDetailActivity.class);
                startActivity(intent);
            }
        });

        btnHulk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HulkDetailActivity.class);
                startActivity(intent);
            }
        });
    }
}
