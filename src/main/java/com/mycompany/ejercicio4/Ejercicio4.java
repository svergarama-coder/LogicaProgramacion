
package com.mycompany.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Datos de entrada
        int edadJuan;
        int edadAlberto;
        int edadAna;
        int edadMama;

        System.out.print("Ingrese la edad de Juan: ");
        edadJuan = sc.nextInt();

        // Proceso
        edadAlberto = (2 * edadJuan) / 3;
        edadAna = (4 * edadJuan) / 3;
        edadMama = edadJuan + edadAlberto + edadAna;

        // Salida
        System.out.println("LAS EDADES SON:");
        System.out.println("ALBERTO = " + edadAlberto);
        System.out.println("JUAN = " + edadJuan);
        System.out.println("ANA = " + edadAna);
        System.out.println("MAMA = " + edadMama);
    }
}
