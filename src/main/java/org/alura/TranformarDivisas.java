package org.alura;

import java.util.Scanner;

public class TranformarDivisas {
    public static void convertir(String monedaBase, String monedaTarget, ConseguirValor consulta, Scanner scanner) {
        double cantidad;
        double cantidadAConvertir;

        ValorMoneda moneda = consulta.buscarMonedas(monedaBase, monedaTarget);
        System.out.println("La tasa de conversion para hoy \n1 " + monedaBase + " = " + moneda.conversion_rate() + " " + monedaTarget);
        System.out.println("Ingrese la cantidad de " + monedaBase);
        cantidad = Double.parseDouble(scanner.nextLine());
        cantidadAConvertir = cantidad * moneda.conversion_rate();
        System.out.println(cantidad + " " + monedaBase + " = " + cantidadAConvertir + " " + moneda.target_code());
    }

    public static void convertirOtraMoneda(ConseguirValor consulta, Scanner lectura) {
        System.out.println("Ingresa el codigo de la moneda a buscar: ");
        String monedaABuscar = lectura.nextLine().toUpperCase();
        System.out.println("Ingresa el codigo de la moneda a convertir");
        String monedaConvertir = lectura.nextLine().toUpperCase();
        convertir(monedaABuscar, monedaConvertir, consulta, lectura);

    }

}
