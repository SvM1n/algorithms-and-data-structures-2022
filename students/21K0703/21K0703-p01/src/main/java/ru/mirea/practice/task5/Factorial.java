package ru.mirea.practice.task5;

abstract class Factorial {
    public static int factor(int a) {
        int sum = 1;
        for (int i = 1; i <= a; i++) {
            sum *= i;
        }
        return sum;
    }
}
