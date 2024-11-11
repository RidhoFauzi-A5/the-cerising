package com.example.cerising;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Menampilkan logo pada ImageView
        ImageView logo = findViewById(R.id.logo);

        // Menggunakan animasi fade-in dan scale pada logo
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.logo_fade_in);
        Animation scale = AnimationUtils.loadAnimation(this, R.anim.logo_scale);

        // Memulai animasi fade-in dan scale bersamaan pada logo
        logo.startAnimation(fadeIn);
        logo.startAnimation(scale);

        // Handler untuk berpindah ke MainActivity setelah animasi selesai
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Intent untuk pindah ke MainActivity setelah splash screen
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Menutup SplashActivity agar tidak bisa kembali ke layar splash
            }
        }, 2000); // Durasi splash screen selama 2 detik (untuk memberi waktu animasi)
    }
}
