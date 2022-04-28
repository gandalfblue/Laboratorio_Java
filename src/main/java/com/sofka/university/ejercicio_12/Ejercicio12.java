package com.sofka.university.ejercicio_12;

import java.util.Scanner;

public class Ejercicio12 {

    public static String Scanner(){
        Scanner leerConsola = new Scanner(System.in);
        return leerConsola.nextLine();
    }

    public static void mostrarRespuesta() {
    String[] palabras = pedirPalabras();
        if (compararPalabras(palabras)) {
            System.out.println( "Las palabras son iguales");

    } else {
        String[] result = diferenciarPalabras(palabras);
            System.out.println("La palabra '" + result[0] + "' tiene las diferencias con la palabra " + result[1]);
    }
}

    private static String[] pedirPalabras() {
        String[] palabras = new String[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese la palabra en la posición" + (i+1));
            palabras[i] = Scanner();
            verificarEspacios(palabras, i);
        }
        return palabras;
    }

    private static void verificarEspacios(String[] palabras, int i) {
        while (palabras[i].contains(" ")) {
            System.out.println("La palabra no puede tener espacios, vuelva a ingresar");
            palabras[i] = Scanner();
        }
    }

    private static  boolean compararPalabras(String[] palabra) {
        return palabra[0].equals(palabra[1]);
    }

    private static String[] diferenciarPalabras(String[] palabras) {
        char[] palabra1 = palabras[0].toCharArray();
        char[] palabra2 = palabras[1].toCharArray();
        int contador = Math.min(palabra1.length, palabra2.length);
        palabras[0] = "";
        palabras[1] = "";
        recorrerArregloChar(palabras, palabra1, palabra2, contador);
        adicionarLetra(palabras, palabra1, palabra2, contador);

        return palabras;
    }

    private static void adicionarLetra(String[] palabras, char[] palabra1, char[] palabra2, int contador) {
        while (contador < palabra1.length) {
            palabras[0] += palabra1[contador];
            contador++;
        }
        while (contador < palabra2.length) {
            palabras[1] += " -" + palabra2[contador] + "-";
            contador++;
        }
    }

    private static void recorrerArregloChar(String[] palabras, char[] palabra1, char[] palabra2, int contador) {
        for (int i = 0; i < contador; i++) {
            if (palabra1[i] != palabra2[i]) {
                palabras[0] += palabra1[i];
                palabras[1] += " -" + palabra2[i] + "-";
            } else {
                palabras[0] += palabra1[i];
                palabras[1] += palabra2[i];
            }
        }
    }
}

