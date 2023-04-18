package org.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ejemplo3 {
    public static void main(String[] args) {
        String curso1 = "Matematicas discretas";
        String curso2 = "Programacion";
        String curso3 = "Contabilidad 2";
        String curso4 = "Estadistica 1";
        String curso5 = "Bases de datos";

        // declaracion e inicializacion de un ArrayList tipo String
        ArrayList<String> listaCursos = new ArrayList<>();

        //agregando elementos al array
        listaCursos.add(curso1);
        listaCursos.add(curso2);
        listaCursos.add(curso3);
        listaCursos.add(curso4);
        listaCursos.add(curso5);

        //Utilizando Collections
        /*System.out.println("Lista normal: " + listaCursos);
        Collections.sort(listaCursos);
        System.out.println("Lista ordenada: " + listaCursos);
        Collections.sort(listaCursos, Collections.reverseOrder());
        System.out.println("Lista volteada: " + listaCursos);*/

        // Modo normal
        /*System.out.println("Lista normal" + listaCursos);
        listaCursos.sort(Comparator.naturalOrder());
        System.out.println("Lista ordenada" + listaCursos);
        listaCursos.sort(Comparator.reverseOrder());
        System.out.println("Lista volteada" + listaCursos);*/

        // metodo stream
        // collect devuelve una lista entonces hay que convertirla
        List<String> lista = listaCursos.stream().sorted().collect(Collectors.toList());
        System.out.println(lista);
    }
}
