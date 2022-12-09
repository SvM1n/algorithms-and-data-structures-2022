package ru.mirea.practice.task3;

/* Задание Максимум последовательности
Дана последовательность натуральных чисел (одно число в строке),
завершающаяся числом 0. Определите наибольшее значение числа в этой
последовательности.
Функция получает данные, считывая их с клавиатуры */

import java.util.Scanner;

public final class Task3 {

    private Task3() {
    }

    public static int recursionFunc() {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            if (n != 0) {
                return Math.max(n, recursionFunc());
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(recursionFunc());
    }
}
