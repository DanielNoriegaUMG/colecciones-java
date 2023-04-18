package org.alura.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cursos{
   private String nombre;
   private int tiempo;
   private List<Clase> listaClase = new LinkedList<>();

    public Cursos(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public Cursos(String nombre, int tiempo, List<Clase> listaClase) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.listaClase = listaClase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public List<Clase> getListaClase() {
        return listaClase;
    }

    public void setListaClase(List<Clase> listaClase) {
        this.listaClase = listaClase;
    }

    public void addClase(Clase clase){
        this.listaClase.add(clase);
    }
    //si no se sobre escribe, nos dara la direccion de espacio en la memoria
    @Override
    public String toString(){
        return this.nombre;
    }
}
