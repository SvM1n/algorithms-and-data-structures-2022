package ru.mirea.practice.mathsandrandom.program4;

import java.util.Scanner;

import java.util.Random;

abstract class Test4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            while (n <= 0) {
                System.out.print("Enter n: ");
                n = sc.nextInt();
            }
            int[] arr1 = new int[n];
            Random rand = new Random();
            int counter = 0;
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = rand.nextInt(n + 1);
                if (arr1[i] % 2 == 0) {
                    counter++;
                }
                System.out.print(arr1[i] + " ");
            }
            System.out.print("\n");
            int[] arr2 = new int[counter];
            int j = 0;
            for (int k : arr1) {
                if (k % 2 == 0) {
                    arr2[j] = k;
                    System.out.print(arr2[j] + " ");
                    j++;
                }
            }
        }
    }
}