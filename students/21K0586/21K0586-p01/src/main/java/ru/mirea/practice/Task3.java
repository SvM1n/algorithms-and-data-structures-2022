package ru.mirea.practice;

public abstract class Task3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            String str = String.format("%.2f", (double) 1 / i);
            System.out.print(str + " ");
        }
        System.out.println("");
        double t = factorial(5);
        System.out.println(t);
    }

    public static double factorial(double n) {
        double s = 1;
        while (n > 0) {
            s = s * n;
            n--;
        }
        n = s;
        return s;
    }
}
