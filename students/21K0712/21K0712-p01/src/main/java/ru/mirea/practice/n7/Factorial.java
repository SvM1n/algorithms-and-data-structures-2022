package ru.mirea.practice.n7;

abstract class Factorial {
    public static void main(String[] args) {
        System.out.println(Factorial.count(4));
    }

    static int count(int n) {
        int ans = 1;
        int i = 2;
        while (i <= n) {
            ans *= i;
            i++;
        }
        return ans;
    }
}
