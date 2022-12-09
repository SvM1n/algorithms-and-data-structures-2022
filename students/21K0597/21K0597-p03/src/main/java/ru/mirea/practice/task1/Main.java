package ru.mirea.practice.task1;

import java.util.Random;

abstract class Main {
    public static void show(double[] array) {
        for (double a : array) {
            System.out.print(a + " ");
        }
    }

    public static void bubbleSort(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                Double temp = array[j];
                if (array[j] > array[j + 1]) {
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        double[] arr1 = new double[10];
        double[] arr2 = new double[10];
        Random rand = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Math.random();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rand.nextDouble();
        }
        System.out.print("first array: ");
        show(arr1);
        System.out.print("\n" + "Second array: ");
        show(arr2);
        bubbleSort(arr1);
        bubbleSort(arr2);
        System.out.print("\nfirst array: ");
        show(arr1);
        System.out.print("\nSecond array: ");
        show(arr2);
    }
}
