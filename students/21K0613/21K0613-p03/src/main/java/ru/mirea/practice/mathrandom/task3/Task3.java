package ru.mirea.practice.mathrandom.task3;

import java.util.concurrent.ThreadLocalRandom;

abstract class Task3 {

    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i <= 3; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(10, 100);
            System.out.print(array[i] + "\t");
        }
        System.out.println();

        for (int j = 1; j <= 3; j++) {
            if (array[j - 1] > array[j]) {
                System.out.println("Массив не явл. возрастающей посл-тью");
                System.exit(0);
            }
        }
        System.out.println("Массив явл. возрастающей посл-тью");
    }
}
