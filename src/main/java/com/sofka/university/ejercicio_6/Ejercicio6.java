package com.sofka.university.ejercicio_6;

import com.sofka.university.ejercicio_5.Ejercicio5;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio6 extends Ejercicio5 {

    private static List<Integer> numerosPares() {
        List<Integer> listaPares = new ArrayList();

        for (int contador = 1; contador <= 100; contador++) {
            isPar(listaPares, contador);
        }
        return listaPares;
    }

    private static void isPar(List<Integer> listaPares, int contador) {
        if (contador % 2 == 0) {
            listaPares.add(contador);
        }
    }

    private static List<Integer> numerosImpares() {
        List<Integer> listaImpares = new ArrayList();

        for (int contador = 1; contador <= 100; contador++) {
            isImpar(listaImpares, contador);
        }
        return listaImpares;
    }

    private static void isImpar(List<Integer> listaImpares, int contador) {
        if (contador % 2 != 0) {
            listaImpares.add(contador);
        }
    }
}
