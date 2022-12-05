package ru.mirea.practice;

import java.util.Scanner;

public final class Program1 {
    private Program1() {
    }

    public static void main(String[] args) {
        double[] array = new double[10];
        double sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 10 numbers");
            for (int i = 0; i < array.length; i++) {
                while (!sc.hasNextDouble()) {
                    System.out.println("Invalid value entered");
                    sc.next();
                }
                array[i] = sc.nextDouble();
                sum += array[i];
            }
            System.out.println("Arithmetic mean: " + (sum / array.length));
        }
    }
}