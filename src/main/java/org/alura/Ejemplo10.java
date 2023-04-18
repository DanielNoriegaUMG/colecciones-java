package org.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Ejemplo10 {
    public static void main(String[] args) {
        //Formas de leer un ArrayList
        String alumno1 = "Daniel";
        String alumno2 = "Melany";
        String alumno3 = "Belen";
        String alumno4 = "Aroldo";
        String alumno5 = "Cindy";
        String alumno6 = "Karla";
        String alumno7 = "Daniel";
        String alumno8 = "Aroldo";

        // un SET no muestra datos duplicados, cosa que un ArrayList si lo hace
        Set<String>  listaAlumnos = new HashSet<>();
        // tambien se puede hacer asi
        // Collection<String> listaAlumons = new HashSet<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumno8);

        for(String alumno: listaAlumnos){
            System.out.println(alumno);
        }
    }
}
