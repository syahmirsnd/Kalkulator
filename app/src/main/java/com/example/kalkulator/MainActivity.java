package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText b1,b2;
    TextView r;
    Button tmbplus;
    Button tmbmin;
    Button tmbkali;
    Button tmbbagi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (EditText) findViewById(R.id.etbil01);
        b2 = (EditText) findViewById(R.id.etbil02);
        r = (TextView) findViewById(R.id.tv_hasil);
        tmbplus =(Button) findViewById(R.id.btn_plus);
        tmbmin =(Button) findViewById(R.id.btn_min);
        tmbkali =(Button) findViewById(R.id.btn_kali);
        tmbbagi =(Button) findViewById(R.id.btn_bagi);

    }

    public void aksiJumlah(View v){
        Integer c,a,b;
        a = Integer.parseInt(b1.getText().toString());
        b = Integer.parseInt(b2.getText().toString());
        c = a+b;
        tmbplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r.setText(String.valueOf(c));
            Toast.makeText(MainActivity.this, "Hasil dari "+a+" + "+b+" adalah "+c, Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void aksiKurang(View v){
        Integer c,a,b;
        a = Integer.parseInt(b1.getText().toString());
        b = Integer.parseInt(b2.getText().toString());
        c = a-b;
        tmbmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s;
                s = b1.getText().toString();
                r.setText(String.valueOf(c));
                Toast.makeText(MainActivity.this, "Hasil dari "+a+" - "+b+" adalah "+c, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void aksiKali(View v){
        Integer c,a,b;
        a = Integer.parseInt(b1.getText().toString());
        b = Integer.parseInt(b2.getText().toString());
        c = a*b;
            tmbkali.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String s;
                    s = b1.getText().toString();
                    r.setText(String.valueOf(c));
                    Toast.makeText(MainActivity.this, "Hasil dari "+a+" x "+b+" adalah "+c, Toast.LENGTH_SHORT).show();
                }
            });
    }
    public void aksiBagi(View v){
        Integer c,a,b;
        a = Integer.parseInt(b1.getText().toString());
        b = Integer.parseInt(b2.getText().toString());
        c = a/b;

        tmbbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s;
                s = b1.getText().toString();
                r.setText(String.valueOf(c));
                Toast.makeText(MainActivity.this, "Hasil dari "+a+" ÷ "+b+" adalah "+c, Toast.LENGTH_SHORT).show();
            }
        });
    }}
