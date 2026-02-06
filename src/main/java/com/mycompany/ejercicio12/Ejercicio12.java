package com.mycompany.ejercicio12;

class Empleado {

    private int horasTrabajadas;
    private double valorHora;
    private double porcentajeRetencion;

    public Empleado(int horasTrabajadas, double valorHora, double porcentajeRetencion) {
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    public double calcularSalarioBruto() {
        return horasTrabajadas * valorHora;
    }

    public double calcularRetencion() {
        return calcularSalarioBruto() * porcentajeRetencion;
    }

    public double calcularSalarioNeto() {
        return calcularSalarioBruto() - calcularRetencion();
    }
}

public class Ejercicio12 {

    public static void main(String[] args) {

        int horas = 48;
        double valorHora = 5000;
        double retencion = 0.125;

        Empleado empleado = new Empleado(horas, valorHora, retencion);

        System.out.println("Salario bruto: $" + empleado.calcularSalarioBruto());
        System.out.println("Retención en la fuente: $" + empleado.calcularRetencion());
        System.out.println("Salario neto: $" + empleado.calcularSalarioNeto());
    }
}
