package ru.mirea.practice.mathandrandom.task1;

import java.util.Random;

abstract class Task1 {
    public static void main(String[] args) {
        double[] first = new double[5];
        Random rand = new Random();
        for (int i = 0; i < first.length; i++) {
            first[i] = rand.nextDouble();
            System.out.printf("%.2f ", first[i]);
        }
        System.out.println("\nОтсортированный:");
        for (int i = 0; i < first.length; i++) {
            double x = first[i];
            int j = i - 1;
            while (j >= 0 && x < first[j]) {
                first[j + 1] = first[j];
                j--;
            }
            first[j + 1] = x;
        }
        for (double v : first) {
            System.out.printf("%.2f ", v);
        }
        System.out.println("\n----------------------");
        double[] second = new double[5];
        for (int i = 0; i < second.length; i++) {
            second[i] = Math.random() * 5;
            System.out.printf("%.2f ", second[i]);
        }
        System.out.println("\nОтсортированный:");
        for (int i = 0; i < second.length; i++) {
            double x = second[i];
            int j = i - 1;
            while (j >= 0 && x < second[j]) {
                second[j + 1] = second[j];
                j--;
            }
            second[j + 1] = x;
        }
        for (double v : second) {
            System.out.printf("%.2f ", v);
        }

    }
}
