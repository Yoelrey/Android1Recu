package com.example.a08primos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    final static Integer []primos={2, 3 ,5 ,7, 11, 13, 17, 19, 23 ,29 ,31 ,37 ,41 ,43 ,47 ,53, 59, 61, 67, 71,73, 79, 83, 89 ,97 ,
            101, 103, 107 ,109 ,113, 127, 131 ,137, 139, 149, 151, 157, 163, 167, 173,
            179 ,181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281,
            283 ,293 ,307, 311 ,313 ,317, 331 ,337 ,347, 349 ,353, 359 ,367, 373, 379, 383, 389 ,397 ,401 ,409};

    EditText editText;
    TextView mTextView;
    Button mibutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.numero);
        mTextView=findViewById(R.id.resultado);
        mibutton=findViewById(R.id.calcular);
        mibutton.setOnClickListener(View ->prim(View));


    }

    public void prim(View view){
        try {
            Integer numero = Integer.parseInt(editText.getText().toString());

            if(numero >= 0 && numero < primos.length){
                Integer numerosPrimos  = primos[numero];
                mTextView.setText(String.valueOf(numerosPrimos));
            } else {
                mTextView.setText("Número fuera del rango");
            }
        } catch (NumberFormatException e) {
            mTextView.setText("Número inválido");
        }
    }

}