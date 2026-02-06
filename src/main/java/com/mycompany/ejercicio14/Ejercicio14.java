package com.mycompany.ejercicio14;

import java.util.Scanner;

class Numero {

    private double valor;

    public Numero(double valor) {
        this.valor = valor;
    }

    public double obtenerCuadrado() {
        return valor * valor;
    }

    public double obtenerCubo() {
        return valor * valor * valor;
    }
}

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numeroIngresado = sc.nextDouble();

        Numero num = new Numero(numeroIngresado);

        System.out.println("El cuadrado del número es: " + num.obtenerCuadrado());
        System.out.println("El cubo del número es: " + num.obtenerCubo());
    }
}
