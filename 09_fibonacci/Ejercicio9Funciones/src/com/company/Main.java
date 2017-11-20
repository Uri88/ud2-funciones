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

    public static int fiboite(int n) {

        int a = 0;
        int b = 1;
        int c;

        for (int i = 0; i < n; i++) {
            c = b + a;
            a = b;
            b = c;

        }

        return a;
    }


    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Introduce un numero: ");
        int n = Integer.parseInt(br.readLine());

        System.out.println(fiborepe(n));
        System.out.println(fiboite(n));

    }
}
