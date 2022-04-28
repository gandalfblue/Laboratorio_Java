package com.sofka.university.ejercicio_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lecturaConsola = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        float precio = lecturaConsola.nextFloat();
        Ejercicio4 respuesta = new Ejercicio4(precio);
        respuesta.obtenerIva( respuesta.Precio(), respuesta.Iva());
    }
}
