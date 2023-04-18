package org.alura;

import org.alura.model.Cursos;

import java.util.ArrayList;

public class Ejemplo4 {
    public static void main(String[] args) {
        Cursos curso1 = new Cursos("Programacion", 36);
        Cursos curso2 = new Cursos("Bases de datos", 72);
        Cursos curso3 = new Cursos("Estadistica", 26);
        Cursos curso4 = new Cursos("Algoritmos", 16);

        ArrayList<Cursos> materias = new ArrayList<>();
        materias.add(curso1);
        materias.add(curso2);
        materias.add(curso3);
        materias.add(curso4);
        System.out.println(materias);
    }
}
