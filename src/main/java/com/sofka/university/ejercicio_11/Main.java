package com.sofka.university.ejercicio_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerConsola = new Scanner(System.in);
        System.out.println("Ingrese la frase");
        String leer = leerConsola.nextLine().toLowerCase();
        Ejercicio11 respuesta = new Ejercicio11(leer);
        respuesta.contarVocales();
    }
}
