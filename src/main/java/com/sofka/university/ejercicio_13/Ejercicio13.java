package com.sofka.university.ejercicio_13;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio13 {

    public void formatearFecha() throws ParseException {
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        String fechaActualString = String.valueOf(fechaActual);
        String horaActualString = String.valueOf(horaActual);
        DateTimeFormatter formateadorFecha = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter formateadorHora = DateTimeFormatter.ofPattern("HH:mm:ss a");
        LocalDate fechaLocalFormateada = LocalDate.parse(fechaActualString, formateadorFecha);
        LocalTime horaLocalFormateada = LocalTime.parse(horaActualString, formateadorHora);
        System.out.println("La fecha y hora es: " + formateadorFecha.format(fechaLocalFormateada) + formateadorHora.format(horaLocalFormateada));

    }

    public static void main(String[] args)  {
        Ejercicio13 respuesta = new Ejercicio13();
        try {
        respuesta.formatearFecha();
        }catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
    }

}
