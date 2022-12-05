package ru.mirea.practice.task17;

import java.util.Scanner;

public abstract class MaximumOfSequence {
    public static int recursion() {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            if (n == 0) {
                return 0;
            } else {
                return Math.max(n, recursion());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion());
    }
}
