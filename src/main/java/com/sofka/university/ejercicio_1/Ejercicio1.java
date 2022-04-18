package com.sofka.university.ejercicio_1;

/*
*Verifica si un numero es mayor, menor o igual a otro numero
 */
public class Ejercicio1 {

    private int numero1 = 4;
    private int numero2 = 4;

    public Ejercicio1() {
    }

    public void numeroMayor(int numero1, int numero2) {
        if (numero1 > numero2) {
            System.out.println("El numero 1  es mayor que el numero 2");
            return;
        }
       this.numeroMenor(this.numero1, this.numero2);
    }

    private static  void numeroMenor(int numero1, int numero2) {
        if (numero1  == numero2){
            System.out.println("Los numeros son iguales");
            return;
        }
        System.out.println("El numero 2 es mayor que el numero 1");
    }

    public int Numero1() {
        return numero1;
    }

    public int Numero2() {
        return numero2;
    }

    public static void main(String[] args) {
        Ejercicio1 respuesta = new Ejercicio1();
        respuesta.numeroMayor(respuesta.Numero1(), respuesta.Numero2());
    }
}
