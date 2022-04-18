package com.sofka.university.ejercicio_7;

import com.sofka.university.interfaces.LeerConsola;

import java.util.Scanner;

public class Ejercicio7 {

        private int numero;

    public Ejercicio7() {   }

    private static int leerConsola(){
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
        }while(comparar < 0 );
        System.out.println(comparar);
    }

    public void modificarNumero(int numero) {
        this.numero = numero;
    }

    public static void main(String[] args) {
        Ejercicio7 respuesta = new Ejercicio7();
        respuesta.ciclo();
    }

}
