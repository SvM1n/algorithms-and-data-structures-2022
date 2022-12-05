package ru.mirea.practice.s21k0627;

abstract class Task4 {
    public static void main(String[] args) {
        System.out.println("the first 10 terms of the harmonic series:");
        for (double i = 1; i < 11; i++) {
            double num = 1.0 / i;
            System.out.printf("%.2f; ", num);
        }
    }
}