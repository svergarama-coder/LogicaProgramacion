package com.mycompany.ejercicio4;

import java.util.Scanner;

class Familia {

    private double edadJuan;
    private double edadAlberto;
    private double edadAna;
    private double edadMama;

    public Familia(double edadJuan) {
        this.edadJuan = edadJuan;
        calcularEdades();
    }

    private void calcularEdades() {
        edadAlberto = (2.0 / 3.0) * edadJuan;
        edadAna = (4.0 / 3.0) * edadJuan;
        edadMama = edadJuan + edadAlberto + edadAna;
    }

    public double getEdadJuan() {
        return edadJuan;
    }

    public double getEdadAlberto() {
        return edadAlberto;
    }

    public double getEdadAna() {
        return edadAna;
    }

    public double getEdadMama() {
        return edadMama;
    }
}

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la edad de Juan: ");
        double edadJuan = sc.nextDouble();

        Familia familia = new Familia(edadJuan);

        System.out.println("Edad de Juan: " + familia.getEdadJuan());
        System.out.println("Edad de Alberto: " + familia.getEdadAlberto());
        System.out.println("Edad de Ana: " + familia.getEdadAna());
        System.out.println("Edad de la mamá: " + familia.getEdadMama());
    }
}

