package ru.mirea.practice.n1;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            System.out.println(rec(n));
        } catch (InputMismatchException e) {
            System.out.println("Error");
            sc.nextInt();
        } finally {
            sc.close();
        }
    }

    public static String rec(int n) {
        int s = 0;
        int j = 0;
        if (n == 1) {
            return "1";
        } else {
            for (int i = 1; s < n; i++) {
                s += i;
                j = i;
            }
            return rec(--n) + " " + j;

        }
    }
}
