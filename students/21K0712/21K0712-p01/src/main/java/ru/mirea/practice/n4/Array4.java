package ru.mirea.practice.n4;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = 10;
            int[] a = new int[n];
            int sum = 0;
            int i = 0;
            int max = 0;
            int min = 999999;
            while (i <= n) {
                a[i] = sc.nextInt();
                sum += a[i];
                if (max < a[i]) {
                    max = a[i];
                }
                if (min > a[i]) {
                    min = a[i];
                }
                i++;
            }
            System.out.println("max = " + max + " min = " + min);
        } catch (InputMismatchException e) {
            System.out.println("Error");
            sc.nextInt();
        } finally {
            sc.close();
        }

    }
}
