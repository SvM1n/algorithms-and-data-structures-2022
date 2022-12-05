package ru.mirea.practice.n3;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Array3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = 10;
            int[] a = new int[n];
            int sum = 0;
            double srarifm = 0;
            for (int i = 1; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            srarifm = sum / n;
            System.out.println("sum = " + sum + " srarifm = " + srarifm);
        } catch (InputMismatchException e) {
            System.out.println("Error");
            sc.nextInt();
        } finally {
            sc.close();
        }
    }

}
