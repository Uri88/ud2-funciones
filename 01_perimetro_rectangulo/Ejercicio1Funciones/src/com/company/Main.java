package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int perimetroRectangulo(int altura, int base){

        int area = 2*(base+altura);
        return area;
    }

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce una base: ");
        int a = Integer.parseInt(br.readLine());

        System.out.print("Introduce una altura: ");
        int b = Integer.parseInt(br.readLine());

        System.out.println(perimetroRectangulo(a, b));

    }
}
