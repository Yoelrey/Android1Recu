package com.example.a09activitystarter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button mButton;
    Button miBoton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.boton);
        miBoton2 = findViewById(R.id.boton2);

        mButton.setOnClickListener(v -> lanzarAplicacion());

        miBoton2.setOnClickListener(v -> mandarMensaje());
    }

    public void lanzarAplicacion() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.cebem.net"));
        startActivity(intent);
    }

    public void mandarMensaje() {
        String textMessage = "esto es un mensaje";
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.putExtra("address", "123456789");
        sendIntent.putExtra(Intent.EXTRA_TEXT, textMessage);
        sendIntent.setType("text/plain");

        // Verificar que la intención se pueda resolver a una actividad
        if (sendIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(sendIntent);
        }
    }
}
