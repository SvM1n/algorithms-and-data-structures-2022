package ru.mirea.practice.program11;

import java.util.Scanner;

public final class CountOne {
    private CountOne() {
    }

    public static int recursion() {
        try (Scanner sc = new Scanner(System.in)) {
            while (!sc.hasNextInt()) {
                System.out.println("Invalid value entered");
                sc.next();
            }
            int foo1 = sc.nextInt();
            while (!sc.hasNextInt()) {
                System.out.println("Invalid value entered");
                sc.next();
            }
            int foo2 = sc.nextInt();
            if (foo1 == 1) {
                if (foo2 == 1) {
                    return recursion() + foo1 + foo2;
                } else {
                    while (!sc.hasNextInt()) {
                        System.out.println("Invalid value entered");
                        sc.next();
                    }
                    int foo3 = sc.nextInt();
                    if (foo3 == 1) {
                        return recursion() + foo1 + foo2 + foo3;
                    } else {
                        return foo1 + foo2 + foo3;
                    }
                }

            } else {
                if (foo2 == 1) {
                    return recursion() + foo1 + foo2;
                } else {
                    return foo1 + foo2;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion());
    }
}
