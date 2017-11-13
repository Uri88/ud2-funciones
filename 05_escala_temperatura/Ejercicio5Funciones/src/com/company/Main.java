package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double convertirTemperatura(int escala, double r, double a) {

        if (escala == 1) {

            r = (a - 32) / 1.8;

        }

        if (escala == 2) {

            r = a + 273.15;

        }


        return r;
    }

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double r = 0;
        double a = 0;
        int escala = 0;


        do {

            System.out.print("=== Temperaturas ===\n" +
                    "1. Convertir a Fahrenheit\n" +
                    "2. Convertir a Kelvin\n" +
                    "3. Salir\n" +
                    "Opción:");

            escala = Integer.parseInt(br.readLine());

            switch (escala) {

                case 1:

                    System.out.print("Introduce un valor para convertir a Fahreinheit: ");
                    a = Double.parseDouble(br.readLine());
                    break;

                case 2:

                    System.out.print("Introduce un valor para convertir a Kelvin: ");
                    a = Double.parseDouble(br.readLine());
                    break;

                case 3:
                    System.out.print("Saliendo...");
                    break;

                default:
                    System.out.println("ERROR. Parametro no valido");
                    break;


            }
            System.out.println("El resultado es: " + (convertirTemperatura(escala, a, r)));
        } while (escala != 3);
    }
}
