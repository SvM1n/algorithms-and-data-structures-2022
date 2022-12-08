package ru.mirea.practice.s21k0647;

import java.util.Scanner;

public final class Punkt16 {
    private Punkt16() {
        //pust
    }

    public static int rec(int maxi, int c) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n > 0) {
                if (n > maxi) {
                    return rec(n, 1);
                } else if (n == maxi) {
                    return rec(maxi, c + 1);
                } else {
                    return rec(maxi, c);
                }
            } else {
                return c;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(rec(0, 0));
    }
}
