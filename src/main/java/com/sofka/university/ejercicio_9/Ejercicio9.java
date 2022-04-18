package com.sofka.university.ejercicio_9;

import com.sofka.university.interfaces.LeerConsola;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicio9 implements LeerConsola {

    private final static String letra = "a";
    private String texto;
    private String texto2;

    public Ejercicio9(String texto) {
        this.texto = texto;
    }

    @Override
    public void reemplazarLetras() {
       this.texto = this.texto.replace("a", "e");
       this.texto = this.texto.concat(" " + this.texto2);
        System.out.println(this.texto);
    }

    public Ejercicio9 from(String texto) {return new Ejercicio9(texto);}

    public String Texto2() {return texto2;}

    public void modificarTexto2(String texto2) {this.texto2 = texto2;}

    public static void main(String[] args) {
        Scanner leerConsola = new Scanner(System.in);
        System.out.println("Ingresa la oracion");
        String leer = leerConsola.nextLine();
        Ejercicio9 respuesta = new Ejercicio9( "La sonrisa sera la mejor arma contra la tristeza");
        respuesta.modificarTexto2(leer);
        respuesta.reemplazarLetras();
    }

}
