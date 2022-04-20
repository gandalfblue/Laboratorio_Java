package com.sofka.university.ejercicio_14;

import com.sofka.university.ejercicio_13.Ejercicio13;

import java.util.Scanner;

public class Ejercicio14 {

    public void saltoNumero(int numero){

        while (numero<1000){
            this.imprimirConsola(numero);
            numero = numero +2;
        }

    }

    public void imprimirConsola(int numero){
        System.out.print(numero + " ");
    }

    public static void main(String[] args) {
        Scanner leerConsola = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        Ejercicio14 respuesta = new Ejercicio14();
        int numero = leerConsola.nextInt();
        respuesta.saltoNumero(numero);
    }

}
