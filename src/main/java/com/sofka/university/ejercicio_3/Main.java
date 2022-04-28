package com.sofka.university.ejercicio_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lecturaConsola = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        double radio = lecturaConsola.nextDouble();
        Ejercicio3 respuesta = new Ejercicio3(radio);
        double resultado = respuesta.obtenerAreaCirculo(respuesta.Radio());
        System.out.println("El area del circulo es: " +resultado);
    }
}
