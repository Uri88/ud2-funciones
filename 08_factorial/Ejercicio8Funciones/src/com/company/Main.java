package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int factorepe(int a) {

        int resultado = 1;

        for (int i = 1; i <= a; i++) {

            resultado *= i;
        }
        return resultado;
    }

    public static int factorecu(int a) {
        if (a == 0)
            return 1;
        else
            return a * (factorecu(a - 1));
    }

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Introduce un valor: ");
        int a = Integer.parseInt(br.readLine());


        System.out.println("El factorial reiterativo de " + 'a' + " es: " + (factorepe(a)));

        System.out.println("El factorial recursivo de " + 'a' + " es: " + (factorecu(a)));


    }
}
