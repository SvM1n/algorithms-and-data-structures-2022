package ru.mirea.practice.s21k0709;

import java.util.Scanner;

//Вторая задача 1 практической работы
public abstract class Input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int j = 0;
            do {
                System.out.println("Введите длину масссива:");
                if (sc.hasNextInt()) {
                    j = sc.nextInt(); //считывает целое число из поток ввода и сохраняет в переменную
                }
            } while (j < 0);
            int i;
            int col = 0;
            int[] mas = new int[j];
            while (col < mas.length) {
                i = sc.nextInt();
                mas[col] = i;
                col++;

            }
            int max = -10000;
            int min = 10000;
            int sum = 0;
            for (int k: mas) {
                if (mas[k] < min) {
                    min = mas[k];
                } else {
                    max = mas[k];
                }
                sum += mas[k];
                System.out.print(mas[k]);
                System.out.print(" ");
            }
            System.out.println();
            System.out.print("Сумма элементов массива: ");
            System.out.println(sum);
            System.out.print("Макс элемент массива: ");
            System.out.println(max);
            System.out.print("Мин элемент массива: ");
            System.out.println(min);
        }
    }
}

