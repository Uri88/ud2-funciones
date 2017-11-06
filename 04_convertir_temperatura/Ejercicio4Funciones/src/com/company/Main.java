package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double convertirTemperatura(double a){

        double resultado = (a-32)/1.8;

        return resultado;
    }


    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce una temperatura en ºC: ");
        double centi = Double.parseDouble(br.readLine());

        System.out.println("El valor en Fahrenheit es: "+convertirTemperatura(centi));



    }
}
