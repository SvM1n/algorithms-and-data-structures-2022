package ru.mirea.practice.task12;

import java.util.Scanner;

public abstract class OddNumbers {
    public static void recursion() {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            if (n > 0) {
                if (n % 2 == 1) {
                    System.out.println(n);
                    recursion();
                } else {
                    recursion();
                }
            }
        }
    }

    public static void main(String[] args) {
        recursion(); //
    }
}
