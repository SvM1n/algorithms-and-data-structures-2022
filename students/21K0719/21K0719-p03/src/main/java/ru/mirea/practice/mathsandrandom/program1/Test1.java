package ru.mirea.practice.mathsandrandom.program1;

import java.util.Random;

import java.util.Scanner;

abstract class Test1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array:");
            int n = sc.nextInt();
            double[] randArr = new double[n];
            double[] mathArr = new double[n];
            Random rand = new Random();
            for (int i = 0; i < n; i++) {
                randArr[i] = rand.nextFloat();
                System.out.printf("%.2f ", randArr[i]);
            }
            System.out.print("\n");
            for (int j = 0; j < n; j++) {
                mathArr[j] = Math.random() * 10;
                System.out.printf("%.2f ", mathArr[j]);
            }
            System.out.println("\n");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (randArr[i] < randArr[j]) {
                        double temp;
                        temp = randArr[i];
                        randArr[i] = randArr[j];
                        randArr[j] = temp;
                    }
                    if (mathArr[i] < mathArr[j]) {
                        double temp;
                        temp = mathArr[i];
                        mathArr[i] = mathArr[j];
                        mathArr[j] = temp;
                    }
                }
            }
            for (double num : randArr) {
                System.out.printf("%.2f ", num);
            }
            System.out.print("\n");
            for (double num : mathArr) {
                System.out.printf("%.2f ", num);
            }
        }
    }
}
