package ru.mirea.practice.s21k0627.mathrandom;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public abstract class Task4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = 0;
            do {
                System.out.println("Enter amount of elements of array: ");
                if (sc.hasNextInt()) {
                    n = sc.nextInt();
                }
            } while (n <= 0);
            int[] array = new int[n];
            Random rand = new Random();
            for (int i = 0; i < n; i++) {
                array[i] = 1 + rand.nextInt(10);
            }
            ArrayList<Integer> evenarray = new ArrayList<Integer>();
            System.out.println("Your array: ");
            for (int i : array) {
                System.out.print(i + " ");
                if (i % 2 == 0) {
                    evenarray.add(i);
                }

            }
            System.out.println("\nOnly even elements: ");
            for (Integer i : evenarray) {
                System.out.print(i + " ");
            }
        }
    }
}
