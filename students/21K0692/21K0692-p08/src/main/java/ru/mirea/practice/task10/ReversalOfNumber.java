package ru.mirea.practice.task10;

public abstract class ReversalOfNumber {
    public static int recursion(int n, int i) {
        if (n != 0) {
            return recursion(n / 10, i * 10 + n % 10);
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(recursion(1365, 0));
    }
}
