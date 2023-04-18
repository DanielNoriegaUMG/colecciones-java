package org.alura;

import java.util.ArrayList;

public class Ejemplo2 {
    public static void main(String[] args) {
        //Formas de leer un ArrayList
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


        System.out.println("Forma 1:" + lista);

        System.out.println("\nForma 2:");
        for (String item: lista){
            System.out.println(item);
        }

        System.out.println("\nForma 3");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("\nForma 4");
        lista.forEach(items -> {
            System.out.println(items);
        });
    }
}
