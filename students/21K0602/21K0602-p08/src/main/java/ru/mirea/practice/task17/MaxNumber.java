package ru.mirea.practice.task17;

import java.util.Scanner;

public abstract class MaxNumber {

    public static int recursion() {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            if (n != 0) {
                return Math.max(n, recursion());
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion());
    }
}
