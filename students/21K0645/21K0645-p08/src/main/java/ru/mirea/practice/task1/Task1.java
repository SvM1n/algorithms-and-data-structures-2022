package ru.mirea.practice.task1;

/* Задание Цифры числа справа налево
Дано натуральное число N. Выведите все его цифры по одной, в обратном
порядке, разделяя их пробелами или новыми строками.
При решении этой задачи нельзя использовать строки, списки, массивы (ну
и циклы, разумеется). Разрешена только рекурсия и целочисленная арифметика. */

public final class Task1 {

    private Task1() {
    }

    private static void recursionFunc(int number) {
        if (number > 0) {
            System.out.println(number % 10);
            recursionFunc(number / 10);
        }
    }

    public static void main(String[] args) {
        recursionFunc(123456789);
    }
}
