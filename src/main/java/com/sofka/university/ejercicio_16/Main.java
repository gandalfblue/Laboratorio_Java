package com.sofka.university.ejercicio_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona[] persona = new Persona[3];
        Scanner leerConsola = new Scanner(System.in);
        int contador = 1;
        do {
            System.out.println("Por favor ingrese el nombre de la persona: " + (contador));
            String nombre = leerConsola.nextLine();
            System.out.println("Por favor ingrese la edad de " + nombre + ":");
            int edad = Integer.parseInt(leerConsola.nextLine());
            System.out.println("Por favor ingrese el sexo (H para hombre/ M para mujer) de " + nombre + ":");
            char sexo = leerConsola.nextLine().toUpperCase().charAt(0);
            double pesoTomado = tomarDatoPeso(leerConsola, contador, nombre);
            double alturaTomada = tomarDatoAltura(leerConsola, contador, nombre);
            persona[contador] = new Persona(nombre, edad, pesoTomado, alturaTomada, sexo);
            contador++;
        } while (contador > 3);

        // Mensaje sobre el peso
        System.out.println("Señor " + persona[0].Nombre()+","+persona[0].calcularIMC());
        System.out.println("Señor " + persona[1].Nombre()+","+persona[1].calcularIMC());
        System.out.println("Señor " + persona[2].Nombre()+","+persona[2].calcularIMC());

        //Menesjae sobre si es mayor de edad
        System.out.println("El señor " + persona[0].Nombre()+","+persona[0].verificarMayorEdad());
        System.out.println("El señor " + persona[1].Nombre()+","+persona[1].verificarMayorEdad());
        System.out.println("El señor " + persona[2].Nombre()+","+persona[2].verificarMayorEdad());

        //Conversión del objeto a String
        System.out.println("Los datos de la primera persona es " + persona[0]);
        System.out.println("Los datos de la primera persona es" + persona[1]);
        System.out.println("Los datos de la primera persona es" + persona[2]);
    }

    private static Double tomarDatoPeso(Scanner leerConsola, int contador, String nombre) {
        if (contador > 1) {
            System.out.println("Por favor ingrese el peso en kg de " + nombre + ":");
            double peso = Double.parseDouble(leerConsola.nextLine());
            return peso;
        }
        return 0.0;
    }

    private static Double tomarDatoAltura(Scanner leerConsola, int contador, String nombre) {
        if (contador > 1) {
            System.out.println("Por favor ingrese el peso en kg de " + nombre + ":");
            double altura = Double.parseDouble(leerConsola.nextLine());
            return altura;
        }
        return 0.0;
    }
}
