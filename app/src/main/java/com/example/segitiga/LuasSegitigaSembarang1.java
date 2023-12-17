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

public class LuasSegitigaSembarang1 extends AppCompatActivity {

    private EditText editTextSisi1, editTextSisi2, editTextSisi3, editTextHasil;
    private Button buttonHitung, backButton;
    private Button nextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga_sembarang1);

        // Inisialisasi elemen view
        editTextSisi1 = findViewById(R.id.editTextSisi1);
        editTextSisi2 = findViewById(R.id.editTextSisi2);
        editTextSisi3 = findViewById(R.id.editTextSisi3);
        editTextHasil = findViewById(R.id.editTextHasil);
        buttonHitung = findViewById(R.id.buttonHitung);
        backButton = findViewById(R.id.backButton);
        nextButton = findViewById(R.id.nextButton);

        // Menambahkan onClickListener untuk tombol Hitung
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sisi1Str = editTextSisi1.getText().toString();
                String sisi2Str = editTextSisi2.getText().toString();
                String sisi3Str = editTextSisi3.getText().toString();

                // Memeriksa apakah input kosong
                if (sisi1Str.isEmpty() || sisi2Str.isEmpty() || sisi3Str.isEmpty()) {
                    Toast.makeText(LuasSegitigaSembarang1.this, "Harap isi semua sisi segitiga", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Mengubah input menjadi angka float
                float sisi1 = Float.parseFloat(sisi1Str);
                float sisi2 = Float.parseFloat(sisi2Str);
                float sisi3 = Float.parseFloat(sisi3Str);

                // Menghitung setengah keliling segitiga (s)
                float s = (sisi1 + sisi2 + sisi3) / 2;

                // Menghitung luas segitiga menggunakan rumus Heron
                double luas = Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));

                // Menampilkan hasil di EditText
                editTextHasil.setText(String.format("%.2f", luas));
                editTextSisi1.setText("");
                editTextSisi2.setText("");
                editTextSisi3.setText("");

                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);

                // Menyembunyikan keyboard
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        });

        // Menambahkan onClickListener untuk tombol Back
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); // Kembali ke layar sebelumnya
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LuasSegitigaSembarang1.this, KelilingSegitigaSembarang1.class);
                startActivity(intent);
            }
        });
    }
}
