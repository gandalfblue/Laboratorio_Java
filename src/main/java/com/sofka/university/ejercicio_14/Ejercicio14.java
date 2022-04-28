package com.sofka.university.ejercicio_14;

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

}
