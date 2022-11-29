package ru.mirea.practice.n2;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Nature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            System.out.println(out(n));
        } catch (InputMismatchException e) {
            System.out.println("Error");
            sc.nextInt();
        } finally {
            sc.close();
        }
    }

    public static String out(int n) {
        int i = 0;
        if (n == 1) {
            return "1";
        } else {
            i = n;
        }
        return out(--n) + " " + i;
    }
}
