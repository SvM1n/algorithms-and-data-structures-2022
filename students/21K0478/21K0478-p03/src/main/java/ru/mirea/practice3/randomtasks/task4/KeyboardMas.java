package ru.mirea.practice3.randomtasks.task4;

import java.util.Scanner;

abstract class KeyboardMas {
    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            n = sc.nextInt();
            while (n < 0) {
                n = sc.nextInt();
                System.out.println("Enter correct value of the massive size");
            }


            int[] randmas = new int[n];
            for (int i = 0; i < randmas.length; i++) {
                randmas[i] = rnd(0, n);
            }
            for (int i : randmas) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
            for (int randma : randmas) {
                if (randma % 2 == 0) {
                    System.out.print(randma + " ");
                }
            }

        }
    }
}
