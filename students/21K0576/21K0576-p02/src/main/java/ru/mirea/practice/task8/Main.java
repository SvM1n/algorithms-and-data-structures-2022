package ru.mirea.practice.task8;

import java.util.Scanner;

abstract class Main {
    public static void main(String[] args) {
        int arrS = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Размер массива: ");
            arrS = sc.nextInt();
            int[] arr = new int[arrS];
            System.out.print("Введите элементы: ");
            for (int i = 0; i < arrS; ++i) {
                arr[i] = sc.nextInt();
            }


            for (int i = 0; i < arrS; ++i) {
                System.out.printf("%d ", arr[i]);
            }

            for (int i = 0; i < arrS / 2; ++i) {
                int t = arr[i];
                arr[i] = arr[arrS - i - 1];
                arr[arrS - i - 1] = t;
            }
            System.out.print("\n");
            for (int i = 0; i < arrS; ++i) {
                System.out.printf("%d ", arr[i]);
            }
        }
    }
}
