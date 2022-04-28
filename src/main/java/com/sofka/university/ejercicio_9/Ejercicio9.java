package com.sofka.university.ejercicio_9;

import com.sofka.university.interfaces.LeerConsola;

public class Ejercicio9 implements LeerConsola {

    private final static String letra = "a";
    private String texto;

    public Ejercicio9(String texto) {
        this.texto = texto;
    }

    @Override
    public void reemplazarLetras() {
       this.texto = this.texto.replace("a", "e");
       this.texto = this.texto.concat(" " + this.texto);
        System.out.println(this.texto);
    }
}
