package ru.mirea.practice.task11;

import java.util.Scanner;

public abstract class HowManyOnes {

    public static int recursion() {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int m = in.nextInt();
            if (n == 1) {
                if (m == 1) {
                    return recursion() + n + m;
                } else {
                    int k = in.nextInt();
                    if (k == 1) {
                        return recursion() + n + m + k;
                    } else {
                        return n + m + k;
                    }
                }
            } else {
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
