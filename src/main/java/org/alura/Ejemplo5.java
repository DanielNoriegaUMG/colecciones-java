package org.alura;

import org.alura.model.Cursos;

import java.util.ArrayList;
import java.util.Comparator;

public class Ejemplo5 {
    public static void main(String[] args) {
        //ejemplo 1 para ordenar lista de objetos
        Cursos curso1 = new Cursos("NodeJS", 36);
        Cursos curso2 = new Cursos("SQL", 72);
        Cursos curso3 = new Cursos("GO", 26);
        Cursos curso4 = new Cursos("JavaScript", 16);

        ArrayList<Cursos> materias = new ArrayList<>();
        materias.add(curso1);
        materias.add(curso2);
        materias.add(curso3);
        materias.add(curso4);
        System.out.println("Lista normal: " + materias);
        materias.sort(Comparator.comparing(Cursos::getNombre));
        System.out.println("Lista ordenada: " + materias);
        materias.sort(Comparator.comparing(Cursos::getNombre).reversed());
        System.out.println("Lista volteada: " +  materias);
    }
}
