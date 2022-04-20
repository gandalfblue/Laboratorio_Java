package com.sofka.university.ejercicio_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio12 {

    private String palabra1 = "";
    private String palabra2 = "";

    public Ejercicio12(String palabra1, String palabra2) {
        this.palabra1 = palabra1;
        this.palabra2 = palabra2;
    }

    public void convertirPalabras() {
        char[] arregloPalabra1 = this.palabra1.toCharArray();
        char[] arregloPalabra2 = this.palabra2.toCharArray();
        String palabra1 = "";
        String palabra2 = "";
        Arrays.sort(arregloPalabra1);
        Arrays.sort(arregloPalabra2);
        palabra1 = this.compararPalabra1(arregloPalabra1, arregloPalabra2);
        palabra2 = this.compararPalabra2(arregloPalabra1, arregloPalabra2);
        this.imprimirPantalla(palabra1, palabra2);
    }

    private String compararPalabra2(char[] arregloPalabra1, char[] arregloPalabra2) {
       ArrayList<Character> arregloPalabra4 = new ArrayList<>();
//        List<char[]> lista = Arrays.asList(arregloPalabra1);
//        List<char[]> lista2 = Arrays.asList(arregloPalabra2);
//        ArrayList<char[]> lista3 = new ArrayList<>();
        String palabra = "";
        //lista2.removeAll(lista);
        for (char letra2 : arregloPalabra2) {
            for (char letra : arregloPalabra1) {
                if (letra2 == letra) {
                    continue;
                }
                arregloPalabra4.add(letra2);
            }
        }

//        for (char[] elemento : lista2) {
//                if (lista.contains(elemento)) {
//                    lista3.add(elemento);
//                    System.out.print(elemento);
//                }
//            }
        palabra =arregloPalabra4.stream().map(String::valueOf).collect(Collectors.joining());
//        palabra = palabra.valueOf(lista);
        System.out.println("Palabra en el for 2 " + palabra);
        return palabra;
    }

    private String compararPalabra1(char[] arregloPalabra1, char[] arregloPalabra2) {
        ArrayList<Character> arregloPalabra3 = new ArrayList<>();
//        List<char[]> lista = Arrays.asList(arregloPalabra1);
//        for (char[] elemento : lista) {
//            System.out.println(elemento);
//        }
//        List<char[]> lista2 = Arrays.asList(arregloPalabra2);
//        ArrayList<char[]> lista3 = new ArrayList<>();
        String palabra = "";
        for (char letra : arregloPalabra1) {
            for (char letra2 : arregloPalabra2) {
                if (letra == letra2) {
                    continue;
                }
                arregloPalabra3.add(letra2);
            }
        }
//        for (char[] elemento : lista) {
//            if (!lista2.contains(elemento)) {
//                lista3.add(elemento);
//                System.out.print(elemento);
//            }
//        }
        palabra = arregloPalabra3.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.print("Palabra 3 en el for 1 " + palabra);
        return palabra;
    }

    public void imprimirPantalla(String palabra1, String palabra2) {
//        System.out.println("Las diferencias entre las palabra 1 con la palabra 1 es: " + palabra1);
//        System.out.println("Las diferencias entre las palabra 2 con la palabra 2 es: " + palabra2);
        System.out.println("diferencia entre las palabras: " + palabra1.replaceAll("(.*)\\1+", ""));
        System.out.println("diferencia entre las palabras: " + palabra2.replaceAll("(.*)\\1+", ""));
    }

    public static void main(String[] args) {
        Scanner leeConsola = new Scanner(System.in);
        System.out.println("Ingrese la primera palabra");
        String palabra = leeConsola.nextLine();
        System.out.println("Ingrese la segunda palabra");
        String palabra2 = leeConsola.nextLine();
        Ejercicio12 respuesta = new Ejercicio12(palabra, palabra2);
        respuesta.convertirPalabras();
        ;
    }
}

