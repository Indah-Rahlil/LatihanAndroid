package com.example.latihanandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {

    EditText angka;
    EditText angka2;
    Spinner aritmatika;
    TextView hasil;
    Button hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        angka = findViewById(R.id.angka);
        angka2 = findViewById(R.id.angka2);
        aritmatika = findViewById(R.id.aritmatika);
        hasil = findViewById(R.id.hasil);
        hitung = findViewById(R.id.hitung);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Int = aritmatika.getSelectedItem().toString();
                String angka1 = angka.getText().toString();
                String angka22 = angka2.getText().toString();
                int Angka1 = Integer.parseInt(angka1);
                int Angka2 = Integer.parseInt(angka22);
                int Hasil = 0;
                switch (Int){
                    case "Penjumlahan" :
                        int jumlah = Angka1 + Angka2;
                        hasil.setText(jumlah + "");
                        break;

                    case "Pengurangan" :
                        int kurang = Angka1 - Angka2;
                        hasil.setText(kurang + "");
                        break;

                    case "Perkalian" :
                        int kali = Angka1 * Angka2;
                        hasil.setText(kali + "");
                        break;

                    case "Pembagian" :
                        double Angkadoub = Double.parseDouble(angka.getText().toString());
                        double Angkadoub2 = Double.parseDouble(angka2.getText().toString());
                        double bagi = Angkadoub / Angkadoub2;
                        hasil.setText(bagi + "");
                        break;
                }
            }
        });
    }
}