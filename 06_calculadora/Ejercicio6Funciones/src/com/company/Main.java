package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double longitud(double r, double π) {

        double resultado = 2 * π * r;
        return resultado;
        //return = 2 * π * r; Puedes devolverlo en una misma linea
    }

    public static double area(double r, double π) {

        double resultado = π * (r * r);
        //Math.pow(r,2) para elevar al cuadrado
        return resultado;
    }

    public static double volumen(double r, double π) {

        double resultado = (4 / 3) * π * (r * r * r);
        return resultado;
    }

    public static void main(String[] args) throws IOException {
        // write your code here

        double π = 3.14159265359;
        //Math.PI para poner el numerp pi
        char opcion;
        double r=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        do {
            System.out.print("\n=== Calculadora ===\n" +
                    "a) Longitud de la circunferencia\n" +
                    "b) Área del círculo\n" +
                    "c) Volumen de la esfera\n" +
                    "d) Salir\n" +
                    "Opción:");

            opcion = br.readLine().toLowerCase().charAt(0);


            if (opcion =='a' || opcion =='b' || opcion =='c'){
                System.out.print("Introduce un radio: ");
                r = Double.parseDouble(br.readLine());
            }


            switch (opcion) {

                case 'a':
                    System.out.println("\nEl resultado de la Longitud es: " + (longitud(r, π)));
                    break;

                case 'b':
                    System.out.println("\nEl resultado del Area es: " + (area(r, π)));
                    break;

                case 'c':
                    System.out.println("\nEl resultado del Volumen es: " + (volumen(r, π)));
                    break;

                case 'd':
                    System.out.println("\nSaliendo...");
                    break;

                default:
                    System.out.println("\nERROR. Parametro no valido.");
                    break;


            }
        } while (opcion != 'd');
    }
}
