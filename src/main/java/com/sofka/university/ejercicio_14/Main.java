package com.sofka.university.ejercicio_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerConsola = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        Ejercicio14 respuesta = new Ejercicio14();
        int numero = leerConsola.nextInt();
        respuesta.saltoNumero(numero);
    }
}
