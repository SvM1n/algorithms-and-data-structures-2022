package ru.mirea.practice.task8;

import java.util.Scanner;

public abstract class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
            }
            for (int j : array) {
                System.out.print(j + "\t");
            }
            System.out.println();
            int temp = 0;
            for (int i = 0; i < array.length / 2; i++) {
                temp = array[i];
                array[i] = array[n - i - 1];
                array[n - i - 1] = temp;
            }
            for (int j : array) {
                System.out.print(j + "\t");
            }
        } finally {
            sc.close();
        }
    }
}
