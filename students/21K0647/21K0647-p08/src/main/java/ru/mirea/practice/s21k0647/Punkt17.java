package ru.mirea.practice.s21k0647;

import java.util.Scanner;

public final class Punkt17 {
    private Punkt17() {

    }

    public static int rec(int max) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n > 0) {
                if (n > max) {
                    return rec(n);
                } else {
                    return rec(max);
                }
            } else {
                return max;
            }

        }
    }

    public static void main(String[] args) {
        System.out.println(rec(0));
    }

}
