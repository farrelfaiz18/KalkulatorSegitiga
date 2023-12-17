package com.example.segitiga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Segitiga_Sembarang1 extends AppCompatActivity {
    private Button kelilingButton;
    private Button luasButton;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga_sembarang1);

        kelilingButton = findViewById(R.id.buttonKeliling);
        luasButton = findViewById(R.id.buttonLuas);
        backButton = findViewById(R.id.backButton);

        kelilingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Segitiga_Sembarang1.this, KelilingSegitigaSembarang1.class);
                startActivity(intent);
            }
        });

        luasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Segitiga_Sembarang1.this, LuasSegitigaSembarang1.class);
                startActivity(intent);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Segitiga_Sembarang1.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
