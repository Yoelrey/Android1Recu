package com.example.a046recyclerexamen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Equipo> equipos = teamList();
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, equipos); // Corrección: equipos en lugar de Equipo
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(this);
    }

    public ArrayList<Equipo> teamList() {
        ArrayList<Equipo> equipos = new ArrayList<>();
        equipos.add(new Equipo("Francia", "Paris", "68042591", "675417", R.drawable.francia));
        equipos.add(new Equipo("Alemania", "Berlin", "84270625", "35375", R.drawable.alemania));
        equipos.add(new Equipo("Grecia", "Atenas", "10432481", "131957", R.drawable.grecia));
        equipos.add(new Equipo("Italia", "Roma", "58870764", "301340", R.drawable.italia));
        equipos.add(new Equipo("Portugal", "Lisboa", "10352042", "92212", R.drawable.portugal));
        return equipos;
    }


    public void onItemClick(int position) {
        // Obtenemos la referencia al RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        // Obtenemos el adaptador del RecyclerView
        RecyclerViewAdapter adapter = (RecyclerViewAdapter) recyclerView.getAdapter();
        // Obtenemos la referencia al equipo seleccionado
        Equipo equipo = adapter.getItem(position);

        // Actualizamos la vista con los detalles del equipo seleccionado
        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.textView);
        textView.setText(equipo.getNombre());
        imageView.setImageResource(equipo.getEscudo());
    }
}
