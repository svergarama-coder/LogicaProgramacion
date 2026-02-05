package com.mycompany.ejercicion12;

public class EjercicioN12 {

    public static void main(String[] args) {

        int horasTrabajadas = 48;
        int valorHora = 5000;
        double porcentajeRetencion = 12.5;

        double salarioBruto = horasTrabajadas * valorHora;
        double retencion = salarioBruto * porcentajeRetencion / 100;
        double salarioNeto = salarioBruto - retencion;

        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Retención en la fuente: $" + retencion);
        System.out.println("Salario Neto: $" + salarioNeto);
    }
}
