package ru.mirea.practice.task7;

public abstract class Recursion {
    public static void solve(int n, int t) {
        if (t > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % t == 0) {
            System.out.println(t);
            solve(n / t, t);
        } else {
            solve(n, ++t);
        }
    }
}
