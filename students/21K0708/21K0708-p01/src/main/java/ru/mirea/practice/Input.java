package ru.mirea.practice;

import java.util.Scanner;

public final class Input {

    private Input() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int size = sc.nextInt();
            int[] array = new int[size];

            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            int sum = 0;
            int max = 0;
            int min = array[0];
            int j = 0;
            do {
                sum = sum + array[j];

                if (array[j] > max) {
                    max = array[j];
                } else if (array[j] < min) {
                    min = array[j];
                }

                j++;
            } while (j < size);
            System.out.printf("sum = %d\nmax = %d\nmin = %d\n", sum, max, min);

            sum = 0;
            max = 0;
            min = array[0];
            j = 0;
            while (j < size) {
                sum = sum + array[j];

                if (array[j] > max) {
                    max = array[j];
                } else if (array[j] < min) {
                    min = array[j];
                }

                j++;
            }
            System.out.printf("sum = %d\nmax = %d\nmin = %d", sum, max, min);
            sc.close();
        } catch (IncompatibleClassChangeError e) {
            System.out.println("Error");
            sc.next();
        } finally {
            sc.close();
        }
    }
}