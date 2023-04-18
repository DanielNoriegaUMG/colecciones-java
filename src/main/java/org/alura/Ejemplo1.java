package org.alura;

import java.util.ArrayList;

public class Ejemplo1 {
    public static void main(String[] args) {
        String nombre1 = "Daniel";
        String nombre2 = "Melany";
        String nombre3 = "Belen";
        String nombre4 = "Aroldo";
        String nombre5 = "Cindy";

        // declaracion e inicializacion de un ArrayList tipo String
        ArrayList<String> lista = new ArrayList<>();

        //agregando elementos al array
        lista.add(nombre1);
        lista.add(nombre2);
        lista.add(nombre3);
        lista.add(nombre4);
        lista.add(nombre5);
        ArrayList<String> clonacion = (ArrayList<String>) lista.clone(); //casting de lista
        System.out.println(lista);

        lista.remove(nombre2); //Eliminando por nombre
        lista.remove(0); // Eliminando por index
        System.out.println(lista);

        lista.set(1, "Mijin"); // modificando elemento por index
        System.out.println(lista);

        System.out.println("Tamaño de la lista actual: " + lista.size());
        System.out.println(clonacion);
        System.out.println("Tamaño de la lista clonada: " + clonacion.size());
    }
}
