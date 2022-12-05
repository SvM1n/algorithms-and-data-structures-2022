package ru.mirea.practice.solutiontask4;

import java.util.Random;
import java.util.Scanner;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        int temp;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите число");
            temp = sc.nextInt();
            while (temp < 1) {
                System.out.println("Введите число");
                temp = sc.nextInt();
            }
        }
        Random rand = new Random();
        int[] mass = new int[temp];
        int count = 0;
        for (int i = 0; i < temp; i++) {
            mass[i] = rand.nextInt(temp);
            System.out.print(mass[i] + " ");
            if (mass[i] % 2 == 0) {
                count++;
            }
        }
        System.out.print('\n');
        int[] odd = new int[count];
        int used = 0;
        for (int i = 0; i < temp; i++) {
            if (mass[i] % 2 == 0) {
                odd[used] = mass[i];
                System.out.print(odd[used] + " ");
                used++;
            }
        }
    }
}
