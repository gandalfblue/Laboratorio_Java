package com.sofka.university.ejercicio_17;

public class Ejercicio17 {

    public static void main(String[] args) {

        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Electrodomestico(10, "azul", 'E', 20.0);
        electrodomesticos[1] = new Electrodomestico(60, "verde", 'B', 15.0);
        electrodomesticos[2] = new Electrodomestico(10, 30.0);
        electrodomesticos[3] = new Electrodomestico(100, 40.0);

        electrodomesticos[4] = new Lavadora();
        electrodomesticos[5] = new Lavadora(50, 25.0);
        electrodomesticos[6] = new Lavadora(150, "", 'A', 35.0, 40);

        electrodomesticos[7] = new Television();
        electrodomesticos[8] = new Television(500, 12.0);
        electrodomesticos[9] = new Television(400, "negro", 'F', 10.0, 120, true);

        double precioElectrodomesticos = 0;
        double precioLavadoras = 0;
        double precioTelevisores = 0;


        for (Electrodomestico elemento : electrodomesticos) {
            if (elemento instanceof Electrodomestico) precioElectrodomesticos += elemento.precioFinal();
            if (elemento instanceof Lavadora) precioLavadoras += elemento.precioFinal();
            if (elemento instanceof Television) precioTelevisores += elemento.precioFinal();
        }

        System.out.println("Precio Electrodomesticos = " + precioElectrodomesticos);
        System.out.println("Precio Televisores = " + precioTelevisores);
        System.out.println("Precio Lavadoras = " + precioLavadoras);
    }
}
