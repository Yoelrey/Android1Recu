package com.example.a012_operacionesaritmeticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView num1;
    TextView num2;
    Integer result = 0;
    Button sumar;
    Button restar;
    Button multiplicar;
    Button dividir;
    String texto1;
    String texto2;

    public void show() {
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        Bundle arrive = getIntent().getExtras();
        texto1 = arrive.getString("n1");
        texto2 = arrive.getString("n2");

        num1.setText(texto1);
        num2.setText(texto2);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        show();

        sumar = findViewById(R.id.sumar);
        sumar.setOnClickListener(view -> onClick(view));

        restar = findViewById(R.id.restar);
        restar.setOnClickListener(view -> onClick(view));

        multiplicar = findViewById(R.id.multiplicar);
        multiplicar.setOnClickListener(view -> onClick(view));

        dividir = findViewById(R.id.dividir);
        dividir.setOnClickListener(view -> onClick(view));
    }

    // Alternative to code 4 different methods
    public void onClick(View view) {


        if (view.getId() == R.id.sumar) {
            result = Integer.parseInt(texto1.toString()) + Integer.parseInt(texto2.toString());
        }

        if (view.getId() == R.id.restar) {
            result = Integer.parseInt(texto1.toString()) - Integer.parseInt(texto2.toString());
        }

        if (view.getId() == R.id.multiplicar) {
            result = Integer.parseInt(texto1.toString()) * Integer.parseInt(texto2.toString());
        }

        if (view.getId() == R.id.dividir) {
            if  (Integer.parseInt(texto2.toString())==0) {
                int i = Integer.parseInt(texto2.toString()) + 1;
                result = Integer.parseInt(texto1.toString()) / i;
           }else{
               result = Integer.parseInt(texto1.toString()) / Integer.parseInt(texto2.toString());
           }
        }
        Intent returnIntent = new Intent(this, MainActivity.class);
        returnIntent.putExtra(MainActivity.REQUEST_RESULT, String.valueOf(result));
        setResult(RESULT_OK, returnIntent);

        finish();
    }


}