package ru.mirea.practice.task16;

import java.util.Scanner;

public abstract class EqualToMaximum {
    public static void recursion(int max, int count) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            if (n > 0) {
                if (n > max) {
                    recursion(n, 1);
                } else if (n == max) {
                    recursion(max, ++count);
                } else {
                    recursion(max, count);
                }
            } else {
                System.out.println(count);
            }
        }
    }

    public static void main(String[] args) {
        recursion(0, 0);
    }
}
