package com.sofka.university.ejercicio_2;

import java.util.Scanner;

public class Ejercicio2 {

    private int numero1;
    private int numero2;

    public Ejercicio2() {
    }

    public void numeroMayor(int numero1, int numero2) {
        if (numero1 > numero2) {
            System.out.println("El numero 1  es mayor que el numero 2 ");
            return;
        }
        this.numerosIguales(this.numero1, this.numero2);
    }

    private static  void numerosIguales(int numero1, int numero2) {
        if (numero1 == numero2){
            System.out.println("Los numeros son iguales");
            return;
        }
        System.out.println("El numero 2 es mayor que el numero 1");
        return;
    }

    public int Numero1() {
        return numero1;
    }

    public void modificarNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int Numero2() {
        return numero2;
    }

    public void modificarNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public static void main(String[] args) {
        Ejercicio2 respuesta = new Ejercicio2();
        Scanner lecturaConsola = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
         int numero1 = lecturaConsola.nextInt();
        respuesta.modificarNumero1(numero1);
        System.out.println("Ingrese el segundo numero");
       int numero2 = lecturaConsola.nextInt();
        respuesta.modificarNumero2(numero2);
        respuesta.numeroMayor(respuesta.Numero1(), respuesta.Numero2());
    }
}