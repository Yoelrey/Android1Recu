package com.example.a021_imgrecyclerview;

import android.content.Context;
import android.media.Image;

import com.example.a021_imgrecyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class Datos {

    //atributos
    String nombre;
    String descripcion;
    int imagen;

    public Datos(String n, String d, int i){
        this.nombre=n;
        this.descripcion=d;
        this.imagen=i;
    }


    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImagen() {
        return imagen;
    }

//SIEMPRE FUNCIONA
  /*  public static List<Datos> poblarDatos(Context context){
        List<Datos> lista = new ArrayList<>();
        String nom;
        for(int i=1;i<=16;i++){
            nom= "avatar_"+String.valueOf(i);
            Datos datos = new Datos("pais " +i,"descripcion "+i,
                    context.getResources().getIdentifier(nom,"drawable",
                            context.getPackageName()) );
            lista.add(datos);
        }
        return lista;
    }*/

    public static List<Datos> poblarDatos() {
        List<Datos> lista = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            int avatar = R.drawable.avatar_1;
            //cada avatar esta representado por un entero
            Datos datos = new Datos("pais" + i, "descripcion" + i,
                    avatar+i);

            lista.add(datos);
        }
        return lista;
    }
}