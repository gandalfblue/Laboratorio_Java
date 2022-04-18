package com.sofka.university.ejercicio_6;



import java.util.ArrayList;
import java.util.List;

public class Ejercicio6 {

    private static List<Integer> numerosPares() {
        List<Integer> listaPares = new ArrayList();

        for (int contador = 1; contador <= 100; contador++) {
            if (contador % 2 == 0) {
                listaPares.add(contador);
            }
        }
        return listaPares;
    }

    private static List<Integer> numerosImpares() {
        List<Integer> listaImpares = new ArrayList();

        for (int contador = 1; contador <= 100; contador++) {
            if (contador % 2 != 0) {
                listaImpares.add(contador);
            }
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
            System.out.print(Ejercicio6.numerosImpares().get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Ejercicio6 respuesta = new Ejercicio6();
        respuesta.imprimirNumerosPares();
    }
}
