package ru.mirea.practice.n3;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class AandB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(list(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Error");
            sc.nextInt();
        } finally {
            sc.close();
        }
    }

    public static String list(int a, int b) {
        int c = 0;
        if (a < b) {
            c = b;
            if (c == a) {
                return String.valueOf(a);
            } else {
                c = b;
            }
            return list(a, --b) + " " + c;
        } else {
            c = b;
            if (c == a) {
                return String.valueOf(a);
            } else {
                c = b;
            }
            return list(a,++b) + " " + c;
        }
    }
}