package ru.mirea.practice.task5;

public abstract class Recursion {
    public static int solve(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + solve(n / 10);
        }
    }
}
