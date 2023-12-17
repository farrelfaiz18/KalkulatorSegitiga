package com.example.segitiga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    // Mendeklarasikan ImageView untuk setiap jenis segitiga
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Mengatur tata letak untuk aktivitas utama
        setContentView(R.layout.activity_home);

        // Menghubungkan ImageView dengan elemen di layout XML
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);

        // Memberikan fungsi OnClickListener untuk setiap ImageView
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat intent untuk berpindah ke aktivitas Segitiga_Sama_Kaki
                Intent intent = new Intent(HomeActivity.this, Segitiga_Sama_Kaki.class);
                startActivity(intent);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat intent untuk berpindah ke aktivitas Segitiga_Sama_Sisi
                Intent intent = new Intent(HomeActivity.this, Segitiga_Sama_Sisi.class);
                startActivity(intent);
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat intent untuk berpindah ke aktivitas Segitiga_Siku_Siku
                Intent intent = new Intent(HomeActivity.this, Segitiga_Siku_Siku.class);
                startActivity(intent);
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat intent untuk berpindah ke aktivitas Segitiga_Sembarang1
                Intent intent = new Intent(HomeActivity.this, Segitiga_Sembarang1.class);
                startActivity(intent);
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat intent untuk berpindah ke aktivitas Segitiga_Sembarang2
                Intent intent = new Intent(HomeActivity.this, Segitiga_Sembarang2.class);
                startActivity(intent);
            }
        });
    }
}
