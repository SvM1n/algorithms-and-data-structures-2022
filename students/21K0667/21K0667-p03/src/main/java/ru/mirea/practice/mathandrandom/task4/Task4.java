package ru.mirea.practice.mathandrandom.task4;

import java.util.Scanner;

abstract class Task4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = 0;
            do {
                n = sc.nextInt();
            } while (n <= 0);
            int[] dig = new int[n];
            int counter = 0;
            for (int i = 0; i < n; i++) {
                dig[i] = (int) (Math.random() * (n + 1));
                System.out.println(dig[i]);
                if (dig[i] % 2 == 0) {
                    counter++;
                }
            }

            System.out.println("\nEven: ");
            int[] digeven = new int[counter];
            for (int i = 0; i < n; i++) {
                counter = 0;
                if (dig[i] % 2 == 0) {
                    digeven[counter] = dig[i];
                    System.out.println(digeven[counter++]);
                    counter++;
                }
            }
        }

    }
}
