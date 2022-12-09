package ru.mirea.practice.task15;

public abstract class FromRightToLeft {
    public static int recursion(int n) {
        if (n < 10) {
            return n;
        } else {
            System.out.print(n % 10 + " ");
            return recursion(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(6932)); // вызов рекурсивной функции
    }
}
