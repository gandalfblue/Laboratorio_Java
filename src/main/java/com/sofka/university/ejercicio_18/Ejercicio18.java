package com.sofka.university.ejercicio_18;

import java.util.Random;
import java.util.logging.Logger;

public class Ejercicio18 {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger("main");
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        series[0] = new Serie("Serie 1", 1, "comedia", "aleman");
        series[1] = new Serie("Serie 2", 2, "terror", "aleman");
        series[2] = new Serie("Serie 3", 3, "sccion", "colombiano");
        series[3] = new Serie("Serie 4", "Andres Lozada");
        series[4] = new Serie();

        videojuegos[0] = new Videojuego("Fifa 22", 5, "deportes", "Nintendo");
        videojuegos[1] = new Videojuego("Crash car", 6, "aventura", "Play Station");
        videojuegos[2] = new Videojuego("Call of duty", 7, "mision", "Xbos");
        videojuegos[3] = new Videojuego("Mortal Kombat", 8);
        videojuegos[4] = new Videojuego();

        Random rand = new Random();
        int entregados = rand.nextInt(4);
        for (int i = 0; i < entregados; i++) {
            series[i].entregar();
        }
        entregados = rand.nextInt(4);
        for (int i = 0; i < entregados; i++) {
            videojuegos[i].entregar();
        }

        logger.info("prueba de logger");
        System.out.println("Las series entregados fueron: " + contarSeriesEntregadas(series));
        System.out.println("Los juegos entregados fueron: " + contarJuegosEntregados(videojuegos));


        //Mas temporadas y mas horas estimadas
        System.out.println("La serie con mas temporadas es: " + masTemporadas(series));
        System.out.println("El juego con mas horas estimadas es: " + masHorasEstimadas(videojuegos));
    }


    private static int contarSeriesEntregadas(Serie[] series) {
        int total = 0;
        for (Serie serie : series) {
            if (serie.entregado()) {
                serie.devolver();
                total++;
            }
        }

        return total;
    }

    private static int contarJuegosEntregados(Videojuego[] videojuegos) {
        int total = 0;
        for (Videojuego juego : videojuegos) {
            if (juego.entregado()) {
                juego.devolver();
                total++;
            }
        }
        return total;
    }

    private static Videojuego masHorasEstimadas(Videojuego[] videojuegos) {
        Videojuego juegoHoras = videojuegos[0];
        for (int index = 1; index < videojuegos.length; index++) {
            if (juegoHoras.getHorasEstimadas() < videojuegos[index].getHorasEstimadas()) {
                juegoHoras = videojuegos[index];
            }
        }
        return juegoHoras;
    }

    private static Serie masTemporadas(Serie[] series) {
        Serie masTemporadas = series[0];
        for (int index = 1; index < series.length; index++) {
            if (masTemporadas.getNumeroTemporadas() < series[index].getNumeroTemporadas())
                masTemporadas = series[index];
        }
        return masTemporadas;
    }
}