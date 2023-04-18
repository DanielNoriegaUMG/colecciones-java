package org.alura.model;

public class Clase {
   private String nombre;
   private int tiempo;

    public Clase(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //si no se sobre escribe, nos dara la direccion de espacio en la memoria
    @Override
    public String toString(){
        return this.nombre;
    }
}
