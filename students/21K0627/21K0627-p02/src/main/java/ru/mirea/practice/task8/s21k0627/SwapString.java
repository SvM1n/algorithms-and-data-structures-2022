package ru.mirea.practice.task8.s21k0627;

import java.util.Scanner;

public abstract class SwapString {
    public static void swapElem(String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (String i : array) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = 0;
            do {
                System.out.println("Введите кол-во объектов ");
                if (sc.hasNextInt()) {
                    n = sc.nextInt();
                }
            } while (n < 0);
            String[] array = new String[n];
            System.out.println("Введите объекты::");
            for (int i = 0; i < n; i++) {
                array[i] = sc.next();
            }
            for (String i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
            swapElem(array);
        }
    }
}
