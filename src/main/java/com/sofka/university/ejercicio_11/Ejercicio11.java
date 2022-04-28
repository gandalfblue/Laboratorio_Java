package com.sofka.university.ejercicio_11;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio11 {

    private String frase = "";

    public Ejercicio11(String frase) {
        this.frase = frase;
    }

    private int obtenerTamano() {
        int tamano = this.frase.length();
        return tamano;
    }

    private void imprimirConsola(Map<Character, Integer> map) {
        System.out.println("La longitud de la frase es: " + this.obtenerTamano());
        System.out.println("La cantidad de vocales son:");
        map.forEach((key, value) -> System.out.println("Vocal: " + key + " esta repetida: " + value + " veces"));
    }

    public void contarVocales() {
        Map<Character, Integer> contar = new HashMap<>();
        char[] arregloChar = this.frase.toCharArray();
        contar.put('a', 0);
        contar.put('e', 0);
        contar.put('i', 0);
        contar.put('o', 0);
        contar.put('u', 0);
        for (char letra : arregloChar) {
            boolean verificarKey = contar.containsKey(letra);
            if (verificarKey) {
                Integer contarLetra = contar.get(letra);
                contar.put(letra, (++contarLetra));
            }
        }
        this.imprimirConsola(contar);
    }
}
