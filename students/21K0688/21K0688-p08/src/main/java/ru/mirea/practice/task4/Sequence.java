package ru.mirea.practice.task4;

public abstract class Sequence {
    public static int recursion(int len, int d, int k, int s) {
        if (len == k) {
            if (d == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c;
        if (len == 0) {
            c = 1;
        } else {
            c = 0;
        }
        int result = 0;
        for (int i = c; i < 10; i++) {
            result += recursion(len + 1, d + i, k, s);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(recursion(1, 0, 3, 15));
    }

}