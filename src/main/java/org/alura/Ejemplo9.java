package org.alura;

import org.alura.model.Clase;
import org.alura.model.Cursos;

import java.util.*;
import java.util.stream.Collectors;


public class Ejemplo9 {
    public static void main(String[] args) {

        Cursos curso1 = new Cursos("Historia", 36);
        Cursos curso2 = new Cursos("Algebra", 25);
        Cursos curso3 = new Cursos("Aritmetica", 42);
        Cursos curso4 = new Cursos("Estadistica", 43);
        Cursos curso5 = new Cursos("Quimica", 26);
        Cursos curso6 = new Cursos("Historia", 18);
        Cursos curso7 = new Cursos("Matematicas", 24);
        Cursos curso8 = new Cursos("Geografia", 12);
        Cursos curso9 = new Cursos("Contabilidad", 45);
        Cursos curso10 = new Cursos("Estadistica", 38);

        ArrayList<Cursos> materias = new ArrayList<>();
        materias.add(curso1);
        materias.add(curso2);
        materias.add(curso3);
        materias.add(curso4);
        materias.add(curso5);
        materias.add(curso6);
        materias.add(curso7);
        materias.add(curso8);
        materias.add(curso9);
        materias.add(curso10);

        Collections.sort(materias, Comparator.comparing(Cursos::getNombre).reversed());

        int tiempo = 0;
        for (Cursos curso: materias){
            tiempo += curso.getTiempo();
        }

        System.out.println("Tiempo: " + tiempo);

        // otra forma de medir el tiempo mas sencilla
        System.out.println("Tiempo: " + materias.stream().mapToInt(Cursos::getTiempo).sum());

        // devolver el numero mayor de las horas de cursos
        System.out.println("Numero mayor en horas: " + materias.stream().mapToInt(Cursos::getTiempo).max().getAsInt());

        // promedio de horas
        System.out.println("Promedio de horas: " + materias.stream().mapToInt(Cursos::getTiempo).average().getAsDouble());

        // hora minima del los cursos
        System.out.println("Hora minima: " +  materias.stream().mapToInt(Cursos::getTiempo).min().getAsInt());

        Map<String, List<Cursos>> groupCurso = materias.stream().collect(Collectors.groupingBy(Cursos::getNombre));

        // contar el numero de veces que se repite una materia
        groupCurso.forEach((key, value) -> System.out.println(key + " = " + value.size()));

        System.out.println(materias.parallelStream().count()); // numero de materias
        System.out.println(materias.parallelStream().mapToInt(Cursos::getTiempo).sum()); // suma de numero de horas
        System.out.println(materias.stream().findFirst().get());
        System.out.println(materias.stream().findAny().get());
    }
}
