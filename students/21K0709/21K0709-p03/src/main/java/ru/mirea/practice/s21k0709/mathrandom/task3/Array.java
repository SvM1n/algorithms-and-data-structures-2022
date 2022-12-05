package ru.mirea.practice.s21k0709.mathrandom.task3;

import java.util.Random;

public abstract class Array {
    public static void vozr(Integer[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                System.out.println("Последовательность не является строго возрастающей");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Последовательность является строго возрастающей");
        }
    }

    public static void main(String[] args) {
        Integer [] array = new Integer[2];
        Random rand = new Random();
        for (int i = 0; i < (array.length); i++) {
            array[i] = 10 + rand.nextInt(90);
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        vozr(array);
    }
}
