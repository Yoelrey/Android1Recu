package com.example.a2a;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    String nombre ,ciudad ,anho, pais;
    int escudo;

    public Equipo(String pais, String nombre, String ciudad, String anho, int escudo) {
        this.pais = pais;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.anho = anho;
        this.escudo = escudo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAnho() {
        return anho;
    }

    public void setAnho(String anho) {
        this.anho = anho;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }



    public static List<Equipo> crearTeam() {
        List<Equipo> lista = new ArrayList<>();

        lista.add(new Equipo("Atletico Nacional", "Medellin", "Colombia", "1947",R.drawable.saski_baskonia ));
        lista.add(new Equipo("Club Nacional", "Montevideo", "Uruguay", "1899",R.drawable.panathinaikos_bc));
        lista.add(new Equipo( "Club Olimpia", "Asuncion", "Paraguay", "1902",R.drawable.maccabi_tel_aviv));
        lista.add(new Equipo("SE Palmeiras", "Sao Paulo", "Brasil", "1914",R.drawable.kk_cvrena_zvezda));
        lista.add(new Equipo("Racing Club", "Avellaneda", "Argentina", "1903",R.drawable.bc_zalgiris));

        return lista;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "pais='" + pais + '\'' +
                ",nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", año='" + anho + '\'' +
                ", escudo=" + escudo +
                '}';
    }
}