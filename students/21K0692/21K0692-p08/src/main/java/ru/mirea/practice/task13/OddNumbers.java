package ru.mirea.practice.task13;

import java.util.Scanner;

public abstract class OddNumbers {
    public static void recursion() {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            if (n > 0) {
                int m = scanner.nextInt();
                System.out.println(n);
                if (m > 0) {
                    recursion();
                }
            }
        }
    }

    public static void main(String[] args) {
        recursion();
    }
}
