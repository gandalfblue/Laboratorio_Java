package com.sofka.university.ejercicio_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerConsola = new Scanner(System.in);
        System.out.println("Ingrese el dia");
        String dia = leerConsola.nextLine().toUpperCase();
        Ejercicio8 respuesta = new Ejercicio8(dia);
        respuesta.verificarDiaSemana();
    }
}
