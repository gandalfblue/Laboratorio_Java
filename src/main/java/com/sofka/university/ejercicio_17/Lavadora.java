package com.sofka.university.ejercicio_17;

public class Lavadora extends Electrodomestico {

    private final Integer CARGA_DEFAULT = 5;
    private Integer carga = this.CARGA_DEFAULT;

    public Lavadora() {
        super();
        this.carga = this.CARGA_DEFAULT;
    }

    public Lavadora(Integer carga) {
        this.carga = carga;
    }

    public Lavadora(Integer precioConsumo, Double peso) {
        super(precioConsumo, peso);
    }

    public Lavadora(Integer precioConsumo, String color, Character consumoenergetico,
                    Double peso, Integer carga) {
        super(precioConsumo, color, consumoenergetico, peso);
        this.carga = carga;
    }

    public int precioFinalLavadera(){
        int precioFinal = this.precioFinal();
        precioFinal += this.carga >30 ? 50 : 0;
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio_base=" + super.PrecioConsumo() +
                ", color='" + super.Color() + '\'' +
                ", consumo_energetico=" + super.Consumoenergetico() +
                ", peso=" + super.Peso() +
                ", carga=" + this.carga +
                '}';
    }
}
