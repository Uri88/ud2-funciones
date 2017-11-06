package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean esPar(int a){
       int b = a / 2;
        return true;

    }

    public static boolean esImpar(int a){

        int b = a / 2;
        return false;
    }
    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce un numero: ");
        int n = Integer.parseInt(br.readLine());

        if (n%2==0){

            System.out.print(esPar(n));
        } else {

            System.out.print(esImpar(n));
        }

    }
}
