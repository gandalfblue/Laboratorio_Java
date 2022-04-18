package com.sofka.university.ejercicio_2;

import com.sofka.university.ejercicio_1.Ejercicio1;

import java.util.Scanner;

public class Ejercicio2 {

    private int numero1;
    private int numero2;

    public void numeroMayor(int numero1, int numero2) {
        if (numero1 > numero2) {
            System.out.println("El numero 1  es mayor que el numero 2 ");
            return;
        }
        Ejercicio2.numerosIguales(this.numero1, this.numero2);
    }

     static  void numerosIguales(int numero1, int numero2) {
        if (numero1 == numero2){
            System.out.println("Los numeros son iguales");
            return;
        }
        System.out.println("El numero 2 es mayor que el numero 1");
        return;
    }

    public static void main(String[] args) {
        Ejercicio2 respuesta = new Ejercicio2();
        Scanner lecturaConsola = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        respuesta.numero1 = lecturaConsola.nextInt();

        System.out.println("Ingrese el segundo numero");
        respuesta.numero2 = lecturaConsola.nextInt();

        respuesta.numeroMayor(respuesta.numero1, respuesta.numero2);
    }
}