package com.sofka.university.ejercicio_17;

import java.util.HashMap;
import java.util.Map;

public class Electrodomestico {

    private final Character[] LETRAS_CONSUMO_ENERGETICO = {'A', 'B', 'C', 'D', 'E', 'F'};

    private final Character CONSUMO_ENERGETICO_DEFAULT = 'F';
    private final String[] COLORES_LAVADORA_DISPONIBLES = {"blanco", "negro", "rojo", "azul", "gris"};

    private final String COLORE_LAVADORA_DEFAULT = "blanco";
    private final Integer PRECIOBASE = 100;
    private final Double PESO_DEFAULT = 5.0;
    private Integer precioConsumo = this.PRECIOBASE;
    private String color = this.COLORES_LAVADORA_DISPONIBLES[0];
    private Character consumoenergetico = this.LETRAS_CONSUMO_ENERGETICO[5];
    private Double peso = 0.0;

    public Electrodomestico() {
        this.precioConsumo = this.PRECIOBASE;
        this.color = this.COLORE_LAVADORA_DEFAULT;
        this.consumoenergetico = CONSUMO_ENERGETICO_DEFAULT;
        this.peso = this.PESO_DEFAULT;
    }

    public Electrodomestico(Integer precioConsumo, Double peso) {
        this.precioConsumo = precioConsumo;
        this.peso = peso;
    }

    public Electrodomestico(Integer precioConsumo, String color, Character consumoenergetico, Double peso) {
        this.precioConsumo = precioConsumo;
        this.color = color;
        this.consumoenergetico = consumoenergetico;
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letraConsumo) {
        for (char letra : LETRAS_CONSUMO_ENERGETICO) {
            if (letra == letraConsumo)
                this.consumoenergetico = letraConsumo;
            else this.consumoenergetico = LETRAS_CONSUMO_ENERGETICO[5];
        }
    }

    public void comprobarColor(String colorLavadora) {
        for (String color : COLORES_LAVADORA_DISPONIBLES) {
            if (color.equals(colorLavadora))
                this.color = colorLavadora;
            else this.color = COLORES_LAVADORA_DISPONIBLES[0];
        }
    }

    public int precioFinal() {
        int precioConsumo = precioPorConsumo();
        int  precioPorTamano = precioPorTamanoPequeno();
        int precioFinal = precioConsumo + precioPorTamano;
        return precioFinal;
    }

    public Integer precioPorConsumo() {
        Map<Character, Integer> precioConsumo = new HashMap<>();
        precioConsumo.put('A', 100);
        precioConsumo.put('B', 80);
        precioConsumo.put('C', 60);
        precioConsumo.put('D', 50);
        precioConsumo.put('E', 30);
        precioConsumo.put('F', 10);
        boolean verificarKey = precioConsumo.containsKey(this.consumoenergetico);
        if (verificarKey) {
            Integer precioLetra = precioConsumo.get(this.consumoenergetico);
            this.precioConsumo = this.PRECIOBASE + precioLetra;
            return  this.precioConsumo;
        }
       return this.precioConsumo = this.PRECIOBASE;
    }

    private Integer precioPorTamanoPequeno(){
        int precioPeso = 0;
        if (this.peso >= 0 && this.peso <= 19){
            precioPeso += 10;
            return precioPeso;
        }
       return precioPorTamanoMediano();
    }

    private Integer precioPorTamanoMediano(){
        int precioPeso = 0;
        if (this.peso >= 20 && this.peso <= 49){
            precioPeso += 50;
            return precioPeso;
        }
        return precioPorTamanoGrande();
    }

    private Integer precioPorTamanoGrande(){
        int precioPeso = 0;
        if (this.peso >= 50 && this.peso <= 79){
            return precioPeso += 80;
        }
        return precioPeso;
    }

    public Integer PrecioConsumo() {
        return precioConsumo;
    }

    public String Color() {
        return color;
    }

    public Character Consumoenergetico() {
        return consumoenergetico;
    }

    public Double Peso() {
        return peso;
    }
}
