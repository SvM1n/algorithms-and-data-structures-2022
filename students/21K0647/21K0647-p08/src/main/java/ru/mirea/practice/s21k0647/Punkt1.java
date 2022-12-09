package ru.mirea.practice.s21k0647;

import java.util.Scanner;

public final class Punkt1 {
    private Punkt1() {

    }

    public static String rec(int n, String arr, int k) {
        if (k <= n && arr.length() < n) {
            String s = String.valueOf(k);
            if (arr.length() + k - n <= 0) {
                arr += s.repeat(k);
            } else {
                int m = arr.length() + k - n + 1;
                arr += s.repeat(m);
            }
            return rec(n, arr, k + 1);
        }
        return arr;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String []s = rec(n, "", 1).split("");
            for (String x: s) {
                System.out.print(x + " ");
            }
        }


    }
}
