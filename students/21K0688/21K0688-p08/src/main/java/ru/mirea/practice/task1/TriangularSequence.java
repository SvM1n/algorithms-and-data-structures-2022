package ru.mirea.practice.task1;

public abstract class TriangularSequence {
    public static String recursion(int n) {
        int cnt = 0;
        int cur = 0;
        if (n == 1) {
            return "1";
        } else {
            for (int i = 1; cnt < n; i++) {
                cnt += i;
                cur = i;
            }
            return recursion(--n) + " " + cur;

        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(10));
    }
}
