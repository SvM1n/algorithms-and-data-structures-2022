package ru.mirea.practice.n4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Keyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>(n);
            for (int i = 0; i < n; i++) {
                a.add((int) (Math.random() * n));
                System.out.print(a.get(i) + " ");
            }
            ArrayList<Integer> b = new ArrayList<Integer>(n);
            for (int i = 0; i < n; i++) {
                if (a.get(i) % 2 == 0) {
                    b.add(a.get(i));
                }
            }
            System.out.println();
            for (int i :
                    b) {
                System.out.print(i + " ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error");
            scanner.nextInt();
        } finally {
            scanner.close();
        }
    }
}
