package com.sofka.university.ejercicio_13;

import java.time.LocalDateTime;

public class Ejercicio13 {

    public static void imprimirFechaActual() {
        String fechaActual =  formatoFecha();
        System.out.println("La fecha es " +fechaActual) ;
        imprimirHoraActual();

    }

    private static  void imprimirHoraActual() {
        String horaActual = formatoHora();
        System.out.println("La hora es " + horaActual);
    }

    private static String formatoFecha() {
        String fecha = String.valueOf(LocalDateTime.now().getYear());
        fecha += "/" + LocalDateTime.now().getMonthValue() + "/" + LocalDateTime.now().getDayOfMonth();
        return fecha;
    }

    private static String formatoHora() {
        String hora = String.valueOf(LocalDateTime.now().getHour());
        hora += ":" + LocalDateTime.now().getMinute() + ":" + LocalDateTime.now().getSecond();
        return hora;
    }
}
