package ru.mirea.workeight.task6;

public final class Main {
    private Main() {
    }

    public static boolean check(int n, int k) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % k == 0) {
            return false;
        } else if (k < n / 2) {
            return check(n, k + 1);
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int n = 1723;
        int k = 2;
        if (check(n, k)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
