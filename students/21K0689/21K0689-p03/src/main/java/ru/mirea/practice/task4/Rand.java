package ru.mirea.practice.task4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public abstract class Rand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Random rand = new Random();
            while (!scanner.hasNextInt()) {
                if (scanner.nextInt() < 5) {
                    System.out.println("Try again");
                }
                scanner.next();
            }
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(n + 1);
            }
            System.out.println(Arrays.toString(array));
            ArrayList<Integer> evenArray = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 == 0 && array[i] != 0) {
                    evenArray.add(array[i]);
                }
            }
            System.out.println(evenArray);
        } finally {
            scanner.close();
        }
    }
}

