package com.example.labmpr2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText alas, tinggi;
    Button btnResult;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alas = findViewById(R.id.inputAlas);
        tinggi = findViewById(R.id.inputTinggi);
        btnResult = findViewById(R.id.buttonResult);
        hasil = findViewById(R.id.result);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                luasSegitiga();
            }
        });
    }

    public void luasSegitiga() {
        double inputAlas = Double.parseDouble(alas.getText().toString());
        double inputTinggi = Double.parseDouble(tinggi.getText().toString());
        double goal = 0.5 * inputAlas * inputTinggi;
        String output = String.valueOf(goal);
        hasil.setText("Luas Segitiga: " + output.toString());
    }
}