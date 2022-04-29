package com.sofka.university.ejercicio_17;

public class Television extends Electrodomestico{

    private final Integer RESOLUCION_DEFAULT = 20;
    private final Boolean SINTONIZADOR_DEAFAULT = false;
    private Integer resolucion = this.RESOLUCION_DEFAULT;
    private Boolean sintonizadorTDT = this.SINTONIZADOR_DEAFAULT;

    public Television() {
        super();
        this.resolucion = this.RESOLUCION_DEFAULT;
        this.sintonizadorTDT = this.SINTONIZADOR_DEAFAULT;
    }

    public Television(Integer precioConsumo, Double peso) {
        super(precioConsumo, peso);
    }

    public Television(Integer precioConsumo, String color, Character consumoenergetico,
                      Double peso, Integer resolucion, Boolean sintonizadorTDT) {
        super(precioConsumo, color, consumoenergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public int precioFinal(){
        int precioFinal = super.precioFinal();
        precioFinal += precioPorTDT();
        precioFinal += precioPorResolution();
        return precioFinal;

    }

    protected double precioPorResolution() {
        double precioResolucion = 0;
        if (this.resolucion > 40) precioResolucion= super.precioFinal() * 0.3;
        return precioResolucion;
    }

    protected double precioPorTDT() {
        double precioTDT = 0;
        if (this.sintonizadorTDT) precioTDT = 50;
        return precioTDT;
    }

    @Override
    public String toString() {
        return "Television{" +
                "precio_base=" + super.PrecioConsumo() +
                ", color='" + super.Color() + '\'' +
                ", consumo_energetico=" + super.Consumoenergetico() +
                ", peso=" + super.Peso()+
                ", resolution=" + this.resolucion +
                ", sincronizador_tdt=" + this.sintonizadorTDT +
                '}';
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }
}
