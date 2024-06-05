package com.example.a06webwiew;

import android.os.Bundle;
import android.webkit.WebView; // Importa la clase WebView correctamente

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView; // Corrige el nombre de la variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webView); // Corrige el nombre de la variable
        webView.loadUrl("https://www.cebem.net/index.php/es/");
    }
}
