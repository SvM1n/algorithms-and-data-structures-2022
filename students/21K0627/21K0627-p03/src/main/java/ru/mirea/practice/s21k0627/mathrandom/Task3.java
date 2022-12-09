package ru.mirea.practice.s21k0627.mathrandom;

import java.util.Random;

public abstract class Task3 {
    public static void increasing(Integer[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                System.out.println("array doesn't increase");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("array increase");
        }
    }

    public static void main(String[] args) {
        Integer [] array = new Integer[4];
        Random rand = new Random();
        for (int i = 0; i < (array.length); i++) {
            array[i] = 10 + rand.nextInt(89);
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        increasing(array);
    }
}
