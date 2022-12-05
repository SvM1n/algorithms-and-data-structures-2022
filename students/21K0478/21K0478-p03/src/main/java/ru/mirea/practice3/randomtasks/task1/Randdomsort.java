package ru.mirea.practice3.randomtasks.task1;

import java.util.Arrays;
import java.util.Random;

abstract class Randdomsort {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] randmas = new int[10];
        for (int i = 0; i < randmas.length; i++) {
            randmas[i] = rand.nextInt(1000);
        }
        Arrays.sort(randmas);
        for (int i : randmas) {
            System.out.print(i + " ");

        }
        double[] randmas2 = new double[10];
        System.out.print('\n');
        for (int i = 0; i < randmas2.length; i++) {
            randmas2[i] = Math.random();
        }
        Arrays.sort(randmas2);
        for (double i : randmas2) {
            System.out.print(i + " ");

        }
    }
}
