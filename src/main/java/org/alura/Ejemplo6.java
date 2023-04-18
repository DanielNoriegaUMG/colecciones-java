package org.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Ejemplo6 {
    public static void main(String[] args) {
        //ejemplo 2 para ordenar lista de objetos
        Persona p1 = new Persona("Daniel", "Noriega", 20);
        Persona p2 = new Persona("Fernanda", "Gomez", 15);
        Persona p3 = new Persona("Melany", "Salazar", 21);
        Persona p4 = new Persona("Abigail", "Osorio", 16);
        Persona p5 = new Persona("Juan", "Martinez", 25);

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);
        System.out.println("Lista normal: " + personas);
        Collections.sort(personas);
        System.out.println("Lista ordenada: " + personas);
        Collections.sort(personas, Comparator.naturalOrder());
        System.out.println("Lista ordenada: " +  personas);
        Collections.sort(personas, Comparator.reverseOrder());
        System.out.println("Lista volteada: " + personas);
    }
}
