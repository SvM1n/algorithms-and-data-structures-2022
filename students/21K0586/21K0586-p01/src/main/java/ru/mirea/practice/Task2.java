package ru.mirea.practice;

import java.util.Scanner;

public abstract class Task2 {
    public static void main(String[] args) {
        int n;
        try (Scanner c = new Scanner(System.in)) {
            System.out.println("Input quantity of array's numbers");
            n = c.nextInt();
            int[] array = new int[n];//создание массива
            System.out.println("Input array:");
            for (int i = 0; i < n; i++) {
                array[i] = c.nextInt();
            }
            int min = array[0];
            int max = array[0];
            int s = 0;
            s = array[0];
            int i = 1;
            while (i < n) {
                s = s + array[i];
                if (min > array[i]) {
                    min = array[i];
                }
                if (max < array[i]) {
                    max = array[i];
                }
                i++;
            }
            System.out.println("min = " + min + " max = " + max);
            System.out.println("Sum = " + s);
            System.out.println("average = " + (float) s / n);
        }
    }
}
