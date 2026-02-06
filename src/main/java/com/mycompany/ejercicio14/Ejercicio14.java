package com.mycompany.ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero;
        double cuadrado;
        double cubo;

        System.out.print("Ingrese un número: ");
        numero = sc.nextDouble();

        cuadrado = Math.pow(numero, 2);
        cubo = Math.pow(numero, 3);

        System.out.println("El cuadrado es: " + cuadrado);
        System.out.println("El cubo es: " + cubo);
    }
}
