package com.sofka.university.ejercicio_5;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {

    private static List<Integer> numerosPares() {
        List<Integer> listaPares = new ArrayList();
        Integer contador = 1;
        while (contador <= 100) {
            if (contador % 2 == 0) {
                listaPares.add(contador);
            }
            contador++;
        }
        return listaPares;
    }

    private static List<Integer> numerosImpares() {
        List<Integer> listaImpares = new ArrayList();
        int contador = 1;
        while (contador <= 100) {
            if (contador % 2 != 0) {
                listaImpares.add(contador);
            }
            contador++;
        }
        return listaImpares;
    }

    public void imprimirNumerosPares() {
        System.out.println("Numeros Pares");
        for (int i = 0; i < 50; i++) {
            System.out.print(this.numerosPares().get(i) + " ");
        }
        System.out.println("");
        this.imprimirNumerosImpares();
    }

    private static void imprimirNumerosImpares() {
        System.out.println("Numeros Impares");
        for (int i = 0; i < 50; i++) {
            System.out.print(Ejercicio5.numerosImpares().get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Ejercicio5 respuesta = new Ejercicio5();
        respuesta.imprimirNumerosPares();
    }
}
