package com.example.a022_recyclerdelete;

import com.example.a022_recyclerdelete.R;

import java.util.ArrayList;
import java.util.List;

public class Datos {


    String nombre;
    String descripcion;
    int imagen;
    public Datos(String n, String d,int i){
        this.nombre=n;
        this.descripcion=d;
        this.imagen=i;


    }

    public static List<Datos>poblardatos(){
        List<Datos>lista= new ArrayList<>();
        for (int i=0;i<=16;i++){
            int avatar= R.drawable.avatar_1;

            Datos datos= new Datos(" pais "+i," descripcion "+1,+avatar+i);

            lista.add(datos);


        }
        return lista;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}