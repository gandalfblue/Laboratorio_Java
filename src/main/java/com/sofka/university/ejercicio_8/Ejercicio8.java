package com.sofka.university.ejercicio_8;

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
}
