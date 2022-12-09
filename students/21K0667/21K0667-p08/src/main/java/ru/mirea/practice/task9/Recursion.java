package ru.mirea.practice.task9;

public abstract class Recursion {
    public static int solve(int zeros, int one) {
        if (zeros > one + 1) {
            return 0;
        }
        if (zeros == 0 || one == 0) {
            return 1;
        }

        return solve(zeros, one - 1) + solve(zeros - 1, one - 1);
    }
}
