package ru.mirea.practice.task7;

public abstract class NumberMultiplies {

    public static String recursion(Integer n, Integer k) {
        if (k > n / 2) {
            return n.toString() + " ";
        }
        if (n % k == 0) {
            return k.toString() + " " + recursion(n / k, k) + " ";
        } else {
            return recursion(n, ++k);

        }

    }

    public static void main(String[] args) {
        System.out.println(recursion(100, 2));
    }
}
