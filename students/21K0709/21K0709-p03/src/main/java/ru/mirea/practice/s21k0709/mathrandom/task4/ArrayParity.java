package ru.mirea.practice.s21k0709.mathrandom.task4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public abstract class ArrayParity {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int j = 0;
            do {
                System.out.println("Введите кол-во элементов массива: ");
                if (sc.hasNextInt()) {
                    j = sc.nextInt(); //считывает целое число из поток ввода и сохраняет в переменную
                }
            } while (j <= 0);
            int[] array = new int[j];
            Random rand = new Random();
            for (int i = 0; i < j; i++) {
                array[i] = 1 + rand.nextInt(20); // рандомное число в массиве до 20 вкл
            }
            ArrayList<Integer> arraylist = new ArrayList<Integer>();
            for (int i : array) {
                System.out.print(i + " ");
                if (i % 2 == 0) {
                    arraylist.add(i);
                }

            }
            System.out.println();
            System.out.println("Только четные элементы: ");
            for (Integer i : arraylist) {
                System.out.print(i + " ");
            }
        }
    }
}
