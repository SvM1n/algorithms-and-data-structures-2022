package ru.mirea.practice;

import java.util.Scanner;

public final class Program2 {
    private Program2() {
    }

    public static void main(String[] args) {
        int i = 0;
        double sum = 0;
        double max = 0;
        double min = (int) Math.pow(10, 7);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of array elements");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid value entered");
                sc.next();
            }
            int n = sc.nextInt();
            double[] array = new double[n];
            System.out.println("Enter " + n + " numbers");
            do {
                while (!sc.hasNextDouble()) {
                    System.out.println("Invalid value entered");
                    sc.next();
                }
                array[i] = sc.nextDouble();
                sum += array[i];
                i++;
            } while (i < array.length);
            i = 0;
            while (i < array.length) {
                if (max < array[i]) {
                    max = array[i];
                }
                if (min > array[i]) {
                    min = array[i];
                }
                i++;
            }
            System.out.println("Sum: " + sum + "\nMax: " + max + "\nMin: " + min);
        }
    }
}