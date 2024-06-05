package com.example.a010activityswicht;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button boton;
    ImageView imageView;
    @SuppressLint("MissingInflatedId")
    public void onCreate(Bundle save) {

        super.onCreate(save);

        setContentView(R.layout.activity_second);

        boton = findViewById(R.id.boton2);
        boton.setOnClickListener(v -> onClickViewClose(v));

        imageView= findViewById(R.id.imageView2);
        imageView.setOnClickListener(v -> regresar(v));
    }

    public void onClickViewClose(View view){
        finish();
    }

    public void regresar(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
