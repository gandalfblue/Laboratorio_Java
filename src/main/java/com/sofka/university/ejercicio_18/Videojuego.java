package com.sofka.university.ejercicio_18;

public class Videojuego implements Entregable {

    private static final int HORAS_JUEGO = 10;
    private static final boolean ENTREGADO = false;

    private String titulo = "";
    private int horasEstimadas = HORAS_JUEGO;
    private boolean entregado = ENTREGADO;
    private String genero = "";
    private String compania = "";


    public Videojuego() {}

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    @Override
    public void entregar() {
        this.entregado = true;

    }

    @Override
    public void devolver() {
        this.entregado = false;

    }

    @Override
    public boolean entregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object object) {
        int comparar = ((Integer) this.horasEstimadas).compareTo(((Videojuego)object).getHorasEstimadas());
        return comparar;
    }

    @Override
    public String toString() {
        return "Videojuego:" +
                "titulo='" + this.titulo + '\'' +
                ", horas_estimadas=" + this.horasEstimadas +
                ", entregado=" + this.entregado +
                ", genero='" + this.genero + '\'' +
                ", compania='" + this.compania + '\'';
    }

    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
}
