package com.sofka.university.ejercicio_1;

public class Ejercicio1 {

    private int numero1 = 4;
    private int numero2 = 4;

    public void numeroMayor(int numero1, int numero2) {
        if (numero1 > numero2) {
            System.out.println("El numero 1  es mayor que el numero 2");
            return;
        }
       Ejercicio1.numeroMenor(this.numero1, this.numero2);
    }

    static  void numeroMenor(int numero1, int numero2) {
        if (numero1  == numero2){
            System.out.println("Los numeros son iguales");
            return;
        }
        System.out.println("El numero 2 es mayor que el numero 1");
        return;
    }

    public static void main(String[] args) {
        Ejercicio1 respuesta = new Ejercicio1();
        respuesta.numeroMayor(respuesta.numero1, respuesta.numero2);
    }
}
