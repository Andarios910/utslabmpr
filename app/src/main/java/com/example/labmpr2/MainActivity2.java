package com.example.labmpr2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button btnSegitiga, btnPersegi;
    TextView saveText;
    private String nama;
    private String KEY_NAME = "NAMA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnSegitiga = findViewById(R.id.btnSegitiga);
        btnPersegi = findViewById(R.id.btnPersegi);
        saveText = findViewById(R.id.saveText);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        saveText.setText("Selamat Datang, " + nama + " !");

        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                halamanSegitiga();
            }
        });

        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                halamanPersegi();
            }
        });
    }

    public void halamanSegitiga() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void halamanPersegi() {
        Intent i = new Intent(this, luasPersegiPanjang.class);
        startActivity(i);
    }
}