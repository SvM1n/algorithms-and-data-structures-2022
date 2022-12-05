package ru.mirea.practice.task13;

import java.util.Scanner;

public abstract class OddIndex {

    public static void recursion() {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            if (n != 0) {
                int m = in.nextInt();
                System.out.println(m);
                if (m != 0) {
                    recursion();
                }
            }
        }
    }

    public static void main(String[] args) {
        recursion();
    }
}
