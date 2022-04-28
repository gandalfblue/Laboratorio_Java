package com.sofka.university.ejercicio_2;

import com.sofka.university.ejercicio_1.Ejercicio1;

public class Ejercicio2 extends Ejercicio1 {

    public Ejercicio2(Integer numero1, Integer numero2) {
        super(numero1, numero2);
    }

    private static  void numerosIguales(int numero1, int numero2) {
        if (numero1 == numero2){
            System.out.println("Los numeros son iguales");
            return;
        }
        System.out.println("El numero 2 es mayor que el numero 1");
        return;
    }
}