package com.mycompany.ejercicio17;

import java.util.Scanner;

class Circulo {

    private double radio;
    private final double PI = 3.1416;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return PI * radio * radio;
    }

    public double calcularCircunferencia() {
        return 2 * PI * radio;
    }
}

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        Circulo c = new Circulo(radio);

        System.out.println("El área del círculo es: " + c.calcularArea());
        System.out.println("La longitud de la circunferencia es: " + c.calcularCircunferencia());
    }
}
