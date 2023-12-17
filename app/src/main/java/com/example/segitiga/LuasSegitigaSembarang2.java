package com.example.segitiga;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class LuasSegitigaSembarang2 extends AppCompatActivity {

    private EditText editTextSisi1, editTextSisi2, editTextSudut, editTextHasil;
    private Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga_sembarang2);

        editTextSisi1 = findViewById(R.id.editTextSisi1);
        editTextSisi2 = findViewById(R.id.editTextSisi2);
        editTextSudut = findViewById(R.id.editTextSudut);
        editTextHasil = findViewById(R.id.editTextHasil);
        buttonHitung = findViewById(R.id.buttonHitung);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasSegitiga();
            }
        });
    }

    private void hitungLuasSegitiga() {
        String sisi1Str = editTextSisi1.getText().toString();
        String sisi2Str = editTextSisi2.getText().toString();
        String sudutStr = editTextSudut.getText().toString();

        if (sisi1Str.isEmpty()) {
            if (sisi2Str.isEmpty() && sudutStr.isEmpty()) {
                Toast.makeText(this, "Harap isi Sisi 1, Sisi 2, dan Sudut.", Toast.LENGTH_LONG).show();
            } else if (sisi2Str.isEmpty()) {
                Toast.makeText(this, "Harap isi Sisi 1 dan Sisi 2.", Toast.LENGTH_LONG).show();
            } else if (sudutStr.isEmpty()) {
                Toast.makeText(this, "Harap isi Sisi 1 dan Sudut.", Toast.LENGTH_LONG).show();
            }
        } else if (sisi2Str.isEmpty()) {
            if (sudutStr.isEmpty()) {
                Toast.makeText(this, "Harap isi Sisi 2 dan Sudut.", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Harap isi Sisi 2.", Toast.LENGTH_LONG).show();
            }
        } else if (sudutStr.isEmpty()) {
            Toast.makeText(this, "Harap isi Sudut.", Toast.LENGTH_LONG).show();
        } else {

                double sisi1 = Double.parseDouble(sisi1Str);
                double sisi2 = Double.parseDouble(sisi2Str);
                double sudut = Double.parseDouble(sudutStr);

                double sudutRadian = Math.toRadians(sudut);
                double luas = 0.5 * sisi1 * sisi2 * Math.sin(sudutRadian);

                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                editTextHasil.setText(decimalFormat.format(luas));
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);


        }
    }
}