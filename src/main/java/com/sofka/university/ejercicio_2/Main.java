package com.sofka.university.ejercicio_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lecturaConsola = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numero1 = lecturaConsola.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = lecturaConsola.nextInt();
        Ejercicio2 respuesta = new Ejercicio2(numero1, numero2);
        respuesta.numeroMayor(respuesta.Numero1(), respuesta.Numero2());
    }
}
