package com.sofka.university.ejercicio_8;

import java.util.Scanner;

public class Ejercicio8 {

    private String dia;

    public Ejercicio8(String dia) {
        this.dia = dia;
    }

    public void verificarDiaSemana(){
        String dia = this.Dia();
        switch (dia) {
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                System.out.println("Es un dia laboral");
                break;

            default:
                System.out.println("No es un dia laboral");
                break;
        }
    }

    public String Dia() {return dia;}

    public static void main(String[] args) {
        Scanner leerConsola = new Scanner(System.in);
        System.out.println("Ingrese el dia");
        String dia = leerConsola.nextLine().toUpperCase();
        Ejercicio8 respuesta = new Ejercicio8(dia);
        respuesta.verificarDiaSemana();
    }
}
