package com.sofka.university.ejercicio_15;

import java.util.Scanner;

public class Ejercicio15 {

    private Integer opcion;

    public Ejercicio15() {
    }

    private static String Scanner() {
        Scanner leerConsola = new Scanner(System.in);
        return leerConsola.nextLine();
    }

    public void  menu() {

        do {
            System.out.println("****** GESTION CINEMATOGRAFICA ********\n" +
                                                            "1-NUEVO ACTOR\n" +
                                                            "2-BUSCAR ACTOR\n" +
                                                            "3-ELIMINAR ACTOR\n" +
                                                            "4-MODIFICAR ACTOR\n" +
                                                            "5-VER TODOS LOS ACTORES\n" +
                                                            "6- VER PELICULAS DE LOS ACTORES\n" +
                                                            "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                                                            "8-SALIR\n");
            try {
                System.out.println("Ingrese la opción que necesite");
                this.opcion = Integer.parseInt(Scanner());
                opcionMayor();
            } catch (Exception e) {
                System.out.println("Opción incorrecta");
                System.out.println("");
                this.opcion = 0;
            }
        } while (this.opcion < 8);
    }

    private void opcionMayor() {
        if (this.opcion > 8) {
            this.opcion = 0;
            System.out.println("Opción incorrecta");
            System.out.println("");
        }
    }
}