package ru.mirea.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Main {
    public static int abs(int a) {
        if (a > 0) {
            return a;
        } else {
            return a * (-1);
        }
    }

    public static int mod(int a) {
        if (a > 0) {
            for (int i = a - 1; i >= 1; i--) {
                a *= i;
            }
            return a;
        } else {
            System.out.println("Ошибка");
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[6];
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        try {
            for (int i = 0; i <= 5; i++) {
                a[i] = scanner.nextInt();
            }

            int sum = 0;
            int k = 0;
            do {
                sum += a[k];
                k++;
            } while (k <= 5);

            System.out.println("\n");
            System.out.println(sum);

            k = 0;
            int j = 1;
            int max;
            while (a[k] < a[j]) {
                if (j == 5) {
                    k++;
                    j = k + 1;
                } else {
                    j++;
                }

            }
            max = a[j];
            System.out.println("\n");
            System.out.println(max);

            for (int i = 0; i <= 5; i++) {
                System.out.println(a[i]);
            }
            int b = 0;
            for (int i = 0; i <= 5; i++) {
                b += a[i];
            }
            b /= 6;
            System.out.println(b);

            double o;

            for (double i = 1; i <= 10; i++) {
                o = 1 / i;
                System.out.println(o);
            }

            System.out.println(abs(-7));

            System.out.println(mod(3));
        } catch (InputMismatchException e) {
            System.out.println("Error");
            scanner.nextInt();
        } finally {
            scanner.close();
        }
    }
}
