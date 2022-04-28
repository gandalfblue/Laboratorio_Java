package com.sofka.university.ejercicio_4;

public class Ejercicio4 {

    private Float precio;
    private final static Integer Iva = 21;

    public Ejercicio4(Float precio) {
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

    public Float Precio() {return precio;}

    public Integer Iva() {
        return Iva;
    }


}