package ru.mirea.practice.n1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

abstract class Array {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> a = new ArrayList<Integer>(n);
        System.out.println("Math: ");
        for (int i = 0; i < n; i++) {
            a.add((int) (Math.random() * 10));
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
        Collections.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a.get(i) + " ");
        }
        System.out.println("\nRandom: ");
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            a.set(i, r.nextInt(10));
            System.out.print(a.get(i) + " ");
        }
    }
}
