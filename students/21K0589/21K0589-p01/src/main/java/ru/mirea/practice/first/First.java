package ru.mirea.practice.first;

import java.util.Scanner;

abstract class First {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Длина массива: ");
            int n = input.nextInt();
            int sum = 0;
            if (n > 0) {
                int[] arr = new int[n];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = input.nextInt();
                    sum += arr[i];

                }
                double sred = (double) sum / n;
                System.out.println("Сумма чисел: " + sum);
                System.out.println("Среднее арифмитическое: " + sred + "\n");
            } else {
                System.out.println("Введите правильное число");
            }
        }
    }
}