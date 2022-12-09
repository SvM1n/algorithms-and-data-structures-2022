package ru.mirea.practice.program12;

import java.util.Scanner;

public final class Oddnumber {
    private Oddnumber() {
    }

    public static void recursion() {
        try (Scanner sc = new Scanner(System.in)) {
            while (!sc.hasNextInt()) {
                System.out.println("Invalid value entered");
                sc.next();
            }
            int foo1 = sc.nextInt();
            if (foo1 > 0) {
                if (foo1 % 2 == 1) {
                    System.out.println(foo1);
                    recursion();
                } else {
                    recursion();
                }
            } else {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        recursion();
    }
}
