package com.sofka.university.ejercicio_10;

import java.util.Scanner;

public class Ejercicio10 {

    private String frase = "";

    public Ejercicio10(String frase) {
        this.frase = frase;
    }

    public void quitarEspacios(){
    this.frase = this.frase.replace(" ", "");
        System.out.println(this.frase);
    }


    public static void main(String[] args) {
        Scanner leerConsola = new Scanner(System.in);
        System.out.println("Ingrese la frase");
        String frase = leerConsola.nextLine();
        Ejercicio10 respuesta = new Ejercicio10(frase);
        respuesta.quitarEspacios();



    }


}
