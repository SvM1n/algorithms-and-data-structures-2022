package ru.mirea.practice.task1;


import java.util.Arrays;
import java.util.Random;

public abstract class Array {
    private static void swap(double[] array, int i1, int i2) {
        double temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        double[] a1 = new double[10];
        double[] a2 = new double[10];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = Math.random() * 100;
        }
        System.out.println("randomized a1 = " + Arrays.toString(a1));
        for (int i = 0; i < a2.length; i++) {
            a2[i] = rand.nextDouble();
        }
        System.out.println("randomized a2 = " + Arrays.toString(a2) + "\n");
        boolean isOk = true;
        while (isOk) {
            isOk = false;
            for (int i = 1; i < a1.length; i++) {
                if (a1[i] < a1[i - 1]) {
                    swap(a1, i, i - 1);
                    isOk = true;
                }
            }
        }
        isOk = true;
        while (isOk) {
            isOk = false;
            for (int i = 1; i < a2.length; i++) {
                if (a2[i] < a2[i - 1]) {
                    swap(a2, i, i - 1);
                    isOk = true;
                }
            }
        }
        System.out.println("sorted a1 = " + Arrays.toString(a1));
        System.out.println("sorted a2 = " + Arrays.toString(a2));


    }
}

