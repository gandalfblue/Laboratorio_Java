package com.sofka.university.ejercicio_18;

public class Serie implements Entregable{

    private static final int NUMERO_TEMPORADAS = 3;
    private static final boolean ENTREGADO = false;

    private String titulo = "";
    private int numeroTemporadas = NUMERO_TEMPORADAS;
    private boolean entregado = ENTREGADO;
    private String genero = "";
    private String creador = "";


    public Serie() {
        Integer ent = numeroTemporadas;
        ent.compareTo((Integer) NUMERO_TEMPORADAS);

    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + this.titulo + '\'' +
                ", numeroTemporadas=" + this.numeroTemporadas +
                ", entregado=" + this.entregado +
                ", genero='" + this.genero + '\'' +
                ", creador='" + this.creador + '\'' +
                '}';
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
    public int compareTo(Object o) {
        int comparar = ((Integer) this.numeroTemporadas).compareTo(((Serie) o).getNumeroTemporadas());
        return comparar;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
}
