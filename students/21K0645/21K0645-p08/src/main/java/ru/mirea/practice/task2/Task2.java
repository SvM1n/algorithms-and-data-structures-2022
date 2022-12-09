package ru.mirea.practice.task2;

/* Задание Количество элементов, равных максимуму
Дана последовательность натуральных чисел (одно число в строке),
завершающаяся числом ноль. Определите, какое количество элементов этой
последовательности, равны ее наибольшему элементу.
Функция получает данные, считывая их с клавиатуры, а не получая их в виде параметра.  */

import java.util.Scanner;

public final class Task2 {

    private Task2() {
    }

    public static void recursionFunc(int maxNum, int counter) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            if (n > 0) {
                if (n > maxNum) {
                    recursionFunc(n, 1);
                } else if (n == maxNum) {
                    recursionFunc(maxNum, ++counter);
                } else {
                    recursionFunc(maxNum, counter);
                }
            } else {
                System.out.println(counter);
            }
        }
    }

    public static void main(String[] args) {
        recursionFunc(0, 0);
    }
}