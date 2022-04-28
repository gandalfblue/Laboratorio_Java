package com.sofka.university.ejercicio_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerConsola = new Scanner(System.in);
        System.out.println("Ingrese la frase");
        String frase = leerConsola.nextLine();
        Ejercicio10 respuesta = new Ejercicio10(frase);
        respuesta.quitarEspacios();
    }
}
