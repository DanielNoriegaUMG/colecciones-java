package org.alura;

import org.alura.model.Clase;
import org.alura.model.Cursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejemplo7 {
    public static void main(String[] args) {
        Cursos curso1 = new Cursos("Example", 36);
        curso1.addClase(new Clase("Ruby"));
        curso1.addClase(new Clase("NodeJS"));
        curso1.addClase(new Clase("Java"));
        curso1.addClase(new Clase("SQL"));
        curso1.addClase(new Clase("Inmutable"));

        List<Clase> aulas = curso1.getListaClase();

        ArrayList<Cursos> lista = new ArrayList<>();
        lista.add(curso1);

        // Lanzan lo mismo
        System.out.println(lista.get(0).getListaClase());
        System.out.println(aulas);
    }
}
