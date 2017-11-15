package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int fiborepe(int n) {

        int fiborepe;
        if (n == 1) {

            return 0;
        } else if (n == 2 || n == 3) {

            return 1;

        } else {

            return fiborepe(n - 1) + fiborepe(n - 2);
        }
    }
    public static int fiboite() {


        return 0;
    }


    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Introduce un numero: ");
        int n = Integer.parseInt(br.readLine());

        System.out.println(fiborepe(n));

    }
}
