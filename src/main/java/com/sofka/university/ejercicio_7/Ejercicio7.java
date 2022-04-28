package com.sofka.university.ejercicio_7;

import java.util.Scanner;

public class Ejercicio7 {

    private static Integer leerConsola(){
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int leerNumero = lecturaTeclado.nextInt();
        return  leerNumero;
    }

    public void ciclo(){
        int comparar = 1;
        do {
            int leer = Ejercicio7.leerConsola();

            comparar = leer;
        }while (comparar < 0);
        System.out.println(comparar);
    }
}
