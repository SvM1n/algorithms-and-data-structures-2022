package ru.mirea.practice.task11;

import java.util.Scanner;

public abstract class NumberOfUnits {
    public static int recursion() {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            if (n == 1) {
                int m = scanner.nextInt();
                if (m == 1) {
                    return recursion() + n + m;
                } else {
                    int k = scanner.nextInt();
                    if (k == 1) {
                        return recursion() + n + m + k;
                    } else {
                        return n + m + k;
                    }
                }
            } else {
                int m = scanner.nextInt();
                if (m == 1) {
                    return recursion() + n + m;
                } else {
                    return n + m;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion());
    }
}
