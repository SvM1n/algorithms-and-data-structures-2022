package ru.mirea.practice.program10;

public final class Reversenumber {
    private Reversenumber() {
    }

    public static int recursion(int n, int m) {
        if (n != 0) {
            return recursion(n / 10, m * 10 + n % 10);
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(recursion(123, 0));
    }
}
