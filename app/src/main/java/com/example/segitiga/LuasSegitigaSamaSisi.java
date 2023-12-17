package com.example.segitiga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LuasSegitigaSamaSisi extends AppCompatActivity {

    private EditText editTextAlas;
    private EditText editTextTinggi;
    private Button buttonHitung;
    private EditText editTextHasil;
    private Button backButton;

    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga_sama_sisi);

        editTextAlas = findViewById(R.id.editTextAlas);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        buttonHitung = findViewById(R.id.buttonHitung);
        editTextHasil = findViewById(R.id.editTextHasil);
        backButton = findViewById(R.id.backButton);
        nextButton = findViewById(R.id.nextButton);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alasStr = editTextAlas.getText().toString();
                String tinggiStr = editTextTinggi.getText().toString();

                // Memeriksa apakah input valid (bukan string kosong)
                if (!alasStr.isEmpty() && !tinggiStr.isEmpty()) {
                    // Mengonversi input menjadi bilangan desimal
                    double alas = Double.parseDouble(alasStr);
                    double tinggi = Double.parseDouble(tinggiStr);

                    // Melakukan perhitungan luas segitiga
                    double luas = 0.5 * alas * tinggi;

                    // Menampilkan hasil perhitungan pada EditTextHasil
                    editTextHasil.setText(String.valueOf(luas));

                    editTextAlas.setText("");
                    editTextTinggi.setText("");

                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);

                    // Menyembunyikan keyboard
                    imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                } else {
                    // Jika input kosong, tampilkan pesan kesalahan dengan Toast
                    if (alasStr.isEmpty() && tinggiStr.isEmpty()) {
                        Toast.makeText(getApplicationContext(), "Masukkan alas dan tinggi terlebih dahulu.", Toast.LENGTH_SHORT).show();
                    } else if (alasStr.isEmpty()) {
                        Toast.makeText(getApplicationContext(), "Masukkan alas terlebih dahulu.", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Masukkan tinggi terlebih dahulu.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LuasSegitigaSamaSisi.this, Segitiga_Sama_Sisi.class);
                startActivity(intent);
            }
        });
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LuasSegitigaSamaSisi.this, KelilingSegitigaSamaSisi.class);
                startActivity(intent);
            }
        });
    }
}