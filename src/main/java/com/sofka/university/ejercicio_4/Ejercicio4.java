package com.sofka.university.ejercicio_4;

import com.sofka.university.ejercicio_3.Ejercicio3;

import java.util.Scanner;

public class Ejercicio4 {

    private float precio;
    private final int iva = 21;

    public float obtenerPrecioProducto(float  precio, int iva) {
        float precioIva = precio * iva / 100;
        return precioIva;
    }

    public static void main(String[] args) {
        Ejercicio4 respuesta = new Ejercicio4();
        Scanner lecturaConsola = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto");
        respuesta.precio = lecturaConsola.nextFloat();
        float precioIva = respuesta.obtenerPrecioProducto( respuesta.precio, respuesta.iva);
        float precioTotal = respuesta.precio + precioIva;
        System.out.println("El precio total del producto es: " +precioTotal);
    }
}
