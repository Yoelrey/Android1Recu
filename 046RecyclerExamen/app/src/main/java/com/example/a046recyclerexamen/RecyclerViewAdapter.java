package com.example.a046recyclerexamen;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private List<Equipo> equipos;
    private LayoutInflater layoutInflater;
    private OnItemClickListener listener;

    public RecyclerViewAdapter(Context context, List<Equipo> equipos) {
        this.layoutInflater = LayoutInflater.from(context);
        this.equipos = equipos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.element, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Equipo equipo = equipos.get(position);

        holder.imageView.setImageResource(equipo.getEscudo());
        holder.ciudad.setText(equipo.getCiudad());
        holder.nombre.setText(equipo.getNombre());
        holder.pais.setText(equipo.getPais());
        holder.anho.setText(equipo.getAnho());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onItemClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return equipos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView ciudad, nombre, pais, anho;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.escudo);
            ciudad = itemView.findViewById(R.id.ciudad);
            nombre = itemView.findViewById(R.id.nombre);
            pais = itemView.findViewById(R.id.pais);
            anho = itemView.findViewById(R.id.anho);
        }
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public Equipo getItem(int position) {
        return equipos.get(position);
    }
}
