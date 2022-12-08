package ru.mirea.practice.mathrandom.task1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

abstract class Task1 {

    public static void printer(double[] array) {
        System.out.print("Ваш массив:\t");
        for (double num : array) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Введите количество чисел");
        Scanner scn = new Scanner(System.in);
        try {
            int counter = 0;
            if (scn.hasNextInt()) {
                counter = scn.nextInt();
            }
            double[] array = new double[counter];

            System.out.println("генерация с помощью класса Random");
            Random rand = new Random();
            for (int i = 0; i < counter; i++) {
                double randNumber = rand.nextDouble();
                array[i] = randNumber;
            }
            printer(array);

            System.out.println("Отсортированный массив");
            Arrays.sort(array);
            printer(array);


            System.out.println("Генерация с помощью класса Math");
            double[] array1 = new double[counter];
            for (int i = 0; i < counter; i++) {
                array1[i] = Math.random();
            }
            printer(array1);
            System.out.println("Отсортированный массив");
            Arrays.sort(array1);
            printer(array1);
        } catch (InputMismatchException e) {
            System.out.println("Error");
            scn.nextInt();
        } finally {
            scn.close();
        }
    }
}
