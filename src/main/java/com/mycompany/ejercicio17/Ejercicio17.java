package com.mycompany.ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double radio;
        double area;
        double circunferencia;
        double PI = 3.1416;

        System.out.print("Ingrese el radio del círculo: ");
        radio = sc.nextDouble();

        area = PI * Math.pow(radio, 2);
        circunferencia = 2 * PI * radio;

        System.out.println("El área del círculo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + circunferencia);
    }
}
