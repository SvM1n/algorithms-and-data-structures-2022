package ru.mirea.practice.task3;

abstract class IntervalAB {
    public static String recursion(int a, int b) {
        if (a == b) {
            return a + "";
        }
        if (a > b) {
            b++;
            return recursion(a, b) + " " + (b - 1);

        } else {
            b--;
            return recursion(a,b) + " " + (b + 1);
        }
    }

    public static void main(String[] args) {
        System.out.print(recursion(100, 3));
    }
}
