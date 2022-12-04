package ru.mirea.practice;

public abstract class Task4 {
    public static double factorial(double n) {
        double s = 1;
        while (n > 0) {
            s = s * n;
            n--;
        }
        n = s;
        return s;
    }
}
