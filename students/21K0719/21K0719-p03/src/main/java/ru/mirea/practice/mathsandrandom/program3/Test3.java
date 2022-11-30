package ru.mirea.practice.mathsandrandom.program3;

import java.util.Random;

abstract class Test3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        boolean isIncreasing = true;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(89) + 10;
            System.out.print(arr[i] + " ");
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                isIncreasing = false;
                break;
            }
        }
        System.out.print("\n");
        if (isIncreasing) {
            System.out.print("+");
        } else {
            System.out.print("-");
        }
    }
}
