package ru.mirea.workeight.task5;

public final class Main {
    private Main() {
    }

    public static int numbersSum(int n) {
        if (n / 10 > 0) {
            return n % 10 + numbersSum(n / 10);
        } else {
            return n % 10;
        }
    }

    public static void main(String[] args) {
        int n = 54763254;
        System.out.println(numbersSum(n));
    }
}
