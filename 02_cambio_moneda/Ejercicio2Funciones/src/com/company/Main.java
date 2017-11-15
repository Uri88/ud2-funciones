package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static double calcularCambio(double a, String opcion) {

        double cambio=0;

        switch (opcion) {

            case "usd":
                cambio = a * 1.16;
                break;
            case "gbp":
                cambio = a * 0.88;
                break;
            case "cny":
                cambio = a * 7.7;
                break;
            case "jpy":
                cambio = a * 132.54;
                break;
        }


        return cambio;
    }

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce una cantidad en Euros: ");
        double cantidad = Double.parseDouble(br.readLine());

        System.out.println("Moneda a la que convertir (USD, GBP, CNY, JPY): ");
        String convertir = br.readLine().toLowerCase();

        switch (convertir) {

            case "usd":
                System.out.println("--- " + cantidad + " euros son " + calcularCambio(cantidad, convertir) + " dolares ---");
                break;
            case "gbp":
                System.out.println("--- " + cantidad + " euros son " + calcularCambio(cantidad, convertir) + " libras ---");
                break;
            case "cny":
                System.out.println("--- " + cantidad + " euros son " + calcularCambio(cantidad, convertir) + " yuanes ---");
                break;
            case "jpy":
                System.out.println("--- " + cantidad + " euros son " + calcularCambio(cantidad, convertir) + " yenes ---");
                break;

        }

    }
}
