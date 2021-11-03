package com.example.labmpr2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class luasPersegiPanjang extends AppCompatActivity {

    Button btnResult;
    EditText inputPanjang, inputLebar;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi_panjang);

        inputPanjang = findViewById(R.id.inputPanjang);
        inputLebar = findViewById(R.id.inputLebar);
        result = findViewById(R.id.result);
        btnResult = findViewById(R.id.buttonResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                luas();
            }
        });
    }

    public void luas() {
        double panjang = Double.parseDouble(inputPanjang.getText().toString());
        double lebar = Double.parseDouble(inputLebar.getText().toString());
        double hasil = panjang * lebar;
        String output = String.valueOf(hasil);
        result.setText("Luas Persegi Panjang: " + output);
    }
}