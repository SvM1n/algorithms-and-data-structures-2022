package ru.mirea.practice.mathandrandom;

import java.util.Arrays;
import java.util.Random;

public final class Program1 {
    private Program1() {
    }

    public static void main(String[] args) {
        Random rand = new Random();
        double[] array = new double[5];
        System.out.println("Generated array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextDouble();
        }
        for (double j : array) {
            System.out.println(j + " ");
        }
        System.out.println("\nSorted array: ");
        Arrays.sort(array);
        for (double j : array) {
            System.out.println(j + " ");
        }
    }
}
