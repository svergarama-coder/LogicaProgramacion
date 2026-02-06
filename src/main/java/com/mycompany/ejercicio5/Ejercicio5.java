package com.mycompany.ejercicio5;

class Operaciones {

    private double suma;
    private double x;
    private double y;

    public Operaciones() {
        suma = 0;
        x = 20;
    }

    public void calcular() {
        suma = suma + x;
        y = 40;
        x = x + Math.pow(y, 2);
        suma = suma + (x / y);
    }

    public double obtenerResultado() {
        return suma;
    }
}

public class Ejercicio5 {

    public static void main(String[] args) {

        Operaciones op = new Operaciones();
        op.calcular();

        System.out.println("EL VALOR DE LA SUMA ES: " + op.obtenerResultado());
    }
}
