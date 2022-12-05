package ru.mirea.practice.s21k0709.task3;

//5. Задание Сумма цифр числа
//        Дано натуральное число N. Вычислите сумму его цифр. При решении этой
//        задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется)

public abstract class SumNum {
    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumDigits(n / 10);
    }
}
