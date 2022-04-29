package com.sofka.university.ejercicio_16;

import java.util.Random;

public class Persona {

    private final Integer BAJOPESO = -1;
    private final Integer PESONORMAL = 0;
    private final Integer SOBREPESO = 1;
    private final char[] LETRASDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    private final Double PESO_DEFAULT = 0D;

    private final Integer EDAD_DEFAULT = 0;

    private final Double ALTURA_DEFAULT = 0D;

    private final String NOMBRE_DEFAULT = "";

    private final Character SEXODEFAULT = 'H';
    private String nombre;
    private Integer edad;
    private Integer dni;
    private Double peso;
    private Double altura;
    private Character sex;

    public Persona() {
        this.nombre = this.NOMBRE_DEFAULT;
        this.edad = this.EDAD_DEFAULT;
        this.peso = this.PESO_DEFAULT;
        this.altura = this.ALTURA_DEFAULT;
        this.sex = this.SEXODEFAULT;
        this.dni = this.generarNumeroDNI();
    }

    public Persona(String nombre, Integer edad, Double peso, Double altura, Character sex, Integer dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sex = sex;
        this.dni = generarNumeroDNI();
    }

    public Persona(String nombre, Integer edad, Double peso, Double altura, Character sex) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sex = sex;
        comprobarSexo(this.sex);
    }

    public Persona(String nombre, Integer edad, Character sex) {
        this.nombre = nombre;
        this.edad = edad;
        this.sex = sex;
    }

    public String calcularIMC() {
        System.out.println("this.peso = " + this.peso);
        double peso = this.peso / (Math.pow(this.altura, 2));
        System.out.println("peso = " + peso);
        if (peso == 0) {
            String mensaje = " desconocemos su peso";
            return mensaje;

        }
        int pesoActual = isBajoPeso(peso);
        String mensajePeso = mensajeBajoPeso(pesoActual);
        return mensajePeso;
    }

    private Integer isBajoPeso(Double peso) {
        if (peso < 20) {
            return this.BAJOPESO;
        }
        return isSobrePeso(peso);
    }

    private Integer isSobrePeso(Double peso) {
        if (peso > 25) {
            return this.SOBREPESO;
        }
        return this.PESONORMAL;
    }

    private String mensajeBajoPeso(int pesoActual) {
        if (pesoActual == -1) {
            return " usted tiene bajo peso.";
        }
        return mensajeSobrePeso(pesoActual);
    }

    private String mensajeSobrePeso(int pesoActual) {
        if (pesoActual == 1) {
            return " usted tiene sobre peso.";
        }
        return " usted tiene su peso ideal.";
    }

    public String verificarMayorEdad() {
        if (this.edad >= 18) {
            return " es mayor de edad";
        }
        return  " no es mayor de edad";
    }

        private void comprobarSexo ( char sexo){
            if (sexo != 'H' && sexo != 'M') this.sex = this.SEXODEFAULT;
            else this.sex = sexo;
        }

        @Override
        public String toString () {
            String mensaje = "Nombre: " + this.nombre + "\n"
                                        + "Edad: " + this.edad + "\n"
                                        + "DNI: " + this.dni + "\n"
                                         + "Peso: " + this.peso + "\n"
                                          + "Altura: " + this.altura + "\n"
                                          + "Sexo: " + this.sex;
            return mensaje;
        }

        private Integer generarNumeroDNI () {
            Random numeroRandom = new Random();
            int dni = numeroRandom.nextInt(99999999);
            return dni;
        }

        private String generarDNI () {
            int numeroDNI = generarNumeroDNI();
            char letraDNI = LETRASDNI[(numeroDNI % 23)];
            return "" + numeroDNI + letraDNI;
        }


        public String Nombre () {
            return nombre;
        }

        public Integer Edad () {
            return edad;
        }

        public void modificarEdad (Integer edad){
            this.edad = edad;
        }

        public Integer Dni () {
            return dni;
        }

        public Double Peso () {
            return peso;
        }

        public void modificarPeso (Double peso){
            this.peso = peso;
        }

        public Double Altura () {
            return altura;
        }

        public void modificarAltura (Double altura){
            this.altura = altura;
        }

        public Character Sex () {
            return sex;
        }

        public void modificarSex (Character sex){
            this.sex = sex;
        }
    }


