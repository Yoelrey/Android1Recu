package com.example.a2a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class EquipoAdapter extends RecyclerView.Adapter<EquipoAdapter.EquipoViewHolder> {
    private List<Equipo> equipos;
    private static LayoutInflater layoutInflater;




    public static class EquipoViewHolder extends RecyclerView.ViewHolder {
        public TextView nombre;
        public TextView ciudad;
        public TextView pais;
        public TextView anho;
        public ImageView escudo;

        public EquipoViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.nombre);
            ciudad = itemView.findViewById(R.id.ciudad);
            pais = itemView.findViewById(R.id.pais);
            anho = itemView.findViewById(R.id.anho);
            escudo = itemView.findViewById(R.id.escudo);

            // Agregamos el listener en el constructor del ViewHolder

        }
    }

    public EquipoAdapter(List<Equipo> equipos, LayoutInflater layoutInflate) {
        this.equipos = equipos;
        this.layoutInflater=layoutInflate;
    }



    public EquipoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.element, parent, false);
        return new EquipoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull EquipoViewHolder holder, int position) {
        Equipo equipo = equipos.get(position);
        holder.nombre.setText(equipo.getNombre());
        holder.ciudad.setText(equipo.getCiudad());
        holder.pais.setText(equipo.getPais());
        holder.anho.setText(equipo.getAnho());
        holder.escudo.setImageResource(equipo.getEscudo());
    }

    @Override
    public int getItemCount() {
        return equipos.size();
    }


}
