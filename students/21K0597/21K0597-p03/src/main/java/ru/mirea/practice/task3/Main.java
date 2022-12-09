package ru.mirea.practice.task3;

import java.util.Random;

public abstract class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(90) + 10;
        }

        for (int i : array) {
            System.out.println(i);
        }

        boolean check = false;
        for (int i = 1; i < 4; i++) {
            if (array[i] <= array[i - 1]) {
                check = true;
            } else {
                check = false;
                break;
            }
        }
        System.out.println(check ? "Возрастающая последовательность" : "Невозрастающая последовательность");
    }
}
