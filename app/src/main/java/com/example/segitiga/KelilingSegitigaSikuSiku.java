package com.example.segitiga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KelilingSegitigaSikuSiku extends AppCompatActivity {

    private EditText editTextSisi1;
    private EditText editTextSisi2;
    private EditText editTextSisi3;
    private Button buttonHitung;
    private TextView editTextHasil;

    private Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_segitiga_sama_kaki);

        editTextSisi1 = findViewById(R.id.editTextSisi1);
        editTextSisi2 = findViewById(R.id.editTextSisi2);
        editTextSisi3 = findViewById(R.id.editTextSisi3);
        buttonHitung = findViewById(R.id.buttonHitung);
        editTextHasil = findViewById(R.id.editTextHasil);
        backButton = findViewById(R.id.backButton);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sisi1Str = editTextSisi1.getText().toString();
                String sisi2Str = editTextSisi2.getText().toString();
                String sisi3Str = editTextSisi3.getText().toString();

                if (sisi1Str.isEmpty() && sisi2Str.isEmpty() && sisi3Str.isEmpty()) {
                    Toast.makeText(KelilingSegitigaSikuSiku.this, "Harap isi semua sisi!", Toast.LENGTH_LONG).show();
                } else if (sisi1Str.isEmpty()) {
                    if (sisi2Str.isEmpty() && sisi3Str.isEmpty()) {
                        Toast.makeText(KelilingSegitigaSikuSiku.this, "Harap isi sisi 1, 2, dan 3", Toast.LENGTH_LONG).show();
                    } else if (sisi2Str.isEmpty()) {
                        Toast.makeText(KelilingSegitigaSikuSiku.this, "Harap isi sisi 1 dan sisi 2", Toast.LENGTH_LONG).show();
                    } else if (sisi3Str.isEmpty()) {
                        Toast.makeText(KelilingSegitigaSikuSiku.this, "Harap isi sisi 1 dan sisi 3", Toast.LENGTH_LONG).show();
                    }
                } else if (sisi2Str.isEmpty()) {
                    if (sisi3Str.isEmpty()) {
                        Toast.makeText(KelilingSegitigaSikuSiku.this, "Harap isi sisi 2 dan 3", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(KelilingSegitigaSikuSiku.this, "Harap isi sisi 2", Toast.LENGTH_LONG).show();
                    }
                } else if (sisi3Str.isEmpty()) {
                    Toast.makeText(KelilingSegitigaSikuSiku.this, "Harap isi sisi 3", Toast.LENGTH_LONG).show();
                } else {
                    // Semua input telah diisi, lanjutkan perhitungan
                    double sisi1 = Double.parseDouble(sisi1Str);
                    double sisi2 = Double.parseDouble(sisi2Str);
                    double sisi3 = Double.parseDouble(sisi3Str);

                    double keliling = sisi1 + sisi2 + sisi3;

                    editTextHasil.setText(String.valueOf(keliling));
                    editTextSisi1.setText("");
                    editTextSisi2.setText("");
                    editTextSisi3.setText("");

                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);

                    // Menyembunyikan keyboard
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
            }
        });


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(KelilingSegitigaSikuSiku.this, Segitiga_Siku_Siku.class);
                startActivity(intent);
            }
        });

    }
}