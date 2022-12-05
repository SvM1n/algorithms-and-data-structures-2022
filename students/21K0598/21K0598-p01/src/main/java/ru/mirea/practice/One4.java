package ru.mirea.practice;

abstract class One4 {
    public static void main(String[] args) {
        float res;
        for (int i = 1; i < 11; i++) {
            res = 1 / (float)i;
            System.out.printf("%.2f", res);
            System.out.print(' ');
        }
    }
}
