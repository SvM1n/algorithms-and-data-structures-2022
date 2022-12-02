package ru.mirea.workeight.task7;

public final class Main {
    private Main() {
    }

    public static void check(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
        } else if (n % k == 0) {
            System.out.println(k);
            check(n / k, k);
        } else {
            check(n, k + 1);
        }
    }

    public static void main(String[] args) {
        int n = 27;
        int k = 2;
        check(n, k);
    }
}
