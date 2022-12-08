package ru.mirea.practice.task6;

public abstract class Recursion {
    public static String solve(int n, int i) {
        if (n < 2) {
            return "NO";
        } else if (n == 2) {
            return "YES";
        } else if (n % i == 0) {
            return "NO";
        } else if (i < n / 2) {
            return solve(n, i + 1);
        } else {
            return "YES";
        }
    }
}
