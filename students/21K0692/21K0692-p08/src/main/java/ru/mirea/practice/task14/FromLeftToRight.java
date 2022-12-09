package ru.mirea.practice.task14;

public abstract class FromLeftToRight {
    public static String recursion(int n) {
        if (n < 10) {
            return Integer.toString(n);
        } else {
            return recursion(n / 10) + "\n" + n % 10;
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(6932));
    }
}
