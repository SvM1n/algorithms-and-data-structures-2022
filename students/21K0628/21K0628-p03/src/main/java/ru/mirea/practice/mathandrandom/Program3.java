package ru.mirea.practice.mathandrandom;

import java.util.Random;

public final class Program3 {
    private Program3() {
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(89) + 10;
            System.out.print(array[i] + " ");
        }
        int flag = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                flag = 1;
            } else {
                flag = 0;
            }
        }
        if (flag == 1) {
            System.out.println("\nStrictly increasing sequence");
        } else {
            System.out.println("\nNot Strictly increasing sequence");
        }
    }
}