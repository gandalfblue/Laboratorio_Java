package com.sofka.university.ejercicio_10;

public class Ejercicio10 {

    private String frase = "";

    public Ejercicio10(String frase) {
        this.frase = frase;
    }

    public void quitarEspacios(){
    this.frase = this.frase.replace(" ", "");
        System.out.println(this.frase);
    }
}
