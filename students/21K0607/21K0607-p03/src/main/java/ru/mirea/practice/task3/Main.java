package ru.mirea.practice.task3;

import java.util.Random;

public abstract class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(89) + 10;
            System.out.print(array[i] + " ");
        }
        System.out.println(increase(array));
    }

    public static String increase(int[] array) {
        boolean flag = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                flag = false;
                break;
            }
        }
        return flag == true ? "Increasing sequence" : "Non Increasing sequence";
    }
}
