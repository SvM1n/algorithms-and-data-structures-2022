package ru.mirea.practice.n2to4;

import java.util.ArrayList;

abstract class Four {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>(4);
        for (int i = 0; i < 4; i++) {
            a.add((int) (Math.random() * 100));
            System.out.print(a.get(i) + " ");
        }
        int res = 1;
        for (int i = 0; i < 3; i++) {
            if (a.get(i) < a.get(i + 1)) {
                res *= 1;
            } else {
                res *= 0;
            }
        }
        if (res == 1) {
            System.out.println("Increasing");
        } else {
            System.out.println("Not increasing");
        }
    }
}
