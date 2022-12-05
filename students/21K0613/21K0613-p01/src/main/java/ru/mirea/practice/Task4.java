package ru.mirea.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел:\t");
        Scanner scn = new Scanner(System.in);
        try {
            int numCount = 0;

            if (scn.hasNextInt()) {
                numCount = scn.nextInt();
            }
            int[] array = new int[numCount];

            int counter = 0;
            int num = 0;
            int sum = 0;
            System.out.print("Начинайте вводить числа:\t");
            while (counter < numCount) {

                if (scn.hasNextInt()) {
                    num = scn.nextInt();
                }
                sum += num;
                array[counter++] = num;
            }
            int min;
            int max;
            min = max = array[0];
            for (int i = 0; i < numCount; i++) {

                if (array[i] < min) {
                    min = array[i];
                }

                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println("Сумма чисел:\t" + sum + "\n");
            System.out.println("Максимальное число:\t" + max + "\n" + "Минимальное число:\t" + min);
        } catch (InputMismatchException e) {
            System.out.println("Error");
            scn.nextInt();
        } finally {
            scn.close();
        }
    }
}
