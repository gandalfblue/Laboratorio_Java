package com.sofka.university.ejercicio_4;

import java.util.Scanner;

public class Ejercicio4 {

    private float precio;
    private final static int Iva = 21;

    public Ejercicio4(float precio) {
        this.precio = precio;
    }

    public void obtenerIva(float  precio, int iva) {
        float precioIva = precio * iva / 100;
        this.obtenerPrecioProductoTotal(this.precio, precioIva);
    }

    private static void  obtenerPrecioProductoTotal(float precio,  float  precioIva) {
        float preciototal = precioIva + precio;
        System.out.println("El precio total del producto es: " + preciototal);;
    }

    public float Precio() {
        return precio;
    }

    public static Ejercicio4 modificarPrecio(float precio) {
        return new Ejercicio4(precio);
    }

    public int Iva() {
        return Iva;
    }

    public static void main(String[] args) {
        Scanner lecturaConsola = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto");
        float precio = lecturaConsola.nextFloat();
        Ejercicio4 respuesta = new Ejercicio4(precio);
        respuesta.obtenerIva( respuesta.Precio(), respuesta.Iva());
    }
}