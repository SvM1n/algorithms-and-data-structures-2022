package ru.mirea.practice;

public final class Array {

    private Array() {
    }

    public static void main(String[] args) {
        try {
            int[] array = {4, 85, 29, 2, 4, 4};

            int sum = 0;
            double average;

            for (int j : array) {
                sum = sum + j;
            }
            average = (double) sum / array.length;

            System.out.print("sum = " + sum + "\naverage = " + average);
        } catch (IncompatibleClassChangeError e) {
            System.out.println("Error");
        }
    }
}

