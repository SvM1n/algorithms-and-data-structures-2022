package ru.mirea.practice.task4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            Random rand = new Random();
            int n = 0;
            do {
                System.out.println("Enter the length of the array ");
                n = in.nextInt();
            } while (n <= 0);
            int[] arrayFirst = new int[n];
            ArrayList<Integer> arraySecond = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arrayFirst[i] = rand.nextInt(n);
                if (arrayFirst[i] % 2 == 0) {
                    arraySecond.add(arrayFirst[i]);
                }
                System.out.print(arrayFirst[i] + " ");
            }
            System.out.println();
            for (int i : arraySecond) {
                System.out.print(i + " ");
            }

        }
    }

}
