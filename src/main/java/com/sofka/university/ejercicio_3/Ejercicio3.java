package com.sofka.university.ejercicio_3;

public class Ejercicio3 {

    private Double radio;

    public Ejercicio3(Double radio) {
        this.radio = radio;
    }

    public double obtenerAreaCirculo(double radio){
        double result = Math.PI * Math.pow(radio, 2);
        return (result);
    }

    public Double Radio() {
        return radio;
    }
}
