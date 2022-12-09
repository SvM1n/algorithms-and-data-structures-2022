package ru.mirea.practice.task1;


import java.util.Random;

public abstract class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] firstArr = new double[10];
        System.out.println("First array:");
        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = rand.nextDouble();
            System.out.print(firstArr[i] + " ");
        }
        for (int i = 0; i < firstArr.length; i++) {
            double temp = 0;
            for (int j = 0; j < firstArr.length; j++) {
                if (firstArr[i] > firstArr[j]) {
                    temp = firstArr[j];
                    firstArr[j] = firstArr[i];
                    firstArr[i] = temp;
                }
            }
        }
        System.out.println("\nSorted first array: ");
        for (double i : firstArr) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n");
        System.out.println("Second array: ");
        double[] secondArr = new double[10];
        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = Math.random() * 1000;
            System.out.print(secondArr[i] + " ");
        }
        for (int i = 0; i < secondArr.length; i++) {
            double temp = 0;
            for (int j = 0; j < secondArr.length; j++) {
                if (secondArr[i] > secondArr[j]) {
                    temp = secondArr[j];
                    secondArr[j] = secondArr[i];
                    secondArr[i] = temp;
                }
            }
        }
        System.out.println("\nSorted second array: ");
        for (double i : secondArr) {
            System.out.print(i + " ");
        }

    }
}
