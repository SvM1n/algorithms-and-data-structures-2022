package ru.mirea.practice.s21k0709.task1;

//2. Задание от 1 до n
//Дано натуральное число n. Выведите все числа от 1 до n

public abstract class Naturalnumbers {
    public static int numbers(int i, int n) {
        if (i == n) {
            System.out.println(n);
            return i;
        }
        System.out.println(i);
        return numbers(i + 1,n);
    }
}
