package ru.mirea.practice;

public final class Factorial {

    private Factorial() {
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println(fact(x));
    }

    public static int fact(int x) {
        if (x > 1) {
            return x * fact(x - 1);
        } else {
            return 1;
        }
    }
}