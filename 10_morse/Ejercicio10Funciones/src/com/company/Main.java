package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void morse(char opcion) {

        switch (opcion) {

            case 'a':
                System.out.print(" · — ");
                break;

            case 'b':
                System.out.print(" — · · · ");
                break;

            case 'c':
                System.out.print(" — · — · ");
                break;

            case 'd':
                System.out.print(" — · · ");
                break;

            case 'e':
                System.out.print(" · ");
                break;

            case 'f':
                System.out.print(" · · — · ");
                break;

            case ' ':
                System.out.print(" ");
                break;

        }


    }

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i;
        String codigo = " ";

        do {

            System.out.println("\nEscribe el texto que quieras convertir a codigo Morse: ");
            codigo = br.readLine().toLowerCase();


            for (i = 0; i < codigo.length(); i++) {
                morse(codigo.charAt(i));
            }
        } while (!codigo.equalsIgnoreCase("stop"));
        System.out.println("Saliendo...");

    }
}
