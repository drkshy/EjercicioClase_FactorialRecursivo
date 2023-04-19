package com.pperezm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el número al cual calcular factorial");
        num = scanner.nextInt();
        System.out.println("El factorial del número es: " + FactorialRecursivo(num));

    }

    public static double FactorialRecursivo(double n) {
            if (n <= 1)
                return 1;
            return n * FactorialRecursivo(n-1);
    }
}
