package ru.mirea.practice;

import java.util.Scanner;

public final class Program5 {
    private Program5() {
    }

    static int factorial(int n) {
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a *= i;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number whose factorial you want to calculate");
        try (Scanner sc = new Scanner(System.in)) {
            while (!sc.hasNextInt()) {
                System.out.println("Invalid value entered");
                sc.next();
            }
            int x = sc.nextInt();
            System.out.println(x + "! = " + factorial(x));
        }
    }
}