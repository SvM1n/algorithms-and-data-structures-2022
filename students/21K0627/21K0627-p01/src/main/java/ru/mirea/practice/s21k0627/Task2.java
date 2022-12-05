package ru.mirea.practice.s21k0627;

import java.util.Scanner;

abstract class Task2 {
    public static void main(String[] args) {
        int n = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите длину массива: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
            }
            int[] arr = new int[n];
            int in;
            int j = 0;
            System.out.println("Введите массив: ");
            while (j < arr.length) {
                in = sc.nextInt();
                arr[j] = in;
                j++;
            }

            int maxNumber = arr[0];
            int minNumber = arr[0];
            int sum = 0;
            for (int k : arr) {
                if (k < minNumber) {
                    minNumber = k;
                }
                if (k > maxNumber) {
                    maxNumber = k;
                }
                sum += k;
            }
            System.out.println();
            System.out.println("Сумма элементов массива: " + sum);
            System.out.println("Макс элемент массива: " + maxNumber);
            System.out.println("Мин элемент массива: " + minNumber);
        }
    }
}
