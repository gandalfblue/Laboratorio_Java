package com.sofka.university.ejercicio_3;

import java.util.Scanner;

public class Ejercicio3 {

    private double radio;

    public double obtenerAreaCirculo(double radio){
        double result = Math.PI * Math.pow(radio, 2);
        return (result);
    }

    public static void main(String[] args) {
    Ejercicio3 respuesta = new Ejercicio3();
    Scanner lecturaConsola = new Scanner(System.in);

    System.out.println("Ingrese el radio del circulo");
        respuesta.radio = lecturaConsola.nextDouble();
        double resultado = respuesta.obtenerAreaCirculo(respuesta.radio);
        System.out.println("El area del circulo es: " +resultado);
    }
}
