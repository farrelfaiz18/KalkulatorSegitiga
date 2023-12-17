package com.example.segitiga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Segitiga_Sembarang2 extends AppCompatActivity {
    private Button kelilingButton;
    private Button luasButton;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga_sembarang2);

        kelilingButton = findViewById(R.id.buttonKeliling);
        luasButton = findViewById(R.id.buttonLuas);
        backButton = findViewById(R.id.backButton);

        kelilingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Segitiga_Sembarang2.this, KelilingSegitigaSembarang2.class);
                startActivity(intent);
            }
        });

        luasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Segitiga_Sembarang2.this, LuasSegitigaSembarang2.class);
                startActivity(intent);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Segitiga_Sembarang2.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
