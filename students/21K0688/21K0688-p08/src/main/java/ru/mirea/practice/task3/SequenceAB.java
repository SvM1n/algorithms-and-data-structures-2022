package ru.mirea.practice.task3;

public abstract class SequenceAB {
    public static String recursion(int a, int b) {
        if (a == b) {
            return a + "";
        } else if (a > b) {
            b++;
            return recursion(a, b) + " " + (b - 1);
        } else {
            b--;
            return recursion(a, b) + " " + (b + 1);
        }
    }

    public static void main(String[] args) {
        System.out.print(recursion(3, 9));
    }
}
